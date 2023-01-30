package JavaClass4;

public class JavaHomeWork4 {
    public static void main(String[] args) {

 String someString = "Hello World";

 char [] arrayOfChar = {'P','r', 'o','g', 'r','a', 'm', ' ', 'w', 'i', 't', 'h', ' ', 'J', 'a', 'v', 'a' , };
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

System.out.println("Index of World : "  + indexOfWorld);

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

Boolean resultOfContains = someString.contains("Hello"); // May contain part of char;
        System.out.println("If String contains Hello : " + resultOfContains);


/**
 *  endWith()----> checks whether a String ends with combination char or combination of char;
 *   return type is Boolean;
 * */


Boolean resultOfEndWith =  afterConversion.endsWith("va");
        System.out.println("Result of EndWith Method : " + resultOfEndWith);


        /**
         *equal() ----> checks whether one String is equal to another String;
         * return type is Boolean;
         * */

Boolean resultOfEquals = someString.equals("Hello"); //Case Sensitive;
        System.out.println("Result Of Equals Method: " + resultOfEquals);
        

        /**
         *
         *
         * */


        System.out.println( "===========Practicing Home Work 4============");

        String str1 = "I'm a Java Programmer";
        String str2 = "I'm";
        String str3 = "an Automation";
        String str4 = "Engineer";
        String str5 = "EnginEER";

        System.out.println("=============CHAR AT================");

        char FindingIndex6CharAt = str1.charAt(6);
        System.out.println("1. Finding CharAt Index 6 = " + FindingIndex6CharAt);

        System.out.println("==============CONCAT====================");

        String concatResult = str2.concat(" ").concat(str3).concat(" ").concat(str4) ;
        System.out.println("2. Concat Result of str2 str3 str4 = " + concatResult);

        System.out.println("=============CONTAINS====================");

        Boolean containsResults = concatResult.contains("automation Automation engineer");//??????? How to check multiple contains?;
        System.out.println("3. Contains Results for 'automation' 'Automation' 'engineer' is = " + containsResults);

        System.out.println("==============ENDS WITH=======================");

        Boolean endsWithResult =  concatResult.endsWith("r engineer neer") ;//?????? How to check multiple endings?;
        System.out.println("4. EndsWith Result 'r' 'engineer' 'neer' = " + endsWithResult);

        System.out.println("==================EQUALS==============");

        Boolean equalsResult = str4.equals(str5)  && str3.equals(str2); //?????? How to check multiple equals?;
        System.out.println ("5 Equals Result of str4 vs str5 and str2 vs str3 = " + equalsResult);

        System.out.println("==============EQUAL IGNORE CASE=========");

        Boolean equalIgnoreCaseResult = str4.equalsIgnoreCase(str5);// True
        System.out.println("6. Equal Ignore Case Result for str4 vs str5  = " + equalIgnoreCaseResult);

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
 *
 * 2. Create String Variable named "result" to concat() str2, str3, str4;
 *
 * 3. Check if string created (named "result") from previous step#2 contains() these values "automation", "Automation", "engineer";
 *
 * 4. Check if string created (named "result") from previous step#2 endWith() - "r", "engineer","neer"
 *
 * 5. Check if string str4 equals() to str5 and str2 equals() to str3;
 *
 * 6. Check if string str4 equalsIgnoreCase() to str5;
 *
 * 7. Find indexOf('Java') and Find indexOf(Programmer) in str1;
 *                             Find  indexOf('an') in str3;
 *                             Find indexOf('i') in str4;
 *
 * */
