package JavaClass9;

import java.util.Calendar;

public class JavaClassWork9 {
    public static void main(String[] args) {

        /**
         * switch (expression) {
         *     case a :
         *     block of code
         *     break;
         *
         *     case b :
         *     block of code
         *     break;
         *
         *
         *     case c :
         *     block of code
         *     break;
         * }
         *
         * */

        int age = 16;
        age+=10; // 16+10 = 26;
        int incrementedAge = age + 8 + (++age); //age = 26 + 8 + (26 + 1) = 61;
        System.out.println(incrementedAge);

        switch (age) {

            case 16 :
                System.out.println("Ineligible to vote");
                break; // If no breaks in between the cases, all cases will get executed;
            case 22:
                System.out.println("Eligible to vote");
                break;
            case 35:
                System.out.println("Eligible to vote as well");
                break;
            case 65:
                System.out.println("Senior Citizen");
                break;
        }


        System.out.println("========================================");



        //ENUM (Enumeration) ---> constant, unchanged values (Days of the week, months)
        switch (Calendar.DAY_OF_WEEK-6) { //7-6 = 1 (Monday) Calender API will take current date and gets the day of the week;
            case 1 :
                System.out.println("The day is Monday");
                break;
            case 2 :
                System.out.println("The day is Tuesday");
                break;
            case 3 :
                System.out.println("The day is Wednesday");
                break;
            case 4 :
                System.out.println("The day is Thursday");
                break;
            case 5 :
                System.out.println("The day is Friday");
                break;
            case 6 :
                System.out.println("The is Saturday");
                break;
            case 7 :
                System.out.println("The day is Sunday");
                break;
        }

        String str = "MaTH";
        switch (str.toLowerCase()) { // will convert to LowerCase;
            case "math" :
                System.out.println("This is Math Class");
                break;
            case "biology":
                System.out.println("The Biology class");
                break;
            case "geography" :
                System.out.println("The Nature Class");
                break;
            default:
                System.out.println("Unknown class type");
        }


        /**
         * For Each  Loop or Enhanced Loop :
         *
         * Syntax:
         *
         * for (type variableName : arrayName) {
         *     block of code;
         * }
         *
         * Usually this Type of Loop is used with [] arrays to print all values;
         *
         * */

        String[] cars = {"BMW", "AUDI", "TESLA", "LEXUS"};
        for (String i : cars) { // internally i takes values of cars one by one and print it out;
            System.out.print(i + "-");
        }
        System.out.println();


        int[] numbers = {10, 23, 30, 47, 50};
        for (int j : numbers) {
            if (j % 2 == 0){
                System.out.print(j + " : is even number "); //prints everything in one line;
            } else {
                System.out.println("Odd numbers : " + j );
            }
        }


        System.out.println();

        int[] num = {15, 20, 35, 40};

        for (int k : num){

            switch (k) {
                case 15 :
                    System.out.println("The Number : " + k + "  executed ");//1
                    break;
                case 25 :
                    System.out.println("The Number : " + k + " executed");
                    break;
                case 35 :
                    System.out.println("The Number : " + k + "   executed ");
                    break;
                case 45 :
                    System.out.println(" The Number : " + k + "  executed ");
                    break;
                default:
                    System.out.println("Unknown number");//
            }








        }















    }
}
