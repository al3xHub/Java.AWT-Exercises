package es.studium.tema4Ejemplos;

import java.awt.Color;
import java.awt.Frame;
import java.util.Random;

public class SegundoEjemplo
{
	Frame ventana;
	Color colores[] = {Color.green, Color.BLACK, Color.BLUE,
			Color.CYAN};
	
	Random aleatorio = new Random();
	
	SegundoEjemplo()
	{
		ventana = new Frame();
		ventana.setSize(300, 150); //dar tamaño
		//ventana.setLocationRelativeTo(null); // centrar al mostrar ventana
		ventana.setLocation(aleatorio.nextInt(1000), aleatorio.nextInt(800));
		ventana.setTitle("Este es el título"); //se puede poner el titulo de la ventana aquí o arriba donde pone "Este es el título"
		ventana.setBackground(colores[aleatorio.nextInt(colores.length)]); //color de fondo
		ventana.setResizable(false); //evitar distorisionar la ventana
		/*
		 *  Es importante poner el set visible a lo ultimo ya que si mostramos esto antes de los parámetros que estamos ajustando de la ventana quizás 
		 *  no se muestran
		 */
		ventana.setVisible(true); //dar vivibilidad
	}
	
	public static void main(String[] args)
	{
		final int CANTIDAD = 5;
		for(int i = 0; i < CANTIDAD; i++)
		{
			new SegundoEjemplo();
		}
	}

}
