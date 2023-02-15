package JavaClass5;

public class JavaHomeWork5 {
    public static void main(String[] args) {

        String stu = "Hello World";
        System.out.println(stu);
/**
 *   startsWith()----> Checks if strings starts with given prefix or characters;
 *     return type -----> boolean; case sensitive.
 * */

        String str1 = "Finally Friday!";
        boolean resultOfStartWith = str1.startsWith("f");
        System.out.println(resultOfStartWith);

        if (str1.startsWith("f")) {
            System.out.println("Yes it starts with");
        } else {
            System.out.println("No it does not starts with");

            boolean TernanyStartsWith = str1.startsWith("f") ? true : false;
            System.out.println(TernanyStartsWith);

            String TernaryStringStartsWith = str1.startsWith("f") ? "Dada" : "NetNet";
            System.out.println(TernaryStringStartsWith);

            /**
             *  toLowerCase() ----> converts all String to Lowercase;
             *  Return type is String;
             * */

            String lowerCaseString = str1.toLowerCase();
            System.out.println(lowerCaseString);

            /**
             * toUpperCase()----> convert all String to UPPER CASE;
             *   return type String;
             * */
            String UpperCaseString = str1.toUpperCase();
            System.out.println(UpperCaseString);


/**
 * trim() ----> removes extra space at the beginning of the String and Ending;
 * return type ------> String;
 *
 * */

            String trimString = "  I turn coffee into code    ";
            String afterTrimming = trimString.trim();
            System.out.println("  I turn coffee into code    " + afterTrimming);

/**
 *   Length() -------> Finds the Length of the String;
 *   return type -----> int;
 **/

            int LengthOfTrimString = trimString.length();
            System.out.println("The length of Str1 with trailing spaces " + LengthOfTrimString);

            int TheLengthofStr2 = afterTrimming.length();
            System.out.println("The length of Str1 without trailing spases : " + TheLengthofStr2);


            System.out.println("=============================Home Work==============================");


            String s1 = " I'm a automation Engineer ";
            String s2 = "Manual QA";
            String s3 = "";
            String s4 = " I'm%a%automation%Engineer ";

            System.out.println("=============================LENGTH=================================");


            int LengthOfString1 = s1.length(); // 27
            System.out.println("Length of String One  = " + LengthOfString1);
            int LengthOfString2 = s2.length();
            System.out.println("Length of String Two = " + LengthOfString2);

            if (LengthOfString1 > 20) {
                System.out.println("More than 20");
            } else {
                System.out.println("Less than 20");
            }

            boolean TernanyBooleanLength = LengthOfString1 > 20 ? true : false;
            System.out.println(TernanyBooleanLength);


            String TernaryStringLength = LengthOfString1 > 20 ? "It is more than 20" : "It is less that 20";
            System.out.println(TernaryStringLength);


            System.out.println("===========================UPPER AND LOWER CASE=========================================");


            String S1ToUpperCase = s1.toUpperCase();
            System.out.println(" S1 to Upper Case = " + S1ToUpperCase);
            String S2ToUpperCase = s2.toUpperCase();
            System.out.println(" S2 to Upper Case = " + S2ToUpperCase);


            String S1ToLowerCase = s1.toLowerCase();
            System.out.println("S1 to Lower Case = " + S1ToLowerCase);
            String S2ToLowerCase = s2.toLowerCase();
            System.out.println("S2 to Lower Case = " + S2ToLowerCase);


            System.out.println("=============================TRIM========================================");

            String S1Trim = s1.trim();
            System.out.println("Trim of s1 = " + S1Trim);
            String S4Trim = s4.trim();
            System.out.println("Trim of s4 = " + S4Trim);


            System.out.println("===========================STARTS WITH================================");

            boolean S1StartsWith = s1.startsWith("I'm");
            System.out.println(" does it starts with I'm = " + S1StartsWith);
            boolean S2StartsWith = s2.startsWith("I'm");
            System.out.println(" does it starts with I'm = " + S2StartsWith);
            boolean S3StartsWith = s3.startsWith("I'm");
            System.out.println(" does it starts with I'm = " + S3StartsWith);
            boolean S4StartsWith = s4.startsWith("I'm");
            System.out.println(" does it starts with I'm = " + S4StartsWith);

        }
    }

}






/**
 * HomeWork for 5th Class:
 *
 *   String s1 = " I'm a automation Engineer ";
 *   String s2 = "Manual QA";
 *   String s3 = “”;
 *   String s4 = " I'm%a%automation%Engineer ";
 *
 *  Check the length() of each String for s1 and s2,  print the result with appropriate message;
 *           if (the Length of s1 > 20 characters){
 *                sout("More than 20");
 *           }else {
 *                sout("Less than 20");
 *                 }

 *  Can use Ternary Operator and store result in  String variable;
 * 
 *
 *  Convert String s1, s2, to UpperCase(),  print the result with appropriate message;
 *  Convert String s1, s2, to LowerCase(),  print the result with appropriate message;
 *  trim() the String s1, s4  print the result with appropriate message;
 *  Check s1, s2, s3, s4 whether they startsWith() “I’m”,  print the result with appropriate message;
 *
 **/