package varios;
import java.util.ArrayList;

public class Ejem_ArrayList1 {
	
  public static void main(String[] args) {
	  
	  //ArrayList CON EL MÉTODO add QUE AGREGA ELEMENTOS AL ARRAYLIST.
	  
    ArrayList<String> coches = new ArrayList<String>(); //CREA UN OBJETO DE LA CLASE ArrayList
    
    coches.add("Porsche");
    coches.add("Maserati");
    coches.add("Ferrari");
    coches.add("Lamborghini");
    
       System.out.println(coches);
}
}