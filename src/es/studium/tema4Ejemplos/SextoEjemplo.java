package es.studium.tema4Ejemplos;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class SextoEjemplo
{
	Frame ventana = new Frame("Border Layout");
	
	Button btnNorte = new Button("Norte");
	Button btnSur = new Button("Sur");
	Button btnEste = new Button("Este");
	Button btnOeste = new Button("Oeste");
	Button btnCentro = new Button("Centro");
	
	//El panel ajusta un tamaño concreto
	Panel pnlUno = new Panel();
	Panel pnlDos = new Panel();
	Panel pnlTres = new Panel();
	Panel pnlCuatro = new Panel();
	Panel pnlCinco = new Panel();
	
	
	SextoEjemplo()
	{
		ventana.setSize(300, 150); 
		ventana.setLocationRelativeTo(null); 
		ventana.setBackground(Color.LIGHT_GRAY);
		ventana.setLayout(new BorderLayout());
		
		//Ajustamos el tamaño del panel al botón
		pnlUno.add(btnNorte);
		pnlDos.add(btnSur);
		pnlTres.add(btnEste);
		pnlCuatro.add(btnOeste);
		pnlCinco.add(btnCentro);
	
		//ajustamos en la ventana el botón con el tamaño del  panel
		ventana.add(pnlCinco, "Center");
		ventana.add(pnlUno, "North");
		ventana.add(pnlDos, "South");
		ventana.add(pnlTres, "East");
		ventana.add(pnlCuatro, "West");
		
		ventana.setVisible(true);
		
	
	}
	public static void main(String[] args)
	{
		new SextoEjemplo();
	}

}
