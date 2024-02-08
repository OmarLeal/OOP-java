/*
     * JAVA INNER CLASSES
     * 
     * In Java, it is also possible to nest classes (a class within 
     * a class). The purpose of nested classes is to group classes 
     * that belong together, which makes your code more readable and 
     * maintainable.

    To access the inner class, create an object of the outer class, 
    and then create an object of the inner class:
     */

class OuterClass{
    String lname = "Leal";
    
    //We can set this class to private or protected so we can 
    //prevent access to its attributes from the objects outside.
    //Or we can do static and we can access the attributes 
    //in a different way
    class InnerClass{
        String fname = "Omar";
    }
}
public class InnerClasses {
    public static void main(String[] args) {
        //Creating the outterclass object to access its data.
        OuterClass myObj = new OuterClass();
        //Creating the innerclass object to acccess its data.
        OuterClass.InnerClass myObj2 = myObj.new InnerClass();  
        //[Getting the static class attributes] 
        //OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        //We can access the object class attributes now
        System.out.println(myObj2.fname + myObj.lname);
        //System.out.println(myInner.fname);
    }
    
    
}
