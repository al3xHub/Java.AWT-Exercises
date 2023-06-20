package es.studium.tema4Ejemplos;

import java.awt.*;

public class AwtList
{
	Frame ventana = new Frame("AwtList");
	
	// Creación de una lista con 4 elementos visibles y que no
	// permite multiselección
	
	List lista = new List(4, false);
	public AwtList()
	{
	ventana.setLayout(new FlowLayout());
	lista.add("Blanco");
	lista.add("Rojo");
	lista.add("Azul");
	lista.add("Verde");
	lista.add("Amarillo");
	lista.add("Naranja");
	ventana.add(lista);
	ventana.setLocationRelativeTo(null);
	ventana.setSize(150,150);
	ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
	new AwtList();
	}
}
