package modifiers;

abstract class AbstractClass {
    //Create attributes.
    public String fname = "Omar";
    public String lname = "Leal";

    //Create an abstract method
    public abstract void dato();
}

//Subclass (Heredada de main)
class DatoMayor extends AbstractClass{
    //Atributo de la clase DatoMayor
    public int edad = 33;
    public void dato(){ //The body of the abstract method is here
        System.out.println("Este es el cuerpo del metodo asbtracto");
    }
}
