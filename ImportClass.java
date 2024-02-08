//Import of just one class
import java.util.Scanner;
public class ImportClass {
    public static void main(String[] args){
        //Create an object from Scanner class
        Scanner myObj = new Scanner(System.in);
        //Printing the user data.
        System.out.println("Enter your name...");

        //Here we are creating the user's input variable and we give 
        //the instruction to input data to the user using Scanner's
        //method "nextLine()".
        String fname = myObj.nextLine();
        System.out.println("The name is: " + fname); 
    }
}
