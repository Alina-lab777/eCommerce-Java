package JavaClass7;

public class JavaClassWork7 {
    public static void main(String[] args) {

        /**
         * if (statement) {
         *     true execution
         * } else {
         *     false execution
         *     }
         * */


        /**
         * if-else-if ladder ---> executes one condition/statement if one of those multiple statements returns true;
         *
         *  Syntax :
         *
         *  if (statement1) {
         *      block of code will get executed ones statement1 is true;
         *  } else if (statement2) {
         *      block of code will get executed ones statement2 is true;
         *  } else if (statement3) {
         *      block of code will get executed ones statement3 is true;
         *  } else if (statement4) {
         *      block of code will get executed ones statement4 is true;
         *  } else {
         *      else will get executed if all above returns false;
         *  }
         *
         * */


        String city = "brooklyn";

        if (city.equalsIgnoreCase("Brooklyn")) {
            System.out.println("This is one of the NYC boroughs");
        } else if (city.equals("New York")) {
            System.out.println("This is main financial city in US");
        } else if (city.contains("Par")) {
            System.out.println("This city most likely in France");
        } else if (city.equals("Boston")) {
            System.out.println("This city in USA");
        } else {
            System.out.println("Unknown city");
        }


        System.out.println("=============================");

        int number = 35;

        if (number <= 20 ) {
            System.out.println("Number is less or equal than 20");
        } else if (number <= 30) {
            System.out.println("Number is less or equal than 30");
        } else if (number <= 40) {
            System.out.println("Number is less or equal than 40");
        } else {
            System.out.println("Number is more than any");
        }


        System.out.println("=============================");


        char ch = 'u';

        if (ch == 'a' || ch == 'A') {
            System.out.println("This is vowel " + ch);
        } else if (ch == 'o' || ch == 'O') {
            System.out.println("This is vowel " + ch);
        } else if (ch == 'e' || ch == 'E') {
            System.out.println("This is vowel " + ch);
        } else if (ch == 'i' || ch == 'E') {
            System.out.println("This is vowel " + ch);
        } else if (ch == 'u' || ch == 'U') {
            System.out.println("This is vowel " + ch);
        } else {
            System.out.println("This is consonant " + ch);
        }







    }
}
