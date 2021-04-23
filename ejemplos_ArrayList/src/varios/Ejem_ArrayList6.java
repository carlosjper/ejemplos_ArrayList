package varios;

import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Ejem_ArrayList6 {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    numeros.add(33);
    numeros.add(15);
    numeros.add(20);
    numeros.add(34);
    numeros.add(8);
    numeros.add(12);

    Collections.sort(numeros);  // ORDENA LOS NÚMEROS DE MENOR A MAYOR.

    for (int i : numeros) {
      System.out.println(i);
    }
}
}