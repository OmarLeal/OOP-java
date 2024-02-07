package modifiers;

public class StaticPublicMethods {
    static void myStaticMethod(){
        //Create a STATIC method.
        System.out.println("This is an STATIC method");
    }

    // Create a PUBLIC method
    public void myPublicMethod(){
        System.out.println("This is a PUBLIC method");
    }

    //Create main method
    public static void main(String[] args){
        //Calling STATIC method.
        myStaticMethod();

        //To call a public method we NEED to create an OBJECT.
        StaticPublicMethods myObj = new StaticPublicMethods();
        myObj.myPublicMethod();
    }
}
