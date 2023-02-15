package JavaClass3;

public class JavaHomeWork3 {
    public static void main(String[] args) {

        System.out.println("************Pre Increment**************");


        int x=145;
        int y= ++x +100; // because x will be incremented by one and added to 100;

        System.out.println(" a After pre- incremented result  = "  +x); // = 145 + 1 =146;
        System.out.println(" b After pre- increment result =  " + y); // = 145 + 1+ 100 =246;


        int a=30;
        int b= --a + 20;

        System.out.println(" f after pre Decrement  = "  +a); // 30 -1 = 29;
        System.out.println("  g after pre decrement = "  +b); // 30 - 1 + 20 = 49;


        System.out.println("****************Post Increment*********");


        int c = 10;
        int d = (c++) +10;
        System.out.println("After post-Increment c= "  +c); // 11;
        System.out.println("After post-Increment d = " +d); // 20; ?????

        int h = c + 5; // 16 but internally the Value will be 11; ??????
        c++; // Internally the value will be : 12;
        System.out.println( "Value of h = "  +h); // 16;

        int j = c + 10;// We are taking the latest Incrementation and printing it out 12 + 10 =22;
        System.out.println("Value of j = " +j); // 22; ???????


        System.out.println("***************Post Decrement************");


        int e = 20;
        int f= (e--) + 10;
        System.out.println(" After the post- Decrement the Value of e =  " +e); // = 19;
        System.out.println(" After the post- Decrement the Value of e =  " +f); //  = 30; ?????

        int g = (e + 15); // g = 34;
        e--; //
        System.out.println(" g =  " +g);



        System.out.println("=================Comparison Operators==============================");

       /** boolean
        * == equal sign x == y (true, false) ;
        * != not equal sign x != y;
        * > greater than;
        * < lesser than;
        *  >=;
        *  <= ;
        * */


        int k = 100, l = 200; // m; ???????

        Boolean resultOfBoolean1 = k == l;
        System.out.println("The result of == sign : " +resultOfBoolean1 );


        Boolean resultOfBoolean2 = k != l;
        System.out.println("The result of != sign :  " + resultOfBoolean1);


        Boolean resultOfBoolean3 = k >= l;
        System.out.println(resultOfBoolean3);

        Boolean resultOfBoolean4 = k <= l;
        System.out.println(resultOfBoolean4);

        /**
         * Logical operator:
         * && --- (and operator), returns true if both statements are true;
         *
         *
         * */

        System.out.println("===================================");
         int aa = 50;
        System.out.println(aa>=20 && aa<=100);


/** Adding number and String;
 *
 * When datatype was declared and assigned to String datatype it will be the String;
 *  when the number was declared and assigned to Int datatype it will result in computation;
 * */

String str1 = "10";
String str2 = "10";
int bb = 15;
int dd = 20;
        System.out.println( "the result of numbers assigned  two to String and Int datatype " + str1 + bb);
        System.out.println(dd + str1 +bb);
        System.out.println("the result" + (dd+bb)+str1);


        System.out.println("=============Ternary Operator==================================");

/** Ternary Operator
 * variable = Statement ? Expression1 : Expression2
 *
 * */

int number =120;
int number2 = 130;
String result = number > 100 ? "Number is more than 100 " : "Number is less than 100";



        System.out.println(result);










/**
 *HomeWork for 3rd Class:
 *
 * Int a = 15;
 * Int b = 3;
 * Find out if “a” is equals to “b”
 * Find out if “a” is greater than  to “b”
 * Find out if “a” is less than  to “b”
 * Find out if “a” does’t equal  than  to “b”
 * Find out if “a” is greater than  to “b”
 * and print result to Console output with appropriate message;
 * =============================================================
 * Int c = 20
 * Find out if value of c is greater than 10 and less than 30;
 * Find out if value of c is greater than 50 or less than 30;
 * Find out if value of c is greater than 10 and less than 30 - reverse your program;
 * =============================================================
 * Practice Pre Post Increments:
 * int x = 4;
 * int y = (++x) + 100;
 *
 * int x = 4;
 * int y = (x++) + 100;
 *
 * ============================================================
 * Practice Pre Post decrement:
 * int aa = 10;
 * int bb = (--aa) + 100;
 * System.out.println(bb);
 *
 * int aa = 10;
 * int bb = (aa–-) + 100;
 * System.out.println(bb);
 *
 * ============================================================
 * Ternary Operator:
 *
 * int number_1 = -120;
 * int number_2 = 250;
 * double number_3 = 0.99;
 * double number_4 = -110;
 *
 * Use Ternary Operator's syntax, create STRING variables and within that variable write ternary
 * expression to check whether these numbers are > 0, your Expressions should be :“Positive number” “Negative number”;
 * In System.out.println pass created String variables to print output for each results.
 *
 *
 * Use Ternary Operator's syntax, create INT variables and within that variable write ternary
 * expression to check whether these numbers are > 0, your Expressions should be : intExpression1 : intExpression2;
 * In System.out.println pass created INT variables to print output for each results.
 *
 *
 *
 *
 * */



    }
}
