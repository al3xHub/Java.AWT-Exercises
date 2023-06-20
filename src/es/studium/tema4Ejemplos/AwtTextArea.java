package es.studium.tema4Ejemplos;
import java.awt.*;
public class AwtTextArea
{
	Frame ventana = new Frame("AwtTextArea");
	// Crear un TextArea vacío con tamaño 5 filas y 20 columnas
	TextArea areaTexto = new TextArea("", 5, 20);
	public AwtTextArea()
	{
	ventana.setLayout(new FlowLayout());
	ventana.add(areaTexto);
	ventana.setLocationRelativeTo(null);
	ventana.setSize(200,200);
	ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
	new AwtTextArea();
	}
}
