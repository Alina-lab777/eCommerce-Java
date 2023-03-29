package JavaClass19.Animal;

public class Animal {

    protected String specie;

    String breedOrName;

    int animalAge;


    public void jump(){
        System.out.println("Jumping in Super/Parent class");
    }


    public void bark(){
        System.out.println("Barking in Animal");
    }


    public void setTypeInfo (String specie, String name, int age){
        this.specie = specie;
        this.breedOrName= name;
        this.animalAge = age;
    }




}
