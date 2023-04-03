package JavaClass20.Inheritance;

public class SubClass extends SuperClass{





    public boolean isStringIdentical (String str1, String str2){
        System.out.println("Checking in Child/Sub Class");
        return (str1.equalsIgnoreCase(str2));
    }


}
