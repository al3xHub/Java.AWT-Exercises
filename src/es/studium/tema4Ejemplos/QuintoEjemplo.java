package es.studium.tema4Ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class QuintoEjemplo
{
	Frame ventana = new Frame("Grid Layout");
	Label lblEtiqueta = new Label("Nombre: ");
	TextField txtNombre = new TextField(20);
	Button btnAceptar = new Button("Aceptar");
	
	QuintoEjemplo()
	{
		ventana.setSize(300, 150); 
		ventana.setLocationRelativeTo(null); 
		ventana.setBackground(Color.LIGHT_GRAY);
		
		//ajustamos los componentes con 2 filas y 3 columnas
		ventana.setLayout(new GridLayout(2, 3));
		
		ventana.add(lblEtiqueta);
		ventana.add(txtNombre); 
		ventana.add(btnAceptar);
		
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new QuintoEjemplo();
	}

}
