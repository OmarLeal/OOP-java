//Main class created
public class ClassConstructor {
    //Class attribute
    int x;

    //Class constructor
    public ClassConstructor(){
        x = 5; //Setting the value for the class attribute.
    }

    //Main method
    public static void main(String[] args){
        ClassConstructor miObj = new ClassConstructor();
        System.out.println(miObj.x);
    }
}
