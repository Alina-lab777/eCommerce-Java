package JavaClass12;

public class JavaClassWork12 {
    public static void main(String[] args) {

        /**
         * Syntax for Loop with Increment (start from Zero till the end):
         *     for (int i = 0; i<var.length; i++) {
         *         block of Code;
         *     }
         *
         *
         * Syntax for Loop Decrement (start from the End to the beginning):
         *      for (int i = var.length-1; i>0; i--) {
         *          block of Code;
         *      }
         *
         *      int i = var.length-1 ---> because at the 1st place we have to initialize,
         *                              so we can't compare to the length; That's why we have to equal Length vs Index;
         *
         *
         **/

        for (int i = 10; i>0; i-=2){
            System.out.println(i);
        }



        /**
         *
         * Interview Question: Reverse the String;
         *                     Check for Palindrome (the word that is read the same upward and backward)
         *          Ex: level --- Palindrome;
         *              racecar ---
         *              noon ---
         **/



        String str = "racecar";
        String reversedString = "";

        for (int j = str.length()-1; j>=0; j--){
            reversedString = reversedString + str.charAt(j);
        }
        // With the 1st round of Loop, it goes to "n" (this is a single character,
        // and charAt() is used) in "reversedString" it will store the "n";

        // With the 2nd round of Loop, it goes to "o" (this is a single character,
        // and charAt() is used) in "reversedString"  the "n" is already there + it will add "o"; till the end;
        System.out.println(reversedString);

        if (str.equalsIgnoreCase(reversedString)) {
            System.out.println("This word is Palindrome : " + reversedString);
        } else {
            System.out.println("This word not a Palindrome : " + reversedString);
        }

        /**
         * Provide "Pseudo Code", saying how you would solve the problem;
         *         1. Start from the end;
         *         2. Loop with decrement;
         *         3. Compare the results;
         **/



        // Advanced Operator with Increment Loop :

        for (int k = 0; k<=10; k+=2){ //(k+=2) ---- k = k + 2
            System.out.print(k + ",");
        }

        System.out.println();



        int[] someString = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int forEach : someString){
            System.out.println(forEach);
        }




        // Advanced Operator with Decrement Loop :

        for (int l = 20; l>=0; l-=2){
            System.out.print(l + ",");
        }


        System.out.println();

        /**
         * Nested For Loop ---> Loop within another Loop (Outer Loop and Inner Loop)
         *
         **/

        String[] flowers1 = {"Rose", "Tulip", "Daisy", "Violet"};
        String[] flowers2 = {"Orchid", "Lotus", "ROse", "Lavender"};


        for (int m = 0; m<flowers1.length; m++){ // It is taking the 0 Index (Rose) and comparing to the flower2;
            for (int n = 0; n < flowers2.length; n++){
                if (flowers1[m].equalsIgnoreCase(flowers2[n])) {
                    System.out.println("This flower is duplicate : " + flowers1[m]);
                }
            }
        }







    }
}
