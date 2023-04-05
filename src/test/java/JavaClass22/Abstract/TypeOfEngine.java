package JavaClass22.Abstract;

public interface TypeOfEngine {


    public void typeOfEngine();


    default void typeOfEngineDefault(){
        System.out.println("By default the type of Engine is Petroleum");
    }
}
