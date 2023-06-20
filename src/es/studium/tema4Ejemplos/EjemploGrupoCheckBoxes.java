package es.studium.tema4Ejemplos;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class EjemploGrupoCheckBoxes
{
	Frame ventana = new Frame("Elección Única");
	FlowLayout distribucion = new FlowLayout();
	CheckboxGroup chkgrGrupo = new CheckboxGroup();
	
	Checkbox chkPrimavera = new Checkbox("Primavera", false, chkgrGrupo);
	Checkbox chkVerano = new Checkbox("Verano", false, chkgrGrupo);
	Checkbox chkOtono = new Checkbox("Otoño", false, chkgrGrupo);
	Checkbox chkInvierno = new Checkbox("Invierno", true, chkgrGrupo);
	
	Label lblMensaje = new Label("¿Qué estación te gusta más?");
	
	EjemploGrupoCheckBoxes()
	{
		ventana.setSize(250, 300);
		ventana.setLocationRelativeTo(null);
		ventana.setBackground(Color.gray);
		ventana.setLayout(distribucion);
		
		ventana.add(lblMensaje);
		
		ventana.add(chkInvierno);
		ventana.add(chkPrimavera);
		ventana.add(chkVerano);
		ventana.add(chkOtono);
		
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new EjemploGrupoCheckBoxes();
	}

}
