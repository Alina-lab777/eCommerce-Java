package JavaClass13;

public class JavaClassWork13 {
    public static void main(String[] args) {

      /**
       * 1. for Each Loop (Enhanced)
       *        Syntax ---> for (initialization : array) {
       *             block of code
       *        }
       *
       *         Answer:
       *    We can just print the Values;
       *
       * ----------------------------------------------
       *
       * 2. for Loop
       *        Syntax ---> for (initialization; condition/termination; increment/decrement) {
       *            block of code
       *        }
       *        Answer:
       *     We can use advanced operator, we can run the Loop in both ways (increment/decrement);
       *
       * --------------------------------------------

       * 3. (rarely used) do/while Loop
       *        Syntax --->
       *        *       while (condition) {
       *        *           block of code;
       *        *       }
       *
       *
       *
       *            do {
       *                block of code;
       *            }
       *            while (condition)
       *
       *         Answer:
       *         The "Do" statement (block of code within) will get executed, no matter the condition placed in
       *         "While" statement without checking it.
       *
       *
       **/


        int[] numbers = {2,5,12,19,55,37,90};

        for (int num : numbers){
            System.out.println("Print with For Each Loop : " + num);
        }


        for (int i=0; i<numbers.length; i+=2){ // i = i + 2
            System.out.println("Print with For Loop : " + numbers[i]);
        }



        // For Increment:
        int i = 1; // i = 0;
        while (i<=10) { // checking if i <=10; but my i is Zero --->
                        // will return always true, so without incrementing the Value of i, my code runs infinitely;
            System.out.println("Print with While Loop Increment : " + i);
            i++; // i = i + 1;
        }



        // For Decrement:
        int j = 10; // we have to initialize final stop;// 9;

        while (j>=1){ // we have to put condition, to be go to the final stop from 1;
            System.out.println("Print with While Loop Decrement : " + j);
            // subtracting the Value of  j -1 (10-1)// 9,
            j--;
        }



        int[] arr = {6,15,101,150,3,88};
        int k = 0;
        while (k<arr.length){
            System.out.println(arr[k]);
            k++;
        }



        int num2 = 10; // Initialization

        do {
            System.out.println("Print with Do While : " + num2); // Block of code, Increment/Decrement;
            num2++;

        } while (num2<0); // Condition to terminate;




        // Checking with Do/While for odd numbers;
        int x = 10;
        do {
            System.out.println("The Value of x : " + x );
            if (x%2!=0){
                System.out.println("These are Odd numbers : " + x);
            } else {
                System.out.println("These are Even numbers : " + x ) ;
            }
                x--;
        } while (x>=1);// false;









    }
}
