//Import the whole package here
import java.util.*;

public class ImportPackage {
    public static void main(String[] args){
        /*Use any class of the package, like the Scanner. 
         * Create the object of the class and then we are good to go.
        */
        @SuppressWarnings("resource")
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        
        String edad = myObj.nextLine();
        System.out.println("Tu edad es: " + edad); 

    }
}
