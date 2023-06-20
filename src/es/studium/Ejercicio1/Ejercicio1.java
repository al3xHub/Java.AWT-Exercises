package es.studium.Ejercicio1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio1
{
Frame ventana = new Frame("Ejercicio1");
Label lblHora1 = new Label("HH");
TextField txtHora1 = new TextField(2);
Label lblMinuto1 = new Label("MM");
TextField txtMinuto1 = new TextField(2);
Label lblHora2 = new Label("HH");
TextField txtHora2 = new TextField(2);
Label lblMinuto2 = new Label("MM");
TextField txtMinuto2 = new TextField(2);
Button btnCalcular = new Button("Calcular");
TextField txtResultado = new TextField(10);

Ejercicio1()
{
ventana.setLayout(new GridLayout(3,4));
ventana.add(lblHora1);
ventana.add(txtHora1);
ventana.add(lblMinuto1);
ventana.add(txtMinuto1);
ventana.add(lblHora2);
ventana.add(txtHora2);
ventana.add(lblMinuto2);
ventana.add(txtMinuto2);
ventana.add(btnCalcular);

//el texto no dejará escribir nada 
txtResultado.setEnabled(false);

ventana.add(txtResultado);
ventana.setSize(300,150);
ventana.setLocationRelativeTo(null);
ventana.setVisible(true);
}

public static void main(String[] args)
{
new Ejercicio1();
}
}
