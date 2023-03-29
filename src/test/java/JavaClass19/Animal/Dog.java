package JavaClass19.Animal;

public class Dog extends Animal{

    int dogAge;



    public void bark(){
        System.out.println("Barking in Dog class");
    }


    public void setTypeInfo (String specie, String breed, int dogAge){
        super.specie = specie;
        super.breedOrName = breed;
        this.dogAge = dogAge;
    }


    public String toString(){
        return ( "This Dog specie is : " + specie + "\n"
                +"This Dog breed is : " + breedOrName + "\n"
                +"This Dog age is : " + dogAge);
    }





}
