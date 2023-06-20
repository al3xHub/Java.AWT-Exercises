package es.studium.tema4Ejemplos;
import java.awt.*;
public class AwtScrollbar
{
	Frame ventana = new Frame("AwtScrollbar");
	Scrollbar scrVertical = new Scrollbar(Scrollbar.VERTICAL);
	Scrollbar scrHorizontal = new Scrollbar(Scrollbar.HORIZONTAL);
	public AwtScrollbar()
	{
	ventana.setLayout(new BorderLayout());
	ventana.add("East", scrVertical);
	ventana.add("South", scrHorizontal);
	ventana.setLocationRelativeTo(null);
	ventana.setSize(150,150);
	ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
	new AwtScrollbar();
	}
}
