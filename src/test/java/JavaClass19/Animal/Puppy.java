package JavaClass19.Animal;

public class Puppy extends Dog {



    public void bark(){
        System.out.println("Barking in Puppy class");
    }


    public void jump(){
        super.jump();
       // System.out.println("In Puppy");
    }
}
