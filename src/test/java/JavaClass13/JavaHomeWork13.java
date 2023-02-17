package JavaClass13;

public class JavaHomeWork13 {
    public static void main(String[] args) {

        /**
         * You have been offered a job, but you aren't happy with the Base Salary;
         *   Create int var with dreamSalary = 110, Create int var offeredSalary = 95;
         *   keep on asking more while offered Salary <= Your dream salary,
         *
         *   Use this flow:
         *
         *        do {
         *            if offeredSalary less dreamSalary {
         *                sout("Offer hasn't been achieved")
         *            } else if {
         *                offeredSalary satisfies dreamSalary {
         *                 sout ("I accept the Job Offer")
         *                }
         *            }  offeredSalary++;
         *            System.out.println("Offer increased by : " + offeredSalary);
         *        } while (place necessary comparison)
         *
         *
         **/

        /**
         * For Each loop - (enhanced)
         * Syntax-- (initialization : array) {
         *     sout
         * }    //only values
         *
         * For Loop
         * Syntax ----for (initialization; condition/termination; increment decrement
         *
         * // for advanced operator, use it inc and dec
         *
         *Do/ While loop
         * Syntax----
         *
         *          do {
         *              block of code;
         *          }
         *           while (condition)
         * Executes code within do first and then terminates at while condition;
         */

        int[] numbers = {2, 3, 5, 6, 7, 8, 13, 25, 57, 68, 90, 1};
        for (int i : numbers) {
            System.out.println("For each loop " + i);
        }


        for (int i = 0; i < numbers.length; i += 2) {
            System.out.println("for loop " + numbers[i]);
        }


        int i = 1;
        while (i <= 10) {
            System.out.println("While Incremented Loop " + i);
            i += 2;
        }


        int q = 10;
        while (q >= 1) {
            System.out.println("While Decremented Loop " + q);
            q -= 2;
        }


        int[] arr = {1, 3, 54, 64, 75, 76};
        int k = 0;
        while (k < arr.length) {
            System.out.println(arr[k]);
            k++;
        }


        int numi = 10;
        do {
            System.out.println("DO WHILE " + numi);
            numi++;
        } while (numi < 0);

        //WHAT IS THE DIFFERENCE BETWEEN FOR LOOP AND DO/WHILE LOOP?

        // IN DO WHILE LOOP 'DO' CONDITION WILL GET EXECUTED FIRST,
        // AND THEN IT WILL CHECK WEATHER(CONDITION) IF IT IS RIGHT OR WRONG.

        // IN FOR GOOD VARIATION ON HOW WE CAN ADVANCE OPERATION IN BOTH WAYS INC OR DEC.

        int h = 1;
        do {
            System.out.println("The value of h " + h);
            if (h % 2 != 0) {
                System.out.println("These number are odd " + h);
            } else {
                System.out.println("These numbers are even " + h);
            }
            h += 3;
        } while (h <= 21);


        int dreamSalary = 110;
        int offeredSalary = 95;
        do {
            System.out.println("Offered Salary : " + offeredSalary);
            if (offeredSalary >= dreamSalary) {
                System.out.println("I accept the Job Offer");
            } else {
                System.out.println("Offer hasn't been achieved");
            }
            offeredSalary++;

        } while (offeredSalary <= dreamSalary);

    }
}
