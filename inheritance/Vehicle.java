package inheritance;

public class Vehicle {
     //Creamos un protected attribute.
     protected String marca = "Honda";
     //Cambiando el modifier a private attribute.
     //private String marca = "Honda";

     //Creamos un public method.
     public void claxon(){
         System.out.println("beep beep!");
     }
}


class Motorcycle extends Vehicle{
    //Creamos un atributo private.
    private String motorCil = "1300cc";

    //Creamos metodo main
    public static void main(String[] args){

        //Creamos un objeto de Motorcycle
        Motorcycle myObj = new Motorcycle();

        //Accedemos a los atributos y metodos aqui:
        
        //Metodo de Vehicle (Superclass) usando el objeto Motorcycle (Subclass)
        //Heredo el metodo de la clase padre.
        myObj.claxon();

        //Aqui vemos los atributos de cada una de las clases (Super y sub)
        //Atributo de la clase padre. (Herencia)
        System.out.println("Atributo de la clase padre. (Herencia): ");
        System.out.println(myObj.marca);
        //Atribuo de la subclase.
        System.out.println("Atributo de la subclase: ");
        System.out.println(myObj.motorCil);

        //Tratamos de modificar atributos aqui:
        //El atributo de la super clase es de tipo protected.
        myObj.marca = "Chevrolet";
        System.out.println(myObj.marca);

        //Si el atributo de la super clase fuera private no tendriamos visibilidad de el.
        //myObj.marca = "1800cc";
        //System.out.println(myObj.marca);

        /*
         * NOTA:
         * Si no queremos heredar ningun dato, podemos usar:
         * FINAL keyword en las clases.
         * Ejemplo:
         * final class Vehicle{
         * }
         * class Car extends Vehicle{
         * ...
         * }
         */
        


    }
}