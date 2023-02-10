package JavaClass11;

import java.nio.charset.StandardCharsets;

public class Mid_Term_Coding_Challenge {
    public static void main(String[] args) {

        /**
         *int x = 50;
         *int y = 10;
         *Print "Hello World" if x is greater than y.
         *
         **/




        /**
         *int x = 50;
         *int y = 50;
         *Print "Yes" if x is equal to y, otherwise print "No"
         *
         **/





        /**
         * int x = 100;
         * int y = 80;
         * Print "1" if x is equal to y, print "2" if x is greater than y, otherwise print "3".
         *
         **/





        /**
         * Insert the missing parts to complete the following statement
         * (ternary operator):
         *
         * int time = 20;
         * String result = time < 18  "Good day." "Good evening.";
         * System.out.println(result);
         *
         **/






        /**
         *Insert the missing parts to complete the following switch statement:
         * int day = 6;
         * switch () {
         *     6:
         *     System.out.println("Saturday");
         *
         *     7:
         *     System.out.println("Sunday");
         *
         *
         *     System.out.println("Unknown Day");
         *
         * }
         *
         **/







        /**
         * Loop through the items in the cars array using Enhanced Loop.
         * String[] cars = {"Volvo", "BMW", "Ford"};
         *
         * Print only "BWM";
         *
         * use one of these methods: startWith(); contains(); equals();
         *
         **/








        /**
         *  Loop through the items in the cars array using Loop (any type).
         *  String[] cars = {"Volvo", "BMW", "Ford", "Mercedes", "Volkswagen", "Chevrolet"};
         *  Use For Loop
         *
         *  Print only the one, which number of letters more than 6;
         *          Output should look like this:
         *                      Number of characters more than 6 : Mercedes
         *                      Number of characters more than 6 : Volkswagen
         *                      Number of characters more than 6 : Chevrolet
         *
         * Print only the one, which number of letters less than 4;
         *          Output should look like this:
         *                      Number of characters less than 4 : BMW
         *                      Number of characters less than 4 : Ford
         *
         * Else print whatever is left:
         *           Output : "Volvo";
         *
         **/


        String[] cars = {"Volvo", "BMW", "Ford", "Mercedes", "Volkswagen", "Chevrolet"};
        for (int i = 0; i<cars.length; i++){
            if (cars[i].charAt(i) > 6 ){
                //System.out.println("lllll");
            }
        }







        /**
         * Write the code to return ABBREVIATION for any given String
         *   Ex:
         * String str = "Don't expect the results without the hard work" --- DETRWTHW
         *
         * Hint :
         *     1. In order to get 1st Letter of Each word, you need to split given str;
         *     2. After Splitting you need to Loop it through, make sure you use length;
         *     3. Create String variable, that will temporarily hold each value while looping;
         *     4. Use Substring() method and pass Starting and Ending index;
         *     5. Convert it toUppercase();
         *
         **/




        String str = "Don't expect the results without the hard work any number of letter letter letter any words ";

        // In order to get 1st Letter, we have to split it using split method, return String[], store it;
        String[] afterSplit = str.split(" ");

        // In order to get the Items one by one we are Looping through, using the length,
        // so our code can handle dynamically;

        for (int i =0; i<afterSplit.length; i++) {

            //I'm instructing to 'i' to get me the Items beginning letter by using substring (0,1)

            String temp = afterSplit[i].substring(0,1).toLowerCase();

            System.out.print(temp);

        }







        /**
         * Write the code to return the Capitalized string
         *
         * String quote = "work hard in silENce. let SUCCESS make the noiSE";
         * Should be :
         * String quoteAfterCoding = "Work Hard In Silence. Let Success Make The Noise";
         *
         * Hint:
         *      1. In order to get 1st Letter of Each word, you need to split given str.
         *      2. After Splitting you need to Loop it through, make sure you use length;
         *      3. Create String variable, that will temporarily hold each value while looping;
         *      4. Use Substring() method and pass Starting and Ending index, convert it toUppercase();
         *      5. Concatenate it with the rest of String use Substring() method and pass Starting index, convert it toLowerCase();
         *
         **/






        /**
         * int [] speedingRangeOverTheLimit = {10, 25, 38, 45};
         * Use Fool Loop
         *
         *
         * 1 to 10 mph over the limit
         *          System.out.println("Your driving penalty points are = 3");
         * 11 to 20 mph over the limit
         *          System.out.println("Your driving penalty points are = 4");
         * 21 to 30 mph over the limit
         *          System.out.println("Your driving penalty points are = 6");
         * 31 to 40 mph over the limit
         *          System.out.println("Your driving penalty points are = 8");
         * 41 mph and up over the limit
         *          System.out.println("Your driving penalty points are = 11");
         *  else
         *      System.out.println("Your driving license is suspended");
         *
         **/











    }


}
