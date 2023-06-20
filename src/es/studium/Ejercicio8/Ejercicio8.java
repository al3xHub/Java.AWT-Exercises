package es.studium.Ejercicio8;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ejercicio8
{
	
	//Crear una ventana con nombre "Menú"
	Frame ventana = new Frame("Menú");
	
	//Crear la barra del menú que aparece arriba
	MenuBar barraMenu = new MenuBar();
	
	//En la barra del menú, incluir estas 3 opciones
	Menu mnuArticulos = new Menu("Articulos");
	Menu mnuClientes = new Menu("Clientes");
	Menu mnuFacturas = new Menu("Facturas");
	
	//Dentro de la seccion "Articulo", estas 3 opciones
	MenuItem mniArticulosNuevo = new MenuItem("Nuevo Artículo");
	MenuItem mniArticulosEliminar = new MenuItem("Eliminar Artículo");
	MenuItem mniArticulosConsultar = new MenuItem("Consultar Artículo");
	
	//Dentro de la seccion "Clientes", estas 3 opciones
	MenuItem mniClientesNuevo = new MenuItem("Nuevo Cliente");
	MenuItem mniClientesEliminar = new MenuItem("Eliminar Cliente");
	MenuItem mniClientesConsultar = new MenuItem("Consultar Cliente");
	
	//Dentro de la seccion "Facturas", estas 2 opciones
	MenuItem mniFacturasNueva = new MenuItem("Nueva Factura");
	MenuItem mniFacturasConsultar = new MenuItem("Consultar Factura");
	
	Ejercicio8()
	{
		
		//
		ventana.setLayout(new FlowLayout());
		
		//Poner barra del menu
		ventana.setMenuBar(barraMenu);
		
		// De la barra del menu estas 3
		barraMenu.add(mnuArticulos);
		barraMenu.add(mnuClientes);
		barraMenu.add(mnuFacturas);
		
		//De articulos añadimos estas 3
		mnuArticulos.add(mniArticulosNuevo);
		mnuArticulos.add(mniArticulosEliminar);
		mnuArticulos.add(mniArticulosConsultar);
		
		//De clientes estos 3
		mnuClientes.add(mniClientesNuevo);
		mnuClientes.add(mniClientesEliminar);
		mnuClientes.add(mniClientesConsultar);
		
		//De facturas estos dos
		mnuFacturas.add(mniFacturasNueva);
		mnuFacturas.add(mniFacturasConsultar);
		
		
		ventana.setSize(350, 200);
		ventana.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new Ejercicio8();
	}

}
