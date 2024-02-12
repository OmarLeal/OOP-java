/*
 * JAVA LAMBDA EXPRESSIONS
 * 
 * Lambda Expressions were added in Java 8.

A lambda expression is a short block of code which takes in 
parameters and returns a value. Lambda expressions are similar 
to methods, but they do not need a name and they can be implemented 
right in the body of a method.
 */

 /*
  * Syntax:
  parameter -> expression

  //To use more than one parameter:
  (parameter1, parameter2) -> expression

  //To add variables, assignments or statements we do this:
  (parameter1, parameter2) -> { code block}
  */

  //Import arrayList class
  import java.util.ArrayList;
  import java.util.function.Consumer;;

public class LambdaExample {
    //Create main method
    public static void main(String[] args){
        //Creamos ArrayList
        ArrayList<String> misHijos = new ArrayList<String>();
        misHijos.add("Erick");
        misHijos.add("Emiliano");
        misHijos.add("Esteban");

        //Creamos nuestra expresion Lambda
        //misHijos.forEach((n) -> {System.out.println(n);} );

        //Podemos guardar expresiones lambda usando "Consumer" (Importar clase)
        Consumer<String> miConsumer = (n) -> {System.out.println(n);};
        misHijos.forEach(miConsumer);
    }
}
