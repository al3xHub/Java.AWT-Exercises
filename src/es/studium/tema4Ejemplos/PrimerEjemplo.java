package es.studium.tema4Ejemplos;

import java.awt.Color;
import java.awt.Frame;

public class PrimerEjemplo
{
	Frame ventana = new Frame();
	
	PrimerEjemplo()
	{
		ventana.setSize(600, 300); //dar tamaño
		ventana.setLocationRelativeTo(null); // centrar al mostrar ventana
		ventana.setTitle("Este es el título"); //se puede poner el titulo de la ventana aquí o arriba donde pone "Este es el título"
		ventana.setBackground(Color.LIGHT_GRAY); //color de fondo
		ventana.setResizable(false); //evitar distorisionar la ventana
		/*
		 *  Es importante poner el set visible a lo ultimo ya que si mostramos esto antes de los parámetros que estamos ajustando de la ventana quizás 
		 *  no se muestran
		 */
		ventana.setVisible(true); //dar vivibilidad
	}
	public static void main(String[] args)
	{
		new PrimerEjemplo();
	}

}
