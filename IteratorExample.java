/*
 * JAVA ITERATOR
 * 
 * An Iterator is an object that can be used to loop through
 *  collections, like ArrayList and HashSet. It is called an 
 * "iterator" because "iterating" is the technical term for looping.

To use an Iterator, you must import it from the java.util 
package.
 */

 //Import the ArrayList class and Iterator class.
 import java.util.ArrayList;
 import java.util.Iterator;

public class IteratorExample {
    //Create the main method
    public static void main(String[] args){
        ArrayList<String> miArrayList2 = new ArrayList<String>();
        miArrayList2.add("Java");
        miArrayList2.add("Python");
        miArrayList2.add("C#");

        //System.out.println(miArrayList2.get(1));

        //Create the iterator
        Iterator<String> miIterator = miArrayList2.iterator();

        //Get next item in array using iterator.
        //System.out.println(miIterator.next());

        //Looping trough the array using iterator.
        while (miIterator.hasNext()) {
            System.out.println(miIterator.next());
        }
    }   
}
