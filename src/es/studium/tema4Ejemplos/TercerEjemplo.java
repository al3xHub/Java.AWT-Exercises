package es.studium.tema4Ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TercerEjemplo
{
	Frame ventana = new Frame();
	Label lblEtiqueta = new Label("Nombre: ");
	TextField txtNombre = new TextField(20);
	Button btnAceptar = new Button("Aceptar");
	
	TercerEjemplo()
	{
		ventana.setSize(400, 200); //dar tamaño
		ventana.setLocationRelativeTo(null); // centrar al mostrar ventana
		ventana.setTitle("Este es el título"); //se puede poner el titulo de la ventana aquí o arriba donde pone "Este es el título"
		ventana.setBackground(Color.LIGHT_GRAY); //color de fondo
		//ventana.setResizable(false); //evitar distorisionar la ventana
		
		
		ventana.add(lblEtiqueta);//añadir etiqueta
		ventana.add(txtNombre); //añadir campo texto
		ventana.add(btnAceptar);// añadir botón
		
		/*
		 * Estos componentes se añaden uno encima de otro pero lo que queremos
		 * es distribuirlos en la misma ventana, para ello...
		 */
		ventana.setLayout(new FlowLayout());
		
		/*
		 *  Es importante poner el set visible a lo ultimo ya que si mostramos esto antes de los parámetros que estamos ajustando de la ventana quizás 
		 *  no se muestran
		 */
		ventana.setVisible(true); //dar vivibilidad
	}

	public static void main(String[] args)
	{
		new TercerEjemplo();
	}

}
