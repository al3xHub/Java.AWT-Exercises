package es.studium.tema4Ejemplos;

import java.awt.*;
public class AwtGrid
{
Frame ventana = new Frame("AwtGrid");
Button btnBoton1 = new Button("1");
Button btnBoton2 = new Button("2");
Button btnBoton3 = new Button("3");
Button btnBoton4 = new Button("4");
Button btnBoton5 = new Button("5");
Button btnBoton6 = new Button("6");
public AwtGrid()
{
	
// Establecer la distribución con 3 filas y 2 columnas
	ventana.setLayout( new GridLayout( 3,2 ) );
	 ventana.add(btnBoton1);
	ventana.add(btnBoton2);
	ventana.add(btnBoton3);
	ventana.add(btnBoton4);
	ventana.add(btnBoton5);
	ventana.add(btnBoton6);
	ventana.setSize(200,200);
	ventana.setLocationRelativeTo(null);
	ventana.setVisible(true);
	}

	// Fin del Constructor
	public static void main(String[] args)
	{
	new AwtGrid();
	}
	// Fin del main
	}
	// Fin de la clase
