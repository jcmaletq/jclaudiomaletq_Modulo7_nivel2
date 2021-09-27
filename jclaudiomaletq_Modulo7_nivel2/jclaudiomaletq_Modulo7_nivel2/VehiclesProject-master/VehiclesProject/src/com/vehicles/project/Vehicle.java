package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
	public static boolean plate_valid (String plate) {
		boolean valid, valid1,valid2;
		valid = false;
		valid1 = false;
		valid2 = false;
		if (plate.length()>=6 && plate.length()<=7) {
			valid = true;
			if (! plate.substring(0,4).matches(".*[A-Z].*")) {
				valid1 = true;
				if (! plate.substring(4).matches(".*[0-9].*")) {
					valid2 = true;}
				else {System.out.println("la matricula " +plate +" con letras incorrectas, 2 o 3 letras");
				JOptionPane.showMessageDialog(null,"la matricula " +plate +" con letras incorrectas, 2 o 3 letras");}
				}
			else {System.out.println("la matricula " +plate +" ha de tener 4 numeros");
			   JOptionPane.showMessageDialog(null,"la matricula " +plate +" ha de tener 4 numeros");}	
			}
		else {System.out.println("la matricula " +plate +" es corta 4 numeros y 2 o 3 letras");
		   JOptionPane.showMessageDialog(null,"la matricula " +plate +" es corta 4 numeros y 2 o 3 letras");}
		return valid && valid1 && valid2;
	}	
}
