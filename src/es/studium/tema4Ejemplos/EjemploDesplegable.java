package es.studium.tema4Ejemplos;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class EjemploDesplegable
{
	Frame ventana = new Frame("Lista Desplegable");
	FlowLayout distribucion = new FlowLayout();
	
	Choice choLista = new Choice();
	String colores[] = {"seleccionar un color...", "Blanco", "Azul","Verde"};
	
	EjemploDesplegable()
	{
		ventana.setSize(250, 300);
		ventana.setLocationRelativeTo(null);
		ventana.setBackground(Color.gray);
		ventana.setLayout(distribucion);
		
		
		for(int i = 0; i<colores.length; i++)
		{
			choLista.add(colores[i]);
		}
		
		ventana.add(choLista);
		
		
		ventana.setVisible(true);
		 
	}
	
	public static void main(String[] args)
	{
		new EjemploDesplegable();
	}

}
