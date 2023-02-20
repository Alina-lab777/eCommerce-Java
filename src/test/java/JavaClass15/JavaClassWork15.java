package JavaClass15;

public class JavaClassWork15 {

    /**
     * Class vs Object
     *
     *
     *  What is the Java Class?
     *      It is the BluePrint (template, schema) of an object. It is used to create Objects.
     *
     *  What is the Object?
     *      An Object it is the Instance (sample, occurrence) of a Java Class.
     *
     *  Ex: Class --- can be just car manufacturing factory;
     *      Object --- BMW, Audi, Lexus;
     *
     *
     *
     *  Class can have it is own variables (usually defined after ClassName) and methods (could be any lines of code);
     *
     *
     *  Access Modifier ---> defines access type of Class, variable, Methods (Class Properties);
     *      4 Types of access Modifier:
     *              1. public: accessible throughout the Entire Project;
     *              2. protected: accessible within the Package;
     *              3. private: accessible within the Class;
     *              4. default: defined without any modifier. Accessible within a Package;
     *
     *  All access modifiers are applied to Classes, Methods, Field Variables;
     *
     *  Field/Global Variables --- defined after ClassName (on the top)
     *
     *
     *
     *
     *
     *
     **/

     private int someVarFromClass15 = 150;
     double someDouble = 11.44;
     private String str = "someString";


     /**
      * Java Methods ---> it is a Collection of statement that perform some specific task and return the result
      *                    to the caller or not returning anything (meaning "void");
      *
      *
      * Syntax:
      *
      *  <access_modifier> <return type> methodName (number of Parameters) {
      *      Lines of Code;
      *  }
      *
      *
      **/

     // Generic method ---> can be reused as many times as you want;
     public int maxNumberBetweenXAndY (int x, int y) {
         if (x>y){
             return x;
         } else {
             return y;
         }
     }



     public int addTwoNumbers (int x, int y){
       int z =  x + y;
       return z;
     }




    public static void main(String[] args) {

        JavaClassWork15 class15 = new JavaClassWork15();

        int inMainMethod = class15.someVarFromClass15; // 150

      //  System.out.println(inMainMethod);


        int inMainMethod2 = class15.maxNumberBetweenXAndY(135, 155);
        System.out.println("From Max Number : " + inMainMethod2);

        int inMainMethod3 =  class15.maxNumberBetweenXAndY(0, 122);
        System.out.println("From Max Number : " + inMainMethod3);

        int  inMainMethod4 = class15.maxNumberBetweenXAndY(-1, -25);
        System.out.println("From Max Number : " + inMainMethod4);

        int  inMainMethod5 = class15.maxNumberBetweenXAndY(36, 11);
        System.out.println("From Max Number : " + inMainMethod5);


        System.out.println("=======================================");

        int additionOf2Numbers= class15.addTwoNumbers(10,20);
        System.out.println("From Addition : " +  additionOf2Numbers);


        int additionOf2Numbers2= class15.addTwoNumbers(136095,14689);
        System.out.println("From Addition : " +  additionOf2Numbers2);




    }
}
