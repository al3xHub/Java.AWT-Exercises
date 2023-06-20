package es.studium.tema4Ejemplos;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
public class EjemploWindow
{
Frame contenedor = new Frame();
Window ventana = new Window(contenedor);
EjemploWindow()
{
ventana.setBounds(50, 50, 250, 100);
ventana.setBackground(Color.lightGray);
ventana.setLocationRelativeTo(null);
ventana.setVisible(true);
}
public static void main(String[] args)
{
	new EjemploWindow();
	}
	}
