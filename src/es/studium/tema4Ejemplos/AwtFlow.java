package es.studium.tema4Ejemplos;

//Sentencia import para importar las clases que vamos a necesitar
//En este caso necesitaremos las clases del AWT
import java.awt.*;
//Declaración de la clase AwtFlow
public class AwtFlow
{
Frame ventana = new Frame("FlowLayout");


//Creamos los botones con sus correspondientes etiquetas
Button boton1 = new Button("Aceptar");
Button btnBoton2 = new Button("Abrir");
Button btnBoton3 = new Button("Cerrar");

//Constructor de la clase con el mismo nombre que ella
public AwtFlow()
{
//Establecer la distribución del Frame
ventana.setLayout(new FlowLayout());

//Añadir los botones antes creados
ventana.add(boton1);
ventana.add(btnBoton2);
ventana.add(btnBoton3);
//Establecer el tamaño del Frame
ventana.setSize(200,200);
//Centra la ventana en la pantalla
ventana.setLocationRelativeTo(null);
//Mostrar el Frame en pantalla
ventana.setVisible(true);
}
//Fin del Constructor

//Método Main. Es el método que se ejecutará en primer
//lugar al ejecutarse la aplicación

public static void main(String[] args)
{
//Crear una instancia u objeto de nuestra Clase AwtFlow
new AwtFlow();
}
//Fin del Main
}
//Fin de la Clase
