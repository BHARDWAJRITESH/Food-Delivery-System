package com.BridgeLabs.FoodDeliverySystem;

import java.util.Scanner;

//this is the controller layer
public class Application {
	 static UserInterface userInterface = new UserInterface ();
	    static FoodStore foodStore = new FoodStore ();
	    
	    HakkaNoodles hakkaNoodles = new HakkaNoodles ();
	    ShahiPaneer shahiPaneer = new ShahiPaneer ();
	    SoyaChaap soyaChaap = new SoyaChaap ();
	    SpringRoll springRoll = new SpringRoll ();
	    Scanner scanner = new Scanner ( System.in );
	    ;
	    
	    
	

	public static void main(String[] args) {
		userInterface.show ( foodStore );
		userInterface.print ( foodStore.getList() );
		
		}
	
	boolean handle ( int option,FoodStore foodStore ) {
		switch (option) {
		case 1:
			System.out.println( "Enter choice of the food : \n 1.HakkaNoddles \n 2. ShahiPaneer \n 3. SoyaChaap \n 4. SpringRoll \n");
			int choice = new Scanner ( System.in ).nextInt ();
            switch (choice) {
                case 1 :
                    foodStore.add ( hakkaNoodles );
                    break;
                case 2:
                    foodStore.add ( shahiPaneer );
                    break;
                case 3:
                    foodStore.add ( soyaChaap);
                    break;
                case 4 :
                	foodStore.add ( springRoll);
                	break;
		}
            System.out.println ( "Food Is Added" );
            break;
        case 2:
            userInterface.print ( foodStore.getList () );
            System.out.println ( "enter food Item you want to remove" );
            String foodName = scanner.nextLine ();
            foodStore.remove ( foodName );
            break;
        case 4:
            return false;
        case 3:
            userInterface.print ( foodStore.getList () );
            break;

        default:
            System.out.println ( "plz enter 1 or 2 or 3" );
    }
    return true;
    }
}
