/*
     * JAVA POLYMORMPHISM
     * 
     * Polymorphism means "many forms", and it occurs when we have 
     * many classes that are related to each other by inheritance.
     * 
     * For example, think of a superclass called Animal that has a 
     * method called animalSound(). Subclasses of Animals could be 
     * Pigs, Cats, Dogs, Birds - And they also have their own 
     * implementation of an animal sound (the pig oinks, and the cat 
     * meows, etc.)
     */
//Creamos la clase padre o superclass.
class Animal {
    //Creamos un metodo, este se heredera a las subclasses.
    public void animalSound(){
        System.out.println("The animal makes a sound!");
    }    
}    

//Creamos subclase
class Dog extends Animal{
    public void animalSound(){
        System.out.println("Woof, woof");
    }
}

//Creamos otra subclase
class Cat extends Animal{
    public void animalSound(){
        System.out.println("Meow, meow");
    }
}

public class Polymorphism {
    public static void main(String[] args){
        //Creamos los objetos de nuestras clases
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        //Accediendo a los metodos heredados.
        myAnimal.animalSound();
        myDog.animalSound();
        myCat.animalSound();
    }
}
