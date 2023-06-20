package es.studium.Ejercicio4;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;


public class Ejercicio4
{

	Frame ventana = new Frame("Aficiones");
	
	Checkbox chkUno = new Checkbox("Correr");
	Checkbox chkDos = new Checkbox("Nadar");
	Checkbox chkTres = new Checkbox("Andar");
	Checkbox chkCuatro = new Checkbox("Leer");
	Checkbox chkCinco = new Checkbox("Ir al cine");
	Checkbox chkSeis = new Checkbox("Bailar");
	Checkbox chkSiete = new Checkbox("Fútbol");
	Checkbox chkOcho = new Checkbox("Tenis");
	Checkbox chkNueve = new Checkbox("Baloncesto");
	Checkbox chkDiez = new Checkbox("Deportes de vela");
	
	Button btnComprobar = new Button("Comprobar");
	
	
	
	Ejercicio4()
	{
		ventana.setLayout(new FlowLayout());
		
		ventana.add(chkUno);
		ventana.add(chkDos);
		ventana.add(chkTres);
		ventana.add(chkCuatro);
		ventana.add(chkCinco);
		ventana.add(chkSeis);
		ventana.add(chkSiete);
		ventana.add(chkOcho);
		ventana.add(chkNueve);
		ventana.add(chkDiez);
		
		ventana.add(btnComprobar);
		
		ventana.setLocationRelativeTo(null);
		ventana.setSize(400, 150);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio4();
	}

}
