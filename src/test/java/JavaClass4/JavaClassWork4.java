package JavaClass4;

public class JavaClassWork4 {
    public static void main(String[] args) {


        String someString = "Hello World";

        char[] arrayOfChar = {'P', 'r', 'o', 'g', 'r', 'a', 'm', ' ', 'w', 'i', 't', 'h', ' ', 'J', 'a', 'v', 'a'};
        String afterConversion = new String(arrayOfChar);// I want my Array of Char to become a String by creating "new" String;

        System.out.println(afterConversion); //Program with Java

        char[] arrayOfChar1 = {'P', 'r', 'o', 'g', 'r', 'a', 'm'};
        String charit = new String(arrayOfChar1);
        System.out.println(charit);


        /**
         * charAt() ---> I want to pass a certain Index#, you return me that character in the String var;
         *     and I have to store it in the char var;
         *
         * */

        char charAtMethod = someString.charAt(6);
        System.out.println("The Index at 6th : " + charAtMethod);


        /**
         * indexOf() ---> returns the position of 1st Occurrence of a char or String in a specified string;
         *   and I have to store in int var;
         * */

        int indexOfWorld = someString.indexOf("World");
        System.out.println("Index of World : " + indexOfWorld);




        /**
         * concat() ---> will join or combine 2 or more strings;
         *    and need to stored in a String var;
         * */


        String concatString = someString.concat(" - ").concat(afterConversion);
        System.out.println("Concat method result : " + concatString);




        /**
         * contains() ---> checks whether a string contains a char or some part of a String;
         *  return types is Boolean;
         *
         * */


        boolean resultOfContains = someString.contains("ld");
        System.out.println("If String contains Hello : " + resultOfContains);


        //Checking with If-Else statement:

          if (someString.contains("kkk")) {
              System.out.println("Yes, it does contain that value !");
          }  else {
              System.out.println("No, there is no such thing ! ");
          }


        /**
         * endWith() --- checks whether a String ends with a char or combination of char;
         *       return type is Boolean;
         * */

        Boolean resultOfEndWith = afterConversion.endsWith("Java");
        System.out.println("Result of endWith Method : " + resultOfEndWith);



        // checking the same in If-Else statement:

        if (afterConversion.endsWith("Python")) {
            System.out.println("Yes, the verification of endWith() is true");
        } else {
            System.out.println("No, the verification of endWith() is false");
        }




        /**
         *  equal() ---> checks whether one String is equal to another string;
         *      return type is Boolean;
         * */


        boolean resultOfEquals = someString.equals("Hello World");
        System.out.println("The result of equals method : " + resultOfEquals);


        String resultOfEqualInTernary = someString.equals("Hello World") ? "Two Strings are the Same !" : "Two Strings aren't the Same !";
        System.out.println(resultOfEqualInTernary);


        // In If-else condition;

        if (someString.equals("Hello World")) { System.out.println("Two Strings are the Same !");
        }
        else {System.out.println("Two Strings aren't the Same !");}





        /**
         * equalsIgnoreCase() ---> will check/compare if two Strings are the same irrespective of a case;
         *     return type is boolean;
         * */

        String s1 = "Learn to code now";
        String s2 = "LEARN TO COD NOW";


        boolean resultOfEqualsIgnoreCase = s1.equalsIgnoreCase(s2);
        System.out.println("The result of EqualsIgnoreCase method : " + resultOfEqualsIgnoreCase);


        String ternaryResult = s1.equalsIgnoreCase(s2) ? "Yes, they are equal " : "Nope, they aren't ! ";
        System.out.println(ternaryResult);



        if (s1.equalsIgnoreCase(s2)) { System.out.println("Yes, they are the same, checked within If statement, and it is true");
        }
        else {System.out.println("No, they aren't, else block got executed ");}


        /** Ternary Operator:
         * Statement ? "Expression1" : "Expression2";
         *       if Statement returns true ---> "Expression1" will be executed;
         *                if Statement returns false ---> "Expression2" will be executed;
         *
         *
         *  If-else Condition:
         *    if (Statement) {
         *     true result will get executed in this block of Code ;
         *    } else {
         *        false result will get executed in else block of Code;
         *    }
         *
         *
         * */
    }
}
