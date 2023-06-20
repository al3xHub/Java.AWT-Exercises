package es.studium.Ejercicio2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio2
{
	Frame ventana = new Frame("Conversión de temperaturas");
	Label lblCelsius = new Label("Celsius");
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txtCelsius = new TextField(3);
	TextField txtFahrenheit = new TextField(3);
	Button btnCelsiustoF = new Button("Celsius a Fahrenheit");
	Button btnFtoCelsius = new Button("Fahrenheit a Celsius");
	
	Ejercicio2()
	{
		ventana.setLayout(new GridLayout(3, 2));
		ventana.add(lblCelsius);
		ventana.add(txtCelsius);
		ventana.add(lblFahrenheit);
		ventana.add(txtFahrenheit);
		ventana.add(btnCelsiustoF);
		ventana.add(btnFtoCelsius);
		
		ventana.setSize(400,150);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
	}
	
	
	public static void main(String[] args)
	{
	new Ejercicio2();
	}
}

