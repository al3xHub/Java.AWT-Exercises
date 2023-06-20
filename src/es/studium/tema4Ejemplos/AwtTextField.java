package es.studium.tema4Ejemplos;
import java.awt.*;
public class AwtTextField
{
	Frame ventana = new Frame("AwtTextField");
	// Crear un TextField con 20 de ancho
	TextField txtTexto = new TextField(20);
	public AwtTextField()
	{
	ventana.setLayout(new FlowLayout());
	ventana.add(txtTexto);
	txtTexto.requestFocus();
	ventana.setLocationRelativeTo(null);
	ventana.setSize(250,100);
	ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
	new AwtTextField();
	}
}
