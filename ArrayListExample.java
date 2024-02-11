/*
 * JAVA ARRAYLIST
 * 
 * The ArrayList class is a resizable array, which can be found in 
 * the java.util package.

The difference between a built-in array and an ArrayList in Java, is 
that the size of an array cannot be modified (if you want to add or 
remove elements to/from an array, you have to create a new one). While 
elements can be added and removed from an ArrayList whenever you want. 
The syntax is also slightly different:

 */
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Chevrolet");
        cars.add("Audi");
        cars.add("Kia");

        //Iterate the array list
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        System.out.println(cars);
        System.out.println("Getting first value from cars: " + cars.get(0));
        

        //Changing an item at a certain position
        cars.set(0, "Mercedes");
        System.out.println(cars);
        //Removing an item at a certain position
        cars.remove(2);
        System.out.println(cars);
        //Remove all elements from the array List
        cars.clear();
        
        //Size of the array list.
        cars.size();

        System.out.println(cars);

        
    }
}
