package es.studium.Ejercicio6;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ejercicio6
{
	Frame ventana = new Frame("Provincias");
	String[ ] provincias = {"Seleccione una provincia", "Alava", "Albacete",
	"Alicante", "Almería", "Asturias", "Avila", "Badajoz", "Barcelona", "Burgos",
	"Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña", "Cuenca", "Gerona", "Granada", "Guadalajara", "Guipúzcoa", "Huelva",
	"Huesca", "Islas Baleares", "Jaén", "León", "Lérida", "Lugo", "Madrid", "Málaga",
	"Murcia", "Navarra", "Orense", "Palencia", "Las Palmas", "Pontevedra", "La Rioja",
	"Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife",
	"Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza"};
	Choice choProvincias = new Choice();
	public Ejercicio6()
	{
	ventana.setLayout(new FlowLayout());
	for(String provincia: provincias)
	{
	choProvincias.add(provincia);
	}
	ventana.add(choProvincias);
	ventana.setSize(250,150);
	ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
	new Ejercicio6();
	}
}
