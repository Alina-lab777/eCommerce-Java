package JavaClass9;

import org.w3c.dom.ls.LSOutput;

import java.util.Calendar;

public class JavaHomeWork9 {
    public static void main(String[] args) {


/**
 *  switch (expression ) {
 *      case a :
 *      block of code
 *      break;
 *
 *      case b:
 *      block of code
 *      break;
 *
 *      case c:
 *      block of code
 *      break;
 *
 * */

        int age = 65;
        switch (age) {

            case 16:
                System.out.println("Ineligible to vote");
                break; // If no breaks in between the case, it won't stop;
            case 21:
                System.out.println("Eligible to vote");
                break;
            case 35:
                System.out.println(" Eligible to vote");
                break;
            case 65:
                System.out.println("Senior Citizen");
                break;

        }

        System.out.println("=======================================================");


        //ENUM (Enumeration)----->constant value unchanged. (Days of the week, month etc.)
        switch (Calendar.DAY_OF_WEEK - 6) {

            case 1:
                System.out.println("The day in Monday");
                break;
            case 2:
                System.out.println("The day in Tuesday");
                break;
            case 3:
                System.out.println("The day in Wednesday");
                break;
            case 4:
                System.out.println("The day in Thursday");
                break;
            case 5:
                System.out.println("The day in Friday");
                break;
            case 6:
                System.out.println("The day in Saturday");
                break;
            case 7:
                System.out.println("The day in Sunday");
                break;

        }

        System.out.println("======================var=================================");


        int var = 16;
        var += 10; // = 26

        int increment = var + 8 + (++var); // incremented age = 26 +8 + (26+1) = 61;
        System.out.println(increment);

        switch (var) {

            case 16:
                System.out.println("Ineligible to vote");
                break; // If no breaks in between the case, it won't stop;
            case 21:
                System.out.println("Eligible to vote");
                break;
            case 35:
                System.out.println(" Eligible to vote as well");
                break;
            case 65:
                System.out.println("Senior Citizen");
                break;

        }

        System.out.println("======================================================");


        String str = "MaTH";
        switch (str.toLowerCase()) {

            case "math":
                System.out.println("This is Math class");
                break;
            case "Biology":
                System.out.println("This is biology class");
                break;
            case "Geography":
                System.out.println("This is Nature Class");
                break;
            default:
                System.out.println("Unknown class type");
        }


        /**
         *  For each Loop or Enhanced Loop :
         *
         *  Syntax:
         *
         *  for (type variable : arrayName) {
         *      block of code;
         *  }
         * Usually this Type of Loop is used with []
         arrays to print all values;         * */

        System.out.println("======================================================");


        String[] cars = {"BMW", "AUDI", "TESLA", "LEXUS"};
        for (String i : cars) {
            System.out.print(i + ",");

        }

        System.out.println("===================================days=====================");


        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (String x : days) {
            System.out.print(x + ",");
        }


        System.out.println("=====================================================");

        int[] numbers = {10, 23, 30, 43, 50};
        for (int j : numbers) {
            System.out.print(j + ","); // prints everything in one line
        }


        System.out.println("=====================================================");

        int[] numbers1 = {15, 20, 35, 40, 55};
        for (int h : numbers1) {
            if (h % 2 == 0) {
                System.out.print(h + " : is even number "); // prints everything in one line
            } else {
                System.out.println(h + "  Odd number : ");
            }


            System.out.println("====================================================");


            int[] numb = {3, 894, 2389, 473, 878, 934, 579,};
            for (int q : numb) {
                if (q % 2 == 0) {
                    System.out.print(q + " This number is even, ");
                } else {
                    System.out.print(q + " This number  is odd, ");
                }
            }


        }


        System.out.println("=================================================");


        int[] numi = {15, 20, 35, 40};
        for (int k : numi) {
            switch (k) {
                case 15:
                    System.out.println("this number  " + k + " got executed ");
                    break;
                case 25:
                    System.out.println("this  number  " + k + " got executed ");
                    break;
                case 35:
                    System.out.println("this number  " + k + " got   executed ");
                    break;
                case 45:
                    System.out.println("this number    " + k + " got executed ");
                    break;
                default:
                    System.out.println("unknown number");


// IT WENT AND EXECUTED 15, IT COULD NOT FIND 20 SO IF WENT AHEAD AND EXECUTED UNKNOWN
                    // IT AGAIN AND EXECUTED 35 AND IT COULD NOT FIND 40 SO IT EXECUTED UNKNOWN
            }

        }


        System.out.println("=======================================Home Work=======================");

/**
 * Create array of String[] and pass values as : "January", "April", "June", "October";
 *                 String[] and pass values as : "December","March", "July", "September";
 *
 * With the help of enhanced (for each loop) your program  should sout it 'switch case'
 * statement for related season; (In switch Case Statement, group them according to the 4 seasons)
 *
 * Ex for sout: The month of January is in Winter;
 *              The month of April is in Spring;
 *              The month  of June is in Summer;
 *
 * Make sure your program will handle not only indicated months in the array of String, but all 12.
 * */


        String[] seasons = {"January", "May", "June"};//not about this one


        for (String s : seasons) //s taking the value of seasons one by one and passing to switch case statement;
        switch (s) {
            case "December":
            case "January" :
            case "February":
                System.out.println("The month of " + s +  " is in Winter");
                break;
            case "March":
            case "April":
            case "May" :
                System.out.println("The month of " + s +  " is in Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("The month of " + s +  " is in Summer");
                break;
            case "September" :
            case "October":
            case "November":
                System.out.println("The month of " + s +  " is in Fall");
                break;

        }


    }
}
