package es.studium.tema4Ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class CuartoEjemplo
{
	Frame ventana = new Frame("Absoluto");
	Label lblEtiqueta = new Label("Nombre: ");
	TextField txtNombre = new TextField(20);
	Button btnAceptar = new Button("Aceptar");
	
	CuartoEjemplo()
	{
		ventana.setSize(300, 150); 
		ventana.setLocationRelativeTo(null); 
		ventana.setBackground(Color.LIGHT_GRAY);
		
		//No estamos utilizando el autoresponsive
		ventana.setLayout(null);
		
		//Con setBounds ajustamos tamaño de los campos
		ventana.add(lblEtiqueta);
		lblEtiqueta.setBounds(20, 35, 60, 30); //X, Y, Width, Height
		ventana.add(txtNombre); 
		txtNombre.setBounds(90, 40, 180, 20);
		ventana.add(btnAceptar);
		btnAceptar.setBounds(90, 70, 100, 35);
		
		ventana.setVisible(true);
		
	}
	public static void main(String[] args)
	{
	new CuartoEjemplo();
	}
	
}


