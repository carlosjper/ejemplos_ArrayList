package varios;

import java.util.ArrayList;

public class Ejem_ArrayList2 {
	
  public static void main(String[] args) {
	  
	  //ArrayList CON EL MÉTODO get PARA ACCEDER A UN ELEMENTO CONCRETO.
	  
    ArrayList<String> actrices = new ArrayList<String>(); //CREA UN OBJETO DE LA CLASE ArrayList
    
    actrices.add("Natalia Verbeke");  //EQUIVALE AL ÍNDICE 0
    actrices.add("Kate Hudson");      //EQUIVALE AL ÍNDICE 1
    actrices.add("Marta Etura");	  //EQUIVALE AL ÍNDICE 2
        
    //NOS MUESTRA EN LA CONSOLA EL ÍNDICE 0, es decir, Natalia Verbeke.
    System.out.println(actrices.get(0));
    
    
 // USANDO EL set AHORA SALE Elsa Pataky
    actrices.set(0, "Elsa Pataky");
        
    System.out.println("Tras usar el set: " + actrices.set(0, "Elsa Pataky"));
}
}