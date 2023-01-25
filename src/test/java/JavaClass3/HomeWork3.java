package JavaClass3;

public class HomeWork3 {
    public static void main(String[] args) {
        /**
         *  Int a = 15;
         * Int b = 3;
         * Find out if “a” is equals to “b”
         * Find out if “a” is greater than  to “b”
         * Find out if “a” is less than  to “b”
         * Find out if “a” doesn’t equal  than  to “b”
         * Find out if “a” is greater than or equal  to “b”
         * and print result to Console output with appropriate message;
         */

        int a = 15, b = 3;

        Boolean resultOfEqual = a == b; //false
        System.out.println("The result of == sign = " + resultOfEqual);


        Boolean resultOfGreater = a > b;// true
        System.out.println("The result of > sign =  " + resultOfGreater);


        Boolean resultOfLesser = a < b; // false
        System.out.println("The result of < sign =  " + resultOfLesser);


        Boolean resultOfNotEqual = a != b; //ture
        System.out.println("The result of != sign = "  + resultOfNotEqual);


        Boolean resultOfGreaterOrEqual = a >= b; //true
        System.out.println("The result of >= sign = "  + resultOfGreaterOrEqual);



        System.out.println("==============Comparison===============");

        /**
         * =============================================================
         * Int c = 20
         * Find out if value of c is greater than 10 and less than 30;
         * Find out if value of c is greater than 50 or less than 30;
         * Find out if value of c is greater than 10 and less than 30 - reverse your program;
         * =============================================================
         */


        int c = 20;

        Boolean comparison1 = c >=10 && c <=30;
        System.out.println("the result of comparison1 = " + comparison1);


        Boolean comparison2 = c >=50 || c <=30;
        System.out.println("the result of comparison2 = " + comparison2);


        Boolean comparison3 = c >=10 && c <=30;
        System.out.println("the result of comparison3 = " + comparison3);


        System.out.println("===========Pre-Post Increments===========================");


        /**
         * Practice Pre Post Increments:
         * int x = 4;
         * int y = (++x) + 100;
         * int x = 4;
         * int y = (x++) + 100;
         */

       int x = 4;
       int y = (++x) +100;

        System.out.println("The result of Pre Increment x = " +x);//=5
        System.out.println("The result of Pre Increment y = " +y);//=105

        int xx = 4;
        int yy = (xx++) +100;

        System.out.println("The result of Post Increment xx = " +xx);//=5
        System.out.println("The result of Post Increment yy = " +yy);//=104


        System.out.println("==============Pre Post decrement=========================");

        /**
         *
         * Practice Pre Post decrement:
         * int aa = 10;
         * int bb = (--aa) + 100;
         * System.out.println(bb);
         *
         * int aa = 10;
         * int bb = (aa–-) + 100;
         * System.out.println(bb);
         */

         int aa = 10;
         int bb = (--aa) + 100;

        System.out.println("The result of Pre Decrement aa = "  +aa ); //=9
        System.out.println("The result of Pre Decrement bb = "  +bb ); //= 109

        int aaa = 10;
        int bbb = (aaa--) +100;

        System.out.println("The result of Post Decrement aaa = "  +aaa ); //=9
        System.out.println("The result of Post Decrement bbb = "  +bbb );//= 110


        System.out.println("========Ternary Operations===============================");

         /**
         * Ternary Operator:
         *
         * int number_1 = -120;
         * int number_2 = 250;
         * double number_3 = 0.99;
         * double number_4 = -110;
         *
         * Use Ternary Operator's syntax, create STRING variables and within that variable write ternary
         * expression to check whether these numbers are > 0, your Expressions should be :“Positive number” “Negative number”;
         * In System.out.println pass created String variables to print output for each result.
         *
         *
         * Use Ternary Operator's syntax, create INT variables and within that variable write ternary
         * expression to check whether these numbers are > 0, your Expressions should be : intExpression1 : intExpression2;
         * In System.out.println pass created INT variables to print output for each result.
         *
         * */

         int number_1 = -120;
         int number_2 = 250;
         double number_3 = 0.99;
         double number_4 = -110;


        String result1 = number_1 > 0 ? "Negative Number " : "Positive Number";
        System.out.println(result1);

        String result3 = number_3 > 0 ? "intExpression1 " : "intExpression2";
        System.out.println(result3);





    }}
