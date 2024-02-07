public class ClassMethods {
    //Static method
    static void myStaticMethod(){
        System.out.println("Metodo estatico");
    }

    //Public method
    public void myPublicMethod(){
        System.out.println("Metodo publico");
    }

    //Main method
    public static void main(String[] args){
        //We can call out STATIC methods
        myStaticMethod();
        //But we cant call out Public methods.
        //myPublicMethod(); this, leads to an error.

        ClassMethods miObj = new ClassMethods(); //Create an object.
        miObj.myPublicMethod(); //Call the public pmethod on the object.
    }
}
