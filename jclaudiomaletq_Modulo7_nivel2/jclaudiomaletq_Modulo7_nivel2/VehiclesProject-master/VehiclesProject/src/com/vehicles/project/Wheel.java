package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}
	@Override
	public String toString() {
		return "Wheel [brand=" + brand   + ", diameter=" + diameter + "]"+ " \n";
	}
	public static List<Wheel> pide_datos_rueda (String posi) {
		String brand;
		int val;
		double diameter;
		brand = null;
		String diamet;
		diamet = null;
		try {brand=JOptionPane.showInputDialog("introudce la marca de la rueda "+posi,"Brand Wheel");
		  val = brand.length();   // para detectar el cancel
	    }
	   catch (Exception e)
	       { System.out.println("error no se ha introducido la marca de la rueda " + posi);
	        System.exit(0);
	      }
		do {
			try {
//			diameter=Double.parseDouble(JOptionPane.showInputDialog("introudce el diametro de la rueda "+posi));
			diamet=(JOptionPane.showInputDialog("introudce el diametro de la rueda "+posi));
			val = diamet.length();   // para detectar el cancel
			}
			   catch (Exception e)
		       { System.out.println("error no se ha introducido el diametro " + posi);
		        System.exit(0);
		      }
			diameter=Double.parseDouble(diamet);	
		}
		while   (! diameter_valid(diameter));
		Wheel l_Wheel =new Wheel (brand,diameter);
		Wheel r_Wheel =new Wheel (brand,diameter);
		List<Wheel> lista = new ArrayList<>();
		lista.add(r_Wheel);
		lista.add(l_Wheel);
		return lista; 
	   }	
	public static boolean diameter_valid (double diam) {
		boolean valid;
		valid = false;
		if (diam >= 0.4 && diam <= 4) {
			valid = true;}
		else {System.out.println("el diametro introducido " +diam +" ha de estar entre 0.4 y 4");}
		return valid;
	}	
}
