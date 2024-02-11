/*
 * JAVA ENUMS
 * 
 * An enum is a special "class" that represents a group of constants 
 * (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), 
and separate the constants with a comma. Note that they should be in 
uppercase letters
 */
enum Animo{
    BAJO, 
    MEDIO,
    CONTENTO
}
public class Enum {
    public static void main(String[] args){
        Animo miAnimo = Animo.CONTENTO;
        System.out.println("Valor de miAnimo: " + miAnimo);

        for(Animo miAnimo2 : Animo.values()){
            System.out.println(miAnimo2);
        }
    }
}
