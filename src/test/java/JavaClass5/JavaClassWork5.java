package JavaClass5;

public class JavaClassWork5 {
    public static void main(String[] args) {











      /**
       * startsWith() ---> checks if string starts with given prefix or combination of characters;
       *                 ---> case sensitive;
       *        return type ---> boolean;
       * */

       String str1 = "Finally Friday!";
       boolean resultOfStartsWith = str1.startsWith("Fin");
       System.out.println(resultOfStartsWith);



       /**
        * toLowerCase() ---> converts all String to lowercase;
        *      return type String;
        * */


       String lowercaseString = str1.toLowerCase();
       System.out.println(lowercaseString);



       /**
        * toUpperCase() ---> converts all String to Upper case;
        *       return type String;
        * */


       String toUpperCaseString = str1.toUpperCase();
       System.out.println(toUpperCaseString);


       /**
        * trim() ---> removes extra space at the beginning of String and ending (extra trailing spaces);
        *    return type ---> String;
        * */

       String trimString = " I turn coffee into code ";
       String afterTrimming = trimString.trim();
       System.out.println(afterTrimming);


        /***
         * length() ---> finds the length of the String;
         *      return type ---> int;
         */

        int theLengthOfStr = trimString.length();
        System.out.println("The length of Str1 with trailing spaces : " + theLengthOfStr);


        int theLengthOfStr2 = afterTrimming.length();
        System.out.println("The length of Str1 without trailing spaces : " + theLengthOfStr2);





    }
}
