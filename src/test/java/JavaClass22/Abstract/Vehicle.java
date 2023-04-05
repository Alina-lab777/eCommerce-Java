package JavaClass22.Abstract;

public abstract class Vehicle {

    public static String str1 = "Public static String";
    private String str2 = "Private String";
    protected String str3 = "Protected String";
    String str4 = "Default String";


    public abstract int gasTankVolumeInGallons(int someVolume);


    protected abstract int enginePower();


    public final void someFinalMethod(){
         System.out.println("This is Final method and body has be provided in Abstract Class");
     }


    public String nonAbstractMethod (String userPass){
        System.out.println("I'm not Abstract Method!!!");
        return userPass;

    }

}
