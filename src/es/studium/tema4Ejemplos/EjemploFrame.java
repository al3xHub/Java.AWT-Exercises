package es.studium.tema4Ejemplos;

import java.awt.Color;
import java.awt.Frame;
import java.util.Random;
public class EjemploFrame
{
Frame ventana = new Frame("Ejemplo");
public EjemploFrame(int x, int y, Color color)
{
ventana.setBounds(x, y, 250, 100);
ventana.setResizable(false);
ventana.setBackground(color);
ventana.setVisible(true);
}
public static void main(String[] args)
{
Random rnd = new Random();
Color[] colores = {Color.red, Color.green, Color.yellow, Color.black, Color.blue};
int i,x,y,ci;
Color c;
for(i=0;i<5;i++)
{
x=rnd.nextInt(1400);
y=rnd.nextInt(800);
ci=rnd.nextInt(5);
c = colores[ci];
new EjemploFrame(x,y, c);
}
}
}