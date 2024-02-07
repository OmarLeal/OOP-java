public class Second {
    public static void main(String[] args) {
        ClassObjects miObj = new ClassObjects();
        System.out.println(miObj.x);

        
        //To access a STATIC method from another file
        ClassMethods.myStaticMethod();
        //To access a PUBLIC method from another file
        ClassMethods miObj2 = new ClassMethods();
        miObj2.myPublicMethod();
    }
}
