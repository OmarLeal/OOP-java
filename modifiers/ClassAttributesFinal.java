package modifiers;

public class ClassAttributesFinal {
    //Creamos atributos de la clase main.
    final int x = 5;
    final double pi = 3.1416;

    //Creamos metodo main.
    public static void main(String[] args){
        //Creamos objeto de nuestra clase main (ClassAttributesFinal)
        ClassAttributesFinal miObj = new ClassAttributesFinal();
        /*
         * Al tratar de cambiar el valor de algun atributo final 
         * de la clase main, nos arrojara un error por el tipo final. 
         */
        //miObj.x = 1;
        //miObj.pi = 2.1216;
        System.out.println(miObj.x);
    }

}
