/*import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PanelControles extends JPanel implements ActionListener {
private PanelDibujo pd;
private JFileChooser chooser, chooser2;
private String linea;
private String camino;
private FlowLayout flowlayout;
private FileWriter filewriter;
private PrintWriter printwriter;


public PanelControles(PanelDibujo pd){
	super();
	this.pd=pd;
	
	FlowLayout fl=new FlowLayout();
	setLayout(fl);
	
}
public void actionPerformed(ActionEvent e) {
	
	 if (e.getActionCommand() == "abrir") {

		chooser.showOpenDialog(PanelControles.this);

	} else if (e.getSource() == chooser) {

		try {
			File file = chooser.getSelectedFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			br.close();
			//PanelDibujo.setValores();
			
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
		chooser2.showSaveDialog(PanelControles.this);

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
*/