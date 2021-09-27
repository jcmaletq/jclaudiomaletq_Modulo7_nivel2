package com.vehicles.project;

import java.util.List;

import javax.swing.JOptionPane;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();
		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);
		if (!rightWheel.toString().equals(leftWheel.toString()))
			throw new Exception();
		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

	@Override
	public String toString() {
		return "Car [plate=" + plate + ", brand=" + brand 
				+ ", color=" + color + " \n"  
				+ ", wheels=" + wheels + "]";
	}
	
	public static Car pide_datos_coche (){
		String plate,brand,color;
		int val;
		brand =null;
		color = null;
		do {
		  plate = null;	
		  try {plate=JOptionPane.showInputDialog("introudce la matricula del coche","1234ab").toUpperCase();
		      }
		  catch (Exception e)
		       {  System.out.println("error no se ha introducido matricula");
		       System.exit(0);}
		 }
		while (! plate_valid(plate));
		try {brand=JOptionPane.showInputDialog("introudce la marca del coche","Brand");
		      val = brand.length();   // para detectar el cancel 
		     }
		  catch (Exception e)
		      {  System.out.println("error no se ha introducido la marca");
		         System.exit(0);
		       }
		
		try {color=JOptionPane.showInputDialog("introudce el color del coche","Color");
		       val = color.length();   // para detectar el cancel
		     }
	        catch (Exception e)
	            { System.out.println("error no se ha introducido el color");
		         System.exit(0);
		       }
		return new Car(plate,brand,color); 
	}	
	
	
}
