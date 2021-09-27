package com.vehicles.project;
import com.vehicles.project.Car;
import com.vehicles.project.Wheel;
import java.util.*;
import javax.swing.*;
//import java.util.ArrayList;
//import java.util.List;

import com.vehicles.project.Car;
public class main {

	public static void main(String[] args) {
		Car coche;
		coche = Car.pide_datos_coche();
		List<Wheel> frontWheels =new ArrayList<>();
		frontWheels = Wheel.pide_datos_rueda ("Front");
		List<Wheel> backWheels =new ArrayList<>();
		backWheels = Wheel.pide_datos_rueda ("Back");
		try {
		 coche.addWheels(frontWheels,backWheels);
		 }
		catch (Exception e)
		{  System.out.println("error en las ruedas"+ "");
		} 
		System.out.println(coche.toString());
		JOptionPane.showMessageDialog(null,coche.toString());
	}
}
