package es.studium.Ejercicio5;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Ejercicio5
{
	Frame ventana = new Frame("Vehículos");
	FlowLayout distribucion = new FlowLayout();
	
	Label lblMensaje1 = new Label("Tipo de motorización: ");
	CheckboxGroup chkgrGrupo1 = new CheckboxGroup();
	
	Checkbox chkGasolina = new Checkbox("Gasolina", false, chkgrGrupo1);
	Checkbox chkDiesel = new Checkbox("Diesel", false, chkgrGrupo1);
	Checkbox chkHibrido = new Checkbox("Híbrido", false, chkgrGrupo1);
	Checkbox chkElectrico = new Checkbox("Eléctrico", false, chkgrGrupo1);
	
	Label lblMensaje2 = new Label("Número de puertas: ");
	CheckboxGroup chkgrGrupo2 = new CheckboxGroup();
	
	Checkbox chk3puertas = new Checkbox("3 Puertas", false, chkgrGrupo2);
	Checkbox chk4puertas = new Checkbox("4 Puertas", false, chkgrGrupo2);
	Checkbox chk5puertas = new Checkbox("5 Puertas", false, chkgrGrupo2);
	
	Label lblMensaje3 = new Label("Pintura metalizada: ");
	CheckboxGroup chkgrGrupo3 = new CheckboxGroup();
	
	Checkbox chkSi = new Checkbox("Sí", false, chkgrGrupo3);
	Checkbox chkNo = new Checkbox("No", false, chkgrGrupo3);
	
	Button btnCalcular = new Button("Calcular presupuesto");
	
	Ejercicio5()
	{
		ventana.setSize(500, 300);
		ventana.setLocationRelativeTo(null);
		ventana.setBackground(Color.gray);
		ventana.setLayout( new FlowLayout());
		ventana.setResizable(false);
		
		
		ventana.add(lblMensaje1);
		
		ventana.add(chkGasolina);
		ventana.add(chkDiesel);
		ventana.add(chkHibrido);
		ventana.add(chkElectrico);
		
		ventana.add(lblMensaje2);
		
		ventana.add(chk3puertas);
		ventana.add(chk4puertas);
		ventana.add(chk5puertas);
		
		ventana.add(lblMensaje3);
		
		ventana.add(chkSi);
		ventana.add(chkNo);
		
		ventana.add(btnCalcular);
		
		
		
		ventana.setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		new Ejercicio5();
	}

}
