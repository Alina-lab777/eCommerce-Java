package JavaClass20.Inheritance;

public class SuperClass {

    String superString = "Super String";
    int superInt = 1122;
    char superChar = 'a';


    public boolean isStringIdentical (String str1, String str2){
        System.out.println("Checking in Super/Parent Class");
        return (str1.equals(str2));
    }


    public int inheritedWillMoney (int num1, int num2){
        return num1 + num2;
    }


}
