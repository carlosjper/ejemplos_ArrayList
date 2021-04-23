package varios;

import java.util.ArrayList;

public class Ejem_ArrayList3 {
	
  public static void main(String[] args) {
	  
	  //ArrayList CON EL MÉTODO size() PARA AVERIGUAR EL NÚM DE ELEMENTOS.
	  
    ArrayList<String> actrices = new ArrayList<String>(); //CREA UN OBJETO DE LA CLASE ArrayList
    
    actrices.add("Natalia Verbeke");  //EQUIVALE AL ÍNDICE 0
    actrices.add("Kate Hudson");      //EQUIVALE AL ÍNDICE 1
    actrices.add("Marta Etura");	  //EQUIVALE AL ÍNDICE 2
        
        System.out.println(actrices.size());
      
    
    System.out.println("-------------USANDO EL MÉTODO remove-----------------");
    
    //USANDO EL MÉTODO remove QUE ELIMINA EL SOBRANTE, SOLO MUESTRA EN ESTE CASO EL 
    //ÍNDICE NÚMERO 1, es decir, Kate Hudson.
    //REALMENTE remove HACE UN FILTRO.
    	System.out.println(actrices.remove(1));
    
}
}