package modifiers;

public class AbstractMethod {
    
    public static void main(String[] args) {
        //Creamos un objeto de la subclase.
        DatoMayor myObj = new DatoMayor();

        //Ahora podemos acceder a sus atributos y sus metodos abstractos.    

        System.out.println("El nombre del objeto es: " + myObj.fname);
        System.out.println("El apellido del objeto es: " + myObj.lname);
        System.out.println("La edad del objeto es: " + myObj.edad);
        myObj.dato();
        
    }
    

    

}
