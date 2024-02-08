/*
 * JAVA INTERFACES
 * 
 * Another way to achieve abstraction in Java, is with interfaces.

An interface is a completely "abstract class" that is used to group 
related methods with empty bodies.

To access the interface methods, the interface must be "implemented" 
(kinda like inherited) by another class with the implements keyword 
(instead of extends). The body of the interface method is provided by 
the "implement" class.
 */

 //Create an interface
 interface Animal2{
    //Just like abstract classes methods, interfaces methods 
    //doesn't have a body.
    /*
     * Note: Methods can be abstract and public
     */
    public void animalSound2();
    public void sleep2();

    /*
     * Interface attributes behaves same way as Abstract classes attributes.
     * Can be public, static and final.
     */
 }

 //In order to interact with interfaces we must "implements" our classes
 //so we can have acces to its methods.
 //Just like inherticance we do "extends", in interfaces we do "implements".

class Dog2 implements Animal2{
    public void animalSound2(){
        System.out.println("Woof woof");
    }
    public void sleep2(){
        System.out.println("Zzzzz...");
    }
}

class Cat2 implements Animal2{
    public void animalSound2(){
        System.out.println("Meow, meow");
    }
    public void sleep2(){
        System.out.println("Zzzzzzzz....ima sleeping cat");
    }
}

//Main class
public class Interfaces {
    //Create the main method.
    public static void main(String[] args){
        //Create the classes objects.
        Dog2 myDog2 = new Dog2();
        Cat2 myCat2 = new Cat2();
        myDog2.animalSound2();
        myDog2.sleep2();
        myCat2.animalSound2();
        myCat2.sleep2();

        //What happens if a try to create and object from an interface?
        //Same thing as abstract classes...doesnt let you create any objects from it

        //Animal myAnimal = new Animal();
    }
}
