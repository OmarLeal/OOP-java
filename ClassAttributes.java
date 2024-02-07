public class ClassAttributes {
    int x = 3;
    int y = 6;
    String fname = "Omar";
    String lname = "Leal";

    public static void main(String[] args){
        ClassAttributes miObj = new ClassAttributes();
        ClassAttributes miObj2 = new ClassAttributes();
        System.out.println(miObj.x);
        System.out.println(miObj.y);
        System.out.println("El nombre d emi obj2 es: " + miObj2.fname + " y el apellido es: " + miObj2.lname);

        //Overriding class values
        System.out.println("Overriding class values:");
        miObj.x = 10;
        miObj.y = 20;
        miObj2.fname = "Alejandro";
        miObj2.lname = "Lopez";

        System.out.println(miObj.x);
        System.out.println(miObj.y);
        System.out.println("El nombre d emi obj2 es: " + miObj2.fname + " y el apellido es: " + miObj2.lname);

        
    }
}
