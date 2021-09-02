package com.BridgeLabs.FoodDeliverySystem;

import java.util.List;
import java.util.Scanner;

//View layer
public class UserInterface {
	public void print (List<FoodItem> foodList) {
		for (Object object : foodList) {
			System.out.println ( object );
		}
	}
	
	public void show ( FoodStore foodStore ) {
		boolean flag = true;
		while (flag) {
			System.out.println ( "\n\n--------------------------------------\nWELCOME TO FOOD DELIVERY SYSTEM\n-------------------------------------\n" );
            System.out.print ( "1 = Add Food Item\n2 = Remove food Item\n3 = print menu \n4 = Exit \nEnter number for Your Choice: " );
            Scanner scanner = new Scanner ( System.in);
            int option = scanner.nextInt ();
            Application application = new Application ();
            flag = application.handle ( option, foodStore );
            }
	  }
}
