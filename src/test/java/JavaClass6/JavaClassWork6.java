package JavaClass6;

public class JavaClassWork6 {
    public static void main(String[] args) {

        /**
         * isEmpty() ---> checks if the String empty or not;
         *      return type ---> boolean;
         **/

        String emptyString = "";
        String notEmptyString = "Monday";


        System.out.println(emptyString.isEmpty());
        System.out.println(notEmptyString.isEmpty());


        isEmpty(emptyString.isEmpty());
        isEmpty(notEmptyString.isEmpty());


        /**
         * lastIndexOf() ---> returns the last method of given String character value or substring;
         *    return type ---> int;
         * */

        // Will return the Index of The first character;
        String exampleForLastIndex = "This is the last Index example";
        int  lastIndexOf = exampleForLastIndex.lastIndexOf("is");
        System.out.println("This is the Index of 'is' = " + lastIndexOf);



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

       String exampleForSubString = "JavaProgress";// P at 4th Index,
       String theProgressWord=exampleForSubString.substring(4); //Will return "Progress" as whole word;
        System.out.println(theProgressWord);


        String theWordJAva=exampleForSubString.substring(0,4);//Will return from starting Index and ending, but you have to add + 1 Index;
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
