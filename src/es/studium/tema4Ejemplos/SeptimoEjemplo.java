package es.studium.tema4Ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class SeptimoEjemplo
{

	Frame ventana = new Frame("GridBagLayout");
	
	Button btnBoton0 = new Button("Botón 0");
	Button btnBoton1 = new Button("Botón 1");
	Button btnBoton2 = new Button("Botón 2");
	Button btnBoton3 = new Button("Botón 3");
	Button btnBoton4 = new Button("Botón 4");
	Button btnBoton5 = new Button("Botón 5");
	Button btnBoton6 = new Button("Botón 6");
	Button btnBoton7 = new Button("Botón 7");
	Button btnBoton8 = new Button("Botón 8");
	Button btnBoton9 = new Button("Botón 9");
	
	GridBagLayout gridbag = new GridBagLayout();
	
	//crear restrincciones para asginar a los botones distintas "propiedades"
	GridBagConstraints gbc = new GridBagConstraints();
	
	
	
	SeptimoEjemplo()
	{
		ventana.setSize(300, 300);
		ventana.setLocationRelativeTo(null);
		ventana.setBackground(Color.gray);
		ventana.setLayout(gridbag);
		
		gbc.fill = GridBagConstraints.BOTH;
		
		gbc.weightx = 1.0; // que sea de ancho una columna
		
		gridbag.setConstraints(btnBoton0, gbc);
		ventana.add(btnBoton0);
		gridbag.setConstraints(btnBoton1, gbc);
		ventana.add(btnBoton1);
		gridbag.setConstraints(btnBoton2, gbc);
		ventana.add(btnBoton2);
		
		gbc.gridwidth = GridBagConstraints.REMAINDER; //que sea el último de la fila
		gridbag.setConstraints(btnBoton3, gbc);
		ventana.add(btnBoton3);
		
		gridbag.setConstraints(btnBoton4, gbc);
		ventana.add(btnBoton4);
		
		gbc.gridwidth = GridBagConstraints.RELATIVE; //que vuelva a ser otro más en la fila
		gridbag.setConstraints(btnBoton5, gbc);
		ventana.add(btnBoton5);
		
		gbc.gridwidth = GridBagConstraints.REMAINDER;//otra vez el último
		gridbag.setConstraints(btnBoton6, gbc);
		ventana.add(btnBoton6);
		
		gbc.gridwidth = 1; // que ocupe el ancho de una columna
		gbc.gridheight = 2;// que ocure el alto de dos filas
		gbc.weighty = 1.0; //tamaño relativo
		gridbag.setConstraints(btnBoton7, gbc);
		ventana.add(btnBoton7);
		
		gbc.gridwidth = GridBagConstraints.REMAINDER; //lo que quede de fila
		gbc.gridheight = 1; //Alto de 1 fila
		gridbag.setConstraints(btnBoton8, gbc);
		ventana.add(btnBoton8);
		
		gbc.gridwidth = GridBagConstraints.REMAINDER; //lo que quede de fila
		gbc.gridheight = 1; //Alto de 1 fila
		gridbag.setConstraints(btnBoton9, gbc);
		ventana.add(btnBoton9);
		
		ventana.setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		new SeptimoEjemplo();
	}

}
