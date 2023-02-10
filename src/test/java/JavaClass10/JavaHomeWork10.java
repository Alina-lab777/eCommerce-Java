package JavaClass10;

public class JavaHomeWork10 {
    public static void main(String[] args) {


        /** 1st Task;
         * Create and any String[] (put any value); and int[] (put any value)
         * Then with the help of method "length" sout it in "For Loop"
         * Compare as "<" and "<=" to the Length of created String[] and int[];
         * place "length-1", accordingly;
         * */

        String[] fruits = {"apples", "grapes", "bananas"};
        int lengthOfFruites = fruits.length;

        for (int i = 0; i < lengthOfFruites; i++) { // i<= fruits.length-1;
            System.out.println("Fruits are : " + fruits[i]);
        }


        /**
         * 1. Length ---> method is used with arrays, Primitive Data types (no brackets);
         * 2. Length() ----> method is used with String, Collection;
         *
         **/



        int[] numbers1 = {1, 2, 3};

        for (int s = 0; s <= numbers1.length - 1; s++) {
                System.out.println("Numbers : " + numbers1[s]);
            }



        /** 2nd Task:
         * Create array of int with these values : {2,5,7,8,20,25,33,46,50,58,66,78,84,90};
         * With the help of For Loop please sort them out by even or odd numbers
         * Print the sorted result, should look like this:
         *
         * This number is even : 2
         * This number is odd : 5
         * This number is odd : 7
         * This number is even : 8
         * This number is even : 20
         * This number is odd : 25
         * This number is odd : 33
         * This number is even : 46
         * This number is even : 50
         * This number is even : 58
         * This number is even : 66
         * This number is even : 78
         * This number is even : 84
         * This number is even : 90
         *
         *
         * If you don't how to solve the problem:
         *   1. Think about on how would you do without coding, (if I will do this, I get what I want);
         *   2. Go through the previous classes and think about possible solution;
         *   3. If can't solve the coding task, please provide me "pseudo" code!
         *
         *      Pseudo code ---> is more or less close solution that can be potentially solve the problem;
         *
         *      1  Step ---> I would use For Loop or Enhanced Loop;
         *      2. Step I would check the numbers if they are even or odd;
         *      3. Step Based on my check I would sout;
         *
         *
         **/

        int[] num = {2, 5, 7, 8, 20, 25, 33, 46, 50, 58, 66, 78, 84, 90};
        for (int n = 0; n <= num.length - 1; n++) {
            if (num[n] % 2 == 0) {
                System.out.println("This number is even " + num[n]);
            } else {
                System.out.println("This number is odd " + num[n]);
            }
        }

            // 1. if else condition;
            int a = 12;
            int b = 11;

            if (a * b == 100) {
                System.out.println("Multi of a * b = 100");
            } else {
                System.out.println("Multi of a * b not equal to 100");
            }

            // 2. if else ladder;

            int c = 10;
            if (c % 2 == 0 && c % 3 == 0) {
                System.out.println("The number is divisible by 2 and 3.");
            } else if (c % 2 == 0) {
                System.out.println("The number is divisible by 2 but not divisible by 3.");
            } else if (c % 3 == 0) {
                System.out.println("The number is divisible by 3 but not divisible by 2.");
            } else {
                System.out.println("The number is not divisible by 2 or 3.");
            }


            // 3. nested if else;
            int num1 = 30;

            if (num1 > 0) {
                System.out.print("The number is positive");
                if (num1 % 2 == 0) {
                    System.out.println(" and even.");
                } else {
                    System.out.println(" and odd.");
                }
            } else if (num1 < 0) {
                System.out.print("The number is negative");
                if (num1 % 2 == 0) {
                    System.out.println(" and even.");
                } else {
                    System.out.println(" and odd.");
                }
            } else {
                System.out.println("The number is zero.");
            }


            // 4. for each loop (enhanced Loop);

            int[] numbers = {1, 2, 3, 4, 5};
            for (int num2 : numbers) {
                System.out.println(num2);
            }

            // 5. switch case statement;

            int age = 16;
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


            // 6. for loop;

            String str = "Wednesday is the third day";
            int theLengthOfStr = str.length();
            System.out.println("The length of str : " + theLengthOfStr); // 9

            for (int k = 0; k <= str.length() - 1; k++) { // 9 < 9 == false; and Loop will stop at this point;
                // k <= str.length() = Internally Loop will attempt to run Index 10,
                // and we get "ArrayIndexOutOfBoundsException"
                System.out.print(str.charAt(k));
            }

    }
}