package es.studium.Ejercicio3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio3
{
	Frame ventana = new Frame("Calcular el IVA");
	
	Label lblCantidad = new Label("Introduzca la cantidad");
	Label lblPorcentaje = new Label("Introduzca el porcentaje");
	Label lblResultado = new Label("Resultado");
	
	TextField txtCantidad = new TextField(10);
	TextField txtPorcentaje = new TextField(3);
	TextField txtResultado = new TextField(10);
	
	Button btnCalcular = new Button("Calcular");
	
	Ejercicio3()
	{
		ventana.setLayout(new GridLayout(1, 7));
		
		ventana.add(lblCantidad);
		ventana.add(txtCantidad);
		ventana.add(lblPorcentaje);
		ventana.add(txtPorcentaje);
		ventana.add(btnCalcular);
		ventana.add(lblResultado);
		ventana.add(txtResultado);
		
		txtResultado.setEnabled(false);
		
		
		ventana.setSize(800,55);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio3();
	}

}
