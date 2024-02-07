public class Encapsulation2 {
    public static void main(String[] args) {
        //Creating an object to access the data.
        Encapsulation myObj = new Encapsulation();
        myObj.setName("Carlos");
        System.out.println(myObj.getName());

        //We are not able to change the attribute "name" bc its private.
        //myObj.name = "Other name";
        //Even we can change the modifier from the setter to "private"
        //and avoid letting other devs to set other names.

        /*
         * WHY ENCAPSULATION?
         * Better control of class attributes and methods
        Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
        Flexible: the programmer can change one part of the code without affecting other parts
        Increased security of data
         */
    }
}
