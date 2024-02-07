public class ClassConstructorWithParameters {
    //Creamos un atributo de la clase.
    int x = 5;

    //Creamos el constructor y le asignamos parametro "y"
    //Esto nos sirve para poder hacer pruebas creando nuestras variables
    public ClassConstructorWithParameters(int y){
        //Asignamos los valores de los atributos a los parametros del constructor.
        x = y;
    }

    //Metodo main
    public static void main(String[] args){
        //Creamos nuestro objeto de nuestra clase.
        //Asignamos un valor al parametro de nuestro constructor
        ClassConstructorWithParameters miObj = new ClassConstructorWithParameters(5); 
        System.out.println(miObj.x);
    }
}
