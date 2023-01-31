package JavaClass6;

public class JavaHomeWork6 {
    public static void main(String[] args) {


        /**
         * String s1 = "";
         * String s2 = "Monday Beginning of Working Week";
         * <p>
         * <p>
         * Check if String s1 and s2 are empty(),  print the result with appropriate message;
         * Check lastIndexOf() the String s2,  print the result with appropriate message;
         * Replace all “e” characters in String s2 for character “z” and  print the result with appropriate message;
         * split() String s2 based on “ ” store in array[] of String and print each position based on Index[0];
         * With the help of substring() print the output “Working” from the s2;
         */


        System.out.println("====================EMPTY=============================================");

        String s1 = "";
        String s2 = "Monday Beginning of Working Week";

        boolean CheckingS1 = s1.isEmpty();
        boolean CheckingS2 = s2.isEmpty();

        System.out.println("RESLUT FOR S1 = " + CheckingS1); //true;
        System.out.println("RESLUT FOR S2 = " + CheckingS2); //false;

        if (CheckingS1) {
            System.out.println("Yes it is Empty");
        } else {
            System.out.println("No it's not Empty");
        }
        if (CheckingS2) {
            System.out.println("Yes it is Empty 2 ");
        } else {
            System.out.println("No it's not Empty 2 ");
        }

        System.out.println("====================LAST INDEX OF===========================================");


        int LastIndexResult = s2.lastIndexOf("Week");
        System.out.println("Result for Last Index Of = " + LastIndexResult);

        if (LastIndexResult > 20) {
            System.out.println("More that 20");
        } else {
            System.out.println("Less that 20");
        }

        System.out.println("======================REPLACE=================================================");

        String ResultForReplace = s2.replace("e", "z");
        System.out.println("Result for Replace = " + ResultForReplace);


        System.out.println("======================SPLIT=================================================");

        String[] ResultOfArraySplitIndexes = s2.split(" ");

        System.out.println(ResultOfArraySplitIndexes[0]);
        System.out.println(ResultOfArraySplitIndexes[1]);
        System.out.println(ResultOfArraySplitIndexes[2]);
        System.out.println(ResultOfArraySplitIndexes[3]);
        System.out.println(ResultOfArraySplitIndexes[4]);

        System.out.println("=====================SUBSTRING=======================================================");

        String ResultOfSubString = s2.substring(20, 27);
        System.out.println("Result of SubString  = " + ResultOfSubString);

        System.out.println("=============================================================================");

        /**
         * isEmpty() ---> checks if the String empty or not;
         *      return type ---> boolean;
         **/

        String emptyString = "";
        String notEmptyString = "Monday";


        System.out.println(emptyString.isEmpty());
        System.out.println(notEmptyString.isEmpty());

        if (emptyString.isEmpty()) {
            System.out.println("yes it is empty");
        } else {
            System.out.println("no it is not empty");
        }

        if (notEmptyString.isEmpty()) {
            System.out.println("IT IS EMPTY");
        } else {
            System.out.println("IT IS NOT EMPTY");
        }

        isEmpty(emptyString.isEmpty());
        isEmpty(notEmptyString.isEmpty());


        /**
         * lastIndexOf() ---> returns the last method of given String character value or substring;
         *    return type ---> int;
         * */

        // Will return the Index of The first character;
        String exampleForLastIndex = "This is the last Index example";
        int lastIndexOf = exampleForLastIndex.lastIndexOf("is");
        System.out.println("This is the Index of 'is' = " + lastIndexOf);

        if (lastIndexOf > 3) {
            System.out.println("The index is more than third position ");
        } else {
            System.out.println("The index is less  that third position ");
        }


        /**
         * replace() ---> returns the outcome of replaced character in the String;
         *    return type ---> String;
         * */

        // Case sensitive;
        String replacedString = exampleForLastIndex.replace('I', 'a');
        System.out.println("Replaced String result : " + replacedString);


        /**
         * split() ---> splits the String as per given character/symbol/space and returns Array of String;
         *
         * */

        String exampleForSplit = "This is example for Split";
        String[] afterSplitting = exampleForSplit.split(" ");
        System.out.println(afterSplitting[0]);
        System.out.println(afterSplitting[4]);
        System.out.println(afterSplitting[1]);
        System.out.println(afterSplitting[2]);
        System.out.println(afterSplitting[3]);

        String testForChar = "Laptop";
        String[] arrayOfString = testForChar.split("p");
        System.out.println(arrayOfString[0]);
        System.out.println(arrayOfString[1]);


        /**
         * substring ---> method returns a part of the String by passing the starting Index;
         *    return type ---> string;
         * */

        String exampleForSubString = "JavaProgress";
        String theProgressWord = exampleForSubString.substring(4); //Will return "Progress" as whole word;
        System.out.println(theProgressWord);


        String theWordJAva = exampleForSubString.substring(0, 4);//Will return from starting Index and ending, but you have to add + 1 Index;
        System.out.println(theWordJAva);


    }

    public static boolean isEmpty(boolean someBoolean) {
        if (someBoolean) {
            System.out.println("Empty in my Method");
        } else {
            System.out.println("Not empty in my Method");
        }
        return someBoolean;
    }


}






