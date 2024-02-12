/*
 * JAVA EXCEPTIONS
 * 
 * When executing Java code, different errors can occur: coding 
 * errors made by the programmer, errors due to wrong input, or 
 * other unforeseeable things.

When an error occurs, Java will normally stop and generate an 
error message. The technical term for this is: Java will throw an 
exception (throw an error).
 */

public class ExceptionsExample {
    public static void checarEdad(int edad){
        if(edad < 18){
            throw new ArithmeticException("Acceso denegado - Eres menor de edad!");
        }else{
            System.out.println("Acceso autorizado !");
        }
    }
    public static void main(String[] args){
        //Try-Catch-Finally example
        try {
            int[] misNums = {1, 2, 3};
            System.out.println(misNums[0]);
        }catch (Exception e){
            System.out.println("Algo salio mal...");
        }finally{
            System.out.println("El try catch ha finalizado");
        }

        //Throw example
        checarEdad(18);


    }
}

