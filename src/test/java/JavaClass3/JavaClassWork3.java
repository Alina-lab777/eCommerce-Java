package JavaClass3;

public class JavaClassWork3 {
    public static void main(String[] args) {

        int x = 145;
        int y = ++x + 100; // because x will be incremented by 1 and given output added to y;
        System.out.println("After pre-incremented result :  " + y );


        int a = 30;
        int b = --a + 20; // because x will be decremented by 1 and given output added to b ;
        System.out.println("After pre-Decrement : " + b);



        int c = 10;
        int d = (c++) + 10;// Internally the Value of c has changed to 11;

        System.out.println("After post-Increment the Value of c : " + c );
        System.out.println("After post-Increment the Value of d : " + d );

        int h = c + 5; // We are taking the latest Incrementation and Printing it out : 11 + 5 = 16;

        c++; // internally the Value of c will be : 12;
        System.out.println(h);

        int j = c + 10; // We are taking the latest Incrementation and Printing it out : 12 + 10 = 22;
        System.out.println(j);


        System.out.println("==================================================");


        int e = 20;
        int f = (e--) + 10;

        System.out.println("After post-Decrement the Value of e : " + e); // 19
        System.out.println("After post-Decrement the Value of f : " + f); // 30

     //  int g =  (e + 15); // 19 + 15 = 34;
     //    e--; //
     //    System.out.println(g);



       int k = 100, l = 200, m;
       Boolean resultOfBoolean1 = k == l;
       System.out.println("The result of == sign : " + resultOfBoolean1);


        Boolean resultOfBoolean2 = k != l;
        System.out.println("The result of != sign : " + resultOfBoolean2);


        Boolean resultOfBoolean3 = k >= l;
        System.out.println("The result of >= sign : " + resultOfBoolean3);


        Boolean resultOfBoolean4 = k <= l;
        System.out.println("The result of <= sign : " + resultOfBoolean4);



        System.out.println("==================================================");


        int aa = 50;       //false;    //true;

        Boolean booleanB = aa == 50 && aa <= 100; // using Logical and Comparison Operator;
        System.out.println("The result of &&  : " + booleanB );


        Boolean booleanC = aa == 20 || aa <= 40; // using Logical and Comparison Operator;
        System.out.println("The result of ||  : " + booleanC);


        Boolean booleanD = !(aa == 50 && aa <= 100); // using Logical and Comparison Operator;
        System.out.println("The result of !  : " + booleanD);



        System.out.println("==================================================");


        String str1 = "10";
        String str2 = "10";
        int bb = 15;
            bb = 100;
        int dd = 20;

        System.out.println("The result of two numbers assigned to String dataType : "  + (dd + bb) + str1 );



        System.out.println("==================================================");

        int number = 150;
        int number2 = 130;

        //String result:
        String result = number > 200 ? "Number is more than 200 " : "Number is less than 200";
        System.out.println(result);


        // Different DataType as int:
        int resultOfInt = number > number2 ? number : number2;
        System.out.println("Ternary Operator result of two Int the Max number is : " + resultOfInt);






    }

    /**
     * Arithmetic Operators:
     *
     * ++ Variable ---> Pre-Increment;
     * -- Variable---> Pre-Decrement;
     *
     * Variable ++ ---> Post-Increment;
     * Variable -- ---> Post- Decrement;
     *
     *
     *
     * Comparison Operators:
     * Their return type is Boolean (true, false);
     *
     * == Equal sign x == y (true, false);
     * != not equal sign  x != y ;
     * > greater than;
     * < less than;
     * >=
     * <=
     *
     *
     *
     * Logical Operator:
     *
     * && --- (and operator), returns true if both statements are true, otherwise false;
     * || --- (or operator), returns true of one the statements are true, otherwise false;
     * !  --- (not, reverse the result) if result is true, returns false; if result false returns true;
     *
     *
     * Adding Numbers and Strings:
     *
     * When the number was declared and assigned to String DataType it will be the String;
     *When  the number was declared and assigned to Int datatype it will result in computation;
     *
     *
     *
     *
     *
     * Ternary Operator:
     *
     * variable = Statement ? Expression1 : Expression2
     *
     * If the Statement is true --- Expression1 will be executed;
     *              If the Statement is false --- Expression2 will be executed;
     *
     *
     *
     *
     *
     * */












}
