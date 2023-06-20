package es.studium.tema4Ejemplos;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.TextField;

public class Distribucion
{
	Frame ventana = new Frame("Ejemplo GridBagLayout");
	
	public Distribucion()
	{
		ventana.setLayout (new GridBagLayout());
		
		// Añadir componentes
		TextArea txtArea = new TextArea("Area texto");
		GridBagConstraints constraints = new GridBagConstraints();
		
		// El área de texto empieza en la columna cero
		constraints.gridx = 0;
		// El área de texto empieza en la fila cero
		constraints.gridy = 0;
		// El área de texto ocupa dos columnas
		constraints.gridwidth = 2;
		// El área de texto ocupa 2 filas
		constraints.gridheight = 2;
		
		 ventana.add (txtArea, constraints);

		 Button btnBoton1 = new Button ("Botón 1");
		 constraints.gridx = 2;
		 constraints.gridy = 0;
		 constraints.gridwidth = 1;
		 constraints.gridheight = 1;
		ventana.add (btnBoton1, constraints);
		 Button btnBoton2 = new Button ("Botón 2");
		 constraints.gridx = 2;
		 constraints.gridy = 1;
		 constraints.gridwidth = 1;
		 constraints.gridheight = 1;
		ventana.add (btnBoton2, constraints);
		Button btnBoton3 = new Button ("Botón 3");
		 constraints.gridx = 0;
		 constraints.gridy = 2;
		 constraints.gridwidth = 1;
		 constraints.gridheight = 1;
		 ventana.add (btnBoton3, constraints);
		 Button btnBoton4 = new Button ("Botón 4");
		 constraints.gridx = 2;
		 constraints.gridy = 2;
		 constraints.gridwidth = 1;
		 constraints.gridheight = 1;
		 ventana.add (btnBoton4, constraints);
		 TextField txtCampo = new TextField ("Campo texto");
		 constraints.gridx = 1;
		 constraints.gridy = 2;
		 constraints.gridwidth = 1;
		 constraints.gridheight = 1;
		 
		ventana.add (txtCampo, constraints);
		ventana.setSize(600,250);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		}
		public static void main(String[] args)
		{
		new Distribucion();
		}
}

