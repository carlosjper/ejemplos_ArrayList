package varios;

import java.util.ArrayList;

public class Ejem_ArrayList3 {
	
  public static void main(String[] args) {
	  
	  //ArrayList CON EL M�TODO size() PARA AVERIGUAR EL N�M DE ELEMENTOS.
	  
    ArrayList<String> actrices = new ArrayList<String>(); //CREA UN OBJETO DE LA CLASE ArrayList
    
    actrices.add("Natalia Verbeke");  //EQUIVALE AL �NDICE 0
    actrices.add("Kate Hudson");      //EQUIVALE AL �NDICE 1
    actrices.add("Marta Etura");	  //EQUIVALE AL �NDICE 2
        
        System.out.println(actrices.size());
      
    
    System.out.println("-------------USANDO EL M�TODO remove-----------------");
    
    //USANDO EL M�TODO remove QUE ELIMINA EL SOBRANTE, SOLO MUESTRA EN ESTE CASO EL 
    //�NDICE N�MERO 1, es decir, Kate Hudson.
    //REALMENTE remove HACE UN FILTRO.
    	System.out.println(actrices.remove(1));
    
}
}