/*
 * JAVA HASHSET
 * 
 * A HashSet is a collection of items where every item is unique, 
 * and it is found in the java.util package:
 */

 import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<String> miHashSet = new HashSet<String>();
        miHashSet.add("Mi");
        miHashSet.add("HashSet");
        miHashSet.add("Example");    
        System.out.println(miHashSet);
        //HashSet size
        System.out.println(miHashSet.size());

        for(String i : miHashSet){
            System.out.println(i);
        }

        /*
         * Check if an item exist
         * cars.contains("Mazda");
         * 
         * Remove an item
         * cars.remove("Volvo");
         */
    }
}
