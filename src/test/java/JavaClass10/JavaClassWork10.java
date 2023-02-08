package JavaClass10;

public class JavaClassWork10 {
    public static void main(String[] args) {
        /**
         * 1. if else condition;
         * 2. if else ladder;
         * 3. nested if else;
         * 4. for each loop (enhanced loop);
         * 5. switch case statement;
         * ================================
         * 6. for loop :
         *
         * Syntax :
         *
         * for (int someVariable(where to begin or initialization); condition/termination; increment/decrement) {
         *     block of code to be executed;
         * }
         *
         * */


        //Ex :

        for ( int i = 1; i<=3; i++){
            //with the 1st round of the Loop the value of i = 1;
            //with the 2nd round of the Loop the value of i = 2;
            //with the 3rd round of the Loop the value of i = 3;
            //with the 4th round of the Loop the value of i = 4;
            //with the 5th round of the Loop the value of i = 5;
            //with the 6th round of the Loop the value of i = 6;
            //with the 7th round of the Loop the value of i = 7;
            //with the 8th round of the Loop the value of i = 8;
            //with the 9th round of the Loop the value of i = 9;
            //with the 10th round of the Loop the value of i = 10;
          //  System.out.print(i);
        }

        int sum = 0;

        for (int j = 1; j<=5; j++) { // j - 15;
            sum = sum + j;
        }
     //   System.out.println("The Value of the sum : " + sum);

        /**
         * 1 round of the Loop, sum was Zero, but with j = 1, we are reassigning the sum to 1;
         * 2 round of the Loop, sum was already 1 + (j = 2) = 3;
         * 3 round, sum was 3 + (j = 3) = 6;
         * 4 round, sum was 6 + (j = 4) = 10;
         * 3 round, sum was 10 + (j = 5) = 15;
         *
         * */


        int[] arr = {1,2,3,4,5}; // index in array starts from 0;
        int lengthOfArr = arr.length; // the length of arr will provide the length as it is = 5 ;
        System.out.println("The length of arr : " + lengthOfArr);

        for (int i = 0; i<=arr.length-1; i++){ // increments/works based on index and total = 5 indexes;
            System.out.println(arr[i]);
        }

        /**
         * lengthOfArr with length method will provide the length starting from 1st Index;
         * In our Example the full length is provided, which is 5;
         *
         * Loop works based on Index, which starts from Zero;
         * Index 0 = value is 1;
         * Index 1 = value is 2;
         * Index 2 = value is 3;
         * Index 3 = value is 4;
         * Index 4 = value is 5;
         * Index 5 = no Index, no Value;
         * */


        System.out.println("=========================================");

        String str = "Wednesday is the third day";
        int theLengthOfStr = str.length();
        System.out.println("The length of str : " + theLengthOfStr); // 9

        for (int k = 0; k<=str.length()-1; k++){ // 9 < 9 == false; and Loop will stop at this point;
                                                // k <= str.length() = Internally Loop will attempt to run Index 10,
                                                // and we get "ArrayIndexOutOfBoundsException"
            System.out.print(str.charAt(k));
        }

        /**
         * At the 1st round - "for Loop" starts the round from Index zero and at zero Position it will take
         * the value of "w", which is according to the Length is 1;
         * At the round # 2 - "for Loop" goes according to the Index # 1 and  it will take the value of "e",
         * which is according to the "Length" is 2;
         * At the round # 3 - "for Loop" goes according to the Index # 2 and  it will take the value of "d",
         * which is according to the "Length" is 3;
         * At the round # 4 - "for Loop" goes according to the Index # 3 and  it will take the value of "n",
         *          * which is according to the "Length" is 4;
         * At the round # 5 - "for Loop" goes according to the Index # 4 and  it will take the value of "e",
         *          * which is according to the "Length" is 5;
         * At the round # 6 - "for Loop" goes according to the Index # 5 and  it will take the value of "s",
         *          * which is according to the "Length" is 6;
         * At the round # 7 - "for Loop" goes according to the Index # 6 and  it will take the value of "d",
         *         * which is according to the "Length" is 7;
         * At the round # 8 - "for Loop" goes according to the Index # 7 and  it will take the value of "a",
         *        * which is according to the "Length" is 8;
         * At the round # 9 - "for Loop" goes according to the Index # 8 and  it will take the value of "y",
         *        * which is according to the "Length" is 9;
         *
         *
         *
         *
         * */













    }
}
