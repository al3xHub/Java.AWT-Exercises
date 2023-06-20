package es.studium.tema4Ejemplos;

import java.awt.*;
public class AwtBorder
{
Frame ventana = new Frame("BorderLayout");
Button btnBotonN = new Button("Norte");
Button btnBotonS = new Button("Sur");
Button btnBotonE = new Button("Este");
 Button btnBotonO = new Button("Oeste");
 Button btnBotonC = new Button("Centro");
 Button btnBotonD = new Button ("Casa");
 
// Constructor de la clase con el mismo nombre que ella
public AwtBorder()
{
// Establecer la distribución del Frame
 ventana.setLayout (new BorderLayout());
 
// Añadir los botones antes creados en posición indicada
ventana.add( "North", btnBotonN);
ventana.add( "South", btnBotonS);
ventana.add( "East", btnBotonE);
ventana.add( "West", btnBotonO);
ventana.add( "Center", btnBotonC);


// Establecer el tamaño del Frame
ventana.setSize(200,200);


// Centra la ventana en la pantalla
ventana.setLocationRelativeTo(null);

// Mostrar el Frame en pantalla
ventana.setVisible(true);
}

//Fin del Constructor
public static void main(String[] args)
{
new AwtBorder();
}
//Fin del Main
}
//Fin de la Clase