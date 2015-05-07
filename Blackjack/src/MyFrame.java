import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {

	private JPanel figuras,botones,radioButtons;
	private FlowLayout flowlayout;
	private FileWriter filewriter;
	private PrintWriter printwriter;
	
	private int xs,ys,width,height;
	private String hex,color,figura;
	private JButton open;
	private JButton save;
	private JButton carta1;
	private JFileChooser chooser, chooser2;
	private String linea;
	private String camino;
	private PanelDibujo pd;

	

	public MyFrame(String name) {
		super(name);

		setSize(1400, 700);
		BorderLayout fl=new BorderLayout();
		Container c = getContentPane();
		c.setLayout(fl);
		pd=new PanelDibujo();
		open = new JButton("Open");
		open.addActionListener(this);
		save = new JButton("Save");
		save.addActionListener(this);
		c.add(pd,BorderLayout.CENTER);
	
		
		
		chooser = new JFileChooser();
		chooser.addActionListener(this);
		chooser2 = new JFileChooser();
		chooser2.addActionListener(this);
		flowlayout = new FlowLayout();
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		botones = new JPanel();
		botones.setLayout(flowlayout);
		botones.add(save);
		botones.add(open);
		
		this.add(botones, BorderLayout.NORTH);
		//this.add(pd, BorderLayout.CENTER);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		 if (e.getActionCommand() == "Open") {

			chooser.showOpenDialog(MyFrame.this);

		} else if (e.getSource() == chooser) {

			try {
				File file = chooser.getSelectedFile();
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);

				xs = Integer.parseInt(br.readLine());
				ys = Integer.parseInt(br.readLine());
				width = Integer.parseInt(br.readLine());
				height=Integer.parseInt(br.readLine());		
				color = br.readLine();
				figura = br.readLine();
			
				br.close();
				
				JOptionPane.showMessageDialog(this, "El archivo se cargo correctamente","El archivo se cargo correctamente", 1);
				System.out.println("El archivo se cargo correctamente");

			} catch (FileNotFoundException ex) {
				System.out.println(ex);
				JOptionPane.showMessageDialog(this, "Archivo no encontrado",
						"File not found", 2);
				System.out.println(ex);

			}

			catch (IOException exe) {
				System.out.println(exe);
				JOptionPane.showMessageDialog(this, "Excepcion de IO",
						"Excepcion de IO", 2);
				System.out.println(exe);

			}

			catch (NullPointerException m) {
				System.out.println(m);
				JOptionPane.showMessageDialog(this,
						"Ocurrio una excepcion", "Peligro", 2);
			}

			catch (Exception exes) {
				System.out.println(exes);
				JOptionPane.showMessageDialog(this, "Ocurrio un error",
						"Warning", 2);

			}

		} else if (e.getActionCommand() == "Save") {
			chooser2.showSaveDialog(MyFrame.this);

		} else if (e.getSource() == chooser2) {

			try {

				camino = chooser2.getSelectedFile().getAbsolutePath();
				File file = new File(camino);

				filewriter = new FileWriter(file);
				printwriter = new PrintWriter(filewriter);
				
				System.out.println("se guardo correctamente aqui esta la ruta: " + camino);
				JOptionPane.showMessageDialog(this,
						"Aqui esta tu ruta de archivo" + camino,
						"Se guardo correctamente", 1);

			} catch (IOException ex) {
				System.out.println(ex);
				JOptionPane.showMessageDialog(this,"Error al salvar, Excepcion de IO ", "Peligro", 2);
			} catch (Exception f) {
				System.out.println(f);
				JOptionPane.showMessageDialog(this, "Error al salvar","Peligro", 2);

			}

		}
	}

	
}