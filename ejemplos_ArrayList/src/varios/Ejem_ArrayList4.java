package varios;

import java.util.ArrayList;

public class Ejem_ArrayList4 {
	
  public static void main(String[] args) {
	  
	//ArrayList USANDO EL MÉTODO add Y EL TIPO Integer.  
	  
    ArrayList<Integer> nums = new ArrayList<Integer>(); //CREA UN OBJETO DE LA CLASE ArrayList
    nums.add(10);
    nums.add(15);
    nums.add(20);
    nums.add(25);
        
    for (int i : nums) {
      System.out.println(i);
    }
    
    
    
}
}