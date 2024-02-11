/*
 * JAVA HASHMAP
 * 
 * In the ArrayList chapter, you learned that Arrays store items as 
 * an ordered collection, and you have to access them with an index 
 * number (int type). A HashMap however, store items in "key/value" 
 * pairs, and you can access them by an index of another type (e.g. a 
 * String).

One object is used as a key (index) to another object (value). It can 
store different types: String keys and Integer values, or the same type,
like: String keys and String values:
 */

 //Import the class
 import java.util.HashMap;

public class HashMapExample {
    //Creamos metodo main
    public static void main(String[] args){
        HashMap<String, String> miHashMap = new HashMap<String, String>();
        miHashMap.put("1", "Hola");
        miHashMap.put("2", "mi");
        miHashMap.put("3", "nombre");
        miHashMap.put("4", "es");
        miHashMap.put("5", "Omar");

        System.out.println(miHashMap.get("1"));

        //Iterar sus keys
        for(String i : miHashMap.keySet()){
            System.out.println(i);
        }

        //Iterar sus valores
        for(String i : miHashMap.values()){
            System.out.println(i);
        }

        /*
         * Remove an item: miHashMap.remove();
         * Size: miHashMap.size();
         */

    }
    
    
}
