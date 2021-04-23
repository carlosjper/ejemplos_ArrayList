package varios;

import java.util.ArrayList;

import java.util.Collections;

public class Ejem_ArrayList5 { 
	
  public static void main(String[] args) { 
	  
    ArrayList<String> cars = new ArrayList<String>();
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    Collections.sort(cars); //ORDENA ALFABETICAMENTE LOS VALORES.

    for (String i : cars) {
      System.out.println(i);
    }
    
} 
}