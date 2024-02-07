public class Encapsulation {
    //Create a private attribute
    private String name = "Omar";

    //Getter
    public String getName(){
        return name;
    }

    //Setter
    //Note: We can prevent setting a newName if we dont create a setter.
    public void setName(String newName){
        this.name = newName;
    }

    //Creating the main method to verify encapsulation
    public static void main(String[] args){
        //Creating an object to access its data
        Encapsulation myObj = new Encapsulation();
        //Getting the value from an object.
        System.out.println(myObj.name);

        //We can even change the value because we are in the same class.
        myObj.name = "Alejandro";
        System.out.println(myObj.name);
    }
}
