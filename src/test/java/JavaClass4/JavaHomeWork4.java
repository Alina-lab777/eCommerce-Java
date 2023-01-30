package JavaClass4;

public class JavaHomeWork4 {
    public static void main(String[] args) {

        String someString = "Hello World";

        char[] arrayOfChar = {'P', 'r', 'o', 'g', 'r', 'a', 'm', ' ', 'w', 'i', 't', 'h', ' ', 'J', 'a', 'v', 'a',};
        String afterConversion = new String(arrayOfChar);// I want my Array of char to become String;

        System.out.println(arrayOfChar);

        /**
         * chatAt() ----> I want to pass a certain Index #, you return me that character in the Story var;
         *  and I have to start it in the char var;
         * */

        char charAtMethod = someString.charAt(6); // Methods have brackets and it will have Index Value;

        System.out.println("The Index at 6th :" + charAtMethod);


/**
 *  IndexOf() ----> returns the position of 1st Occurrence of a char or String in a specified String
 *  and I have to store int var;
 *
 * */

        int indexOfWorld = someString.indexOf("World");

        System.out.println("Index of World : " + indexOfWorld);

/**
 *  concat() ------> will join or combine two or more Strings;
 *    and need to started in the String var;
 *
 * */

        String concatString = someString.concat(" - ").concat(afterConversion);
        System.out.println("Concat method result : " + concatString);

/**
 * contains()----> checks whether a string contains a  some part of String;
 * return types is Boolean;
 * */

        boolean resultOfContains = someString.contains("Hello"); // May contain part of char;
        System.out.println("If String contains Hello : " + resultOfContains);

        if (someString.contains("kkk")) {
            System.out.println("Yes, it does contain thet value !");

        } else
            System.out.println("No, there is no such thing ! ");



/**
 *  endWith()----> checks whether a String ends with combination char or combination of char;
 *   return type is Boolean;
 * */


        boolean resultOfEndWith = afterConversion.endsWith("va");
        System.out.println("Result of EndWith Method : " + resultOfEndWith);

        if (afterConversion.endsWith("Java")) {
            System.out.println("Yes, the verification of endWith() is true  ");
        } else {
            System.out.println("No, the verification of endWith () is false  ");

        }
        /**
         *equal() ----> checks whether one String is equal to another String;
         * return type is Boolean;
         * */

        boolean resultOfEquals = someString.equals("Hello"); //Case Sensitive;
        System.out.println("Result Of Equals Method: " + resultOfEquals);


        // In If Else condition;
        if (someString.equals("Hello")) {
            System.out.println("Two Strings are the Same! ");
        } else {
            System.out.println("The two Strings are not equal ! ");
        }

        System.out.println("===========Practicing Home Work 4============");

        String str1 = "I'm a Java Programmer";
        String str2 = "I'm";
        String str3 = "an Automation";
        String str4 = "Engineer";
        String str5 = "EnginEER";

        System.out.println("=============CHAR AT================");

        char FindingIndex6CharAt = str1.charAt(6);
        System.out.println("1. Finding CharAt Index 6 = " + FindingIndex6CharAt);

        System.out.println("==============CONCAT====================");

        String concatResult = str2.concat(" ").concat(str3).concat(" ").concat(str4);
        System.out.println("2. Concat Result of str2 str3 str4 = " + concatResult);

        System.out.println("=============CONTAINS====================");

        boolean containsResults = concatResult.contains("automation");//run it separately;
        System.out.println("3. Contains Results for 'automation' is = " + containsResults);

       if (concatResult.contains("I am")) {
           System.out.println("3.1 Yes it does contain " + concatResult);
       }
       else {
            System.out.println("3.1 No it does not " + concatResult);
        }

       String TernaryCheck= concatResult.contains("automation")? "yes" : "no";
        System.out.println("Ternary Check " + TernaryCheck);

        if (concatResult.contains("I am")) {
            System.out.println("====Yes it does contain I am = " + concatResult);
        } else {
            System.out.println( "=====No it does not contain = " + concatResult);
        }

        System.out.println("==============ENDS WITH=======================");

        boolean endsWithResult = concatResult.endsWith("r");// run it separately; true;
        System.out.println("4. EndsWith Result 'r'  = " + endsWithResult);

        if (concatResult.endsWith("r")) {
            System.out.println("Yes, it ends with 'r'" + concatResult);
        }else {
            System.out.println("No, it does not ends with 'r'" + concatResult);
        }

        String EndsWithTernary = concatResult.endsWith("r") ? "true String" : "false String";
        System.out.println( "EndsWithTernary " + EndsWithTernary);



        if(concatResult.endsWith("Ends with r" )) {
        }else {
            System.out.println("Doesn't end with r" );
        }


        System.out.println("==================EQUALS==============");

        boolean equalsResult = str4.equals(str5); // Case sensitive;
        System.out.println("5 Equals Result of str4 vs str5  = " + equalsResult);

        if(str4.equals(str5)) {
            System.out.println("Y Equals to str5 ");
        }else {
            System.out.println("No it is not equal to str5"); }

String EqualTernary = str4.equals(str5)? "It is true" : "It is false";
        System.out.println("EqualTernary ");



        boolean equalResult2 = str2.equals(str3);
        System.out.println("Result of str 2 and str3 =  " + equalResult2);

if (str2.equals(str3)) {
    System.out.println("It is equal to str3");
} else{
            System.out.println("It is not equal to str3");
        }

String BooleanTernary = str2.equals(str3)? "day" : "night";
        System.out.println(BooleanTernary);

String EqualTernary2 = str2.equals(str3)? "true":"false";
        System.out.println(EqualTernary2);


        System.out.println("==============EQUAL IGNORE CASE=========");

        boolean equalIgnoreCaseResult = str4.equalsIgnoreCase(str5);// True
        System.out.println("6. Equal Ignore Case Result for str4 vs str5  = " + equalIgnoreCaseResult);

if (str4.equalsIgnoreCase(str5)) {
    System.out.println("Yes it is Equal Ignore Case str5 ");

}else {
    System.out.println("No it is not Equal Ignore Case str5 ");
}

boolean EqualIgnoreTernary = str4.equalsIgnoreCase(str5)? true:false;
        System.out.println(EqualIgnoreTernary);

        String EqualIgnoreTernaryString = str4.equalsIgnoreCase(str5)? "YAYA true": "YAYA false";
        System.out.println(EqualIgnoreTernaryString);





        System.out.println("=============INDEX OF=================");

        int indexOfJava = str1.indexOf("Java");
        System.out.println("7. Index of 'Java' = " + indexOfJava);//6;

        int indexOfProgrammer = str1.indexOf("Programmer");
        System.out.println("7. Index of 'Programmer' = " + indexOfProgrammer);//11;

        int indexOfAn = str3.indexOf("an");
        System.out.println("7. Index of 'an' = " + indexOfAn);//0;

        int indexOfI = str4.indexOf("i");
        System.out.println("7. Index of 'i' = " + indexOfI);//3;


    }

}
/**
 * 1. Find charAt() index# 6 in str1.charAt(6);
 * <p>
 * 2. Create String Variable named "result" to concat() str2, str3, str4;
 * <p>
 * 3. Check if string created (named "result") from previous step#2 contains() these values "automation", "Automation", "engineer";
 * <p>
 * 4. Check if string created (named "result") from previous step#2 endWith() - "r", "engineer","neer"
 * <p>
 * 5. Check if string str4 equals() to str5 and str2 equals() to str3;
 * <p>
 * 6. Check if string str4 equalsIgnoreCase() to str5;
 * <p>
 * 7. Find indexOf('Java') and Find indexOf(Programmer) in str1;
 * Find  indexOf('an') in str3;
 * Find indexOf('i') in str4;
 */
