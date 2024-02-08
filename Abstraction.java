/*
 * JAVA ABSTRACTION
 * 
 * Data abstraction is the process of hiding certain details and 
 * showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces

The abstract keyword is a non-access modifier, used for classes and 
methods:

Abstract class: is a restricted class that cannot be used to create 
objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does 
not have a body. The body is provided by the subclass (inherited from).
 */

//Creating an abstract class
//Doesn't have a body, it must be inherited from subclasses.
abstract class Animal{
    //Create an abstract method (Doesn't have a body)
    public abstract void animalSound();
    //We can create a regular method in an abstract class
    public void sleep(){
        //We can provide a body of a regular method in an abstract class.
        System.out.println("Zzzzz...");
    }
}

//Create a subclass.
class Dog extends Animal{
    //At this moment, we were facing this issue:
    //The type Dog must implement the inherited abstract method
    public void animalSound(){
        System.out.println("Woof, woof");
    }
} 

//Create another subclass
class Cat extends Animal{
    public void animalSound(){
        System.out.println("Meow, meow");
    }
}

public class Abstraction {
    //Create the main method.
    public static void main(String[] args){
        //Creating the objects of each class.
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        myDog.animalSound();
        myCat.animalSound();

        //What happens if we want to create an object from an abstract class?
        //Animal myAnimal = new Animal();        
        //We can't do that because abstract classes are not allowed
        //to create any objects from it.
    }
    
}
