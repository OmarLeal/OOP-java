//Creamos una interface
interface StringFunction{
    String run(String str);
}

public class LambdaExample2 {
    //Creamos nuestro main method
    public static void main(String[] args){
        //Creamos objetos de nuestra interface
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        
        //Imprimimos valores de printFormatted
        printFormatted("Hola", exclaim);
        printFormatted("Hola", ask);

    }

    //Creamos un metodo
    public static void printFormatted(String str, StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }
}
