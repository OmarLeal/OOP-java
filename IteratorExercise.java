/*
 * Removing Items from a Collection
Iterators are designed to easily change the collections that 
they loop through. The remove() method can remove items from 
a collection while looping.
 */

 //Import classes
 import java.util.ArrayList;
 import java.util.Iterator;

public class IteratorExercise {
 //Create the main method
 public static void main(String[] args){
    //Create the ArrayList
    ArrayList<Integer> misNumeros =  new ArrayList<Integer>();
    misNumeros.add(1);
    misNumeros.add(3);
    misNumeros.add(7);
    misNumeros.add(10);
    misNumeros.add(20);

    //Creating an iterator
    Iterator<Integer> miResultado = misNumeros.iterator();

    //Iterating the array using a while
    while (miResultado.hasNext()) {
        //Create a variable to use it in statement
        Integer i = miResultado.next();
        //Create a condition to print only values > 10.
        if (i < 10) {
            miResultado.remove();
        }

        System.out.println(misNumeros);
    }
 }   
}
