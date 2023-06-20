package es.studium.tema4Ejemplos;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class EjemploCheckBoxes
{
	Frame ventana = new Frame("Elección Múltiple");
	FlowLayout distribucion = new FlowLayout();
	
	Checkbox chkPrimavera = new Checkbox("Primavera");
	Checkbox chkVerano = new Checkbox("Verano");
	Checkbox chkOtono = new Checkbox("Otoño");
	Checkbox chkInvierno = new Checkbox("Invierno");
	
	Label lblMensaje = new Label("¿Qué estación te gusta más?");
	
	EjemploCheckBoxes()
	{
		ventana.setSize(250, 300);
		ventana.setLocationRelativeTo(null);
		ventana.setBackground(Color.gray);
		ventana.setLayout(distribucion);
		
		ventana.add(lblMensaje);
		
		ventana.add(chkInvierno);
		ventana.add(chkPrimavera);
		ventana.add(chkVerano);
		ventana.add(chkOtono);
		
		ventana.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new EjemploCheckBoxes();
	}

}
