package JavaClass23;

import java.util.ArrayList;

public class JavaClassWork23 {

    /**
     * Collections in Java ---> it is a Framework, that provides pre-defined methods, so we can manipulate
     *                          the group of Objects.
     *
     * Types of Collections :
     *
     *           1. List (Interface)
     *           2. Arraylist (Java Class that implements List)
     *
     * Syntax:
     *
     *          ArrayList<DataType> nameOfArrayList = new ArrayList<>();
     *
     * Advantages of Arraylist:
     *
     *         1. Keeps order of Insertion (I don't have to worry about placing at certain index);
     *
     **/


    /**
     * Array Limitations:
     *     1. Fixed Size;
     *     2. While creating the Array, we must know and assign all the values;
     *
     **/


    public static void main(String[] args) {

        // Regular arrays:
        int[] someArray = {1,4,6,8,11};
        System.out.println(someArray.length);

        int[] someArrayInt = new int[8]; // we created an array of int with size of 8 values;
        someArrayInt[0] = 0;
        someArrayInt[1] = 1;
        someArrayInt[2] = 2;
        someArrayInt[3] = 3;
        someArrayInt[4] = 4;
        someArrayInt[5] = 15;
        someArrayInt[6] = 16;
        someArrayInt[7] = 17;


       // someArrayInt[15] = 000; // limitation of an array; ArrayIndexOutOfBoundsException

        System.out.println("Values of array : " + someArrayInt[5]);
        System.out.println("Values of array : " + someArrayInt[6]);
        System.out.println("Values of array : " + someArrayInt[7]);// print one by one;


        // ArrayList
        ArrayList<Integer> integerArrayList = new ArrayList<>(); // size of 0, but once start adding values, it increases dynamically;
        System.out.println("Size of an Arraylist now is : " + integerArrayList.size());

        // add() method:
        integerArrayList.add(6666);
        integerArrayList.add(11);
        integerArrayList.add(22);
        integerArrayList.add(33);
        integerArrayList.add(11);
        integerArrayList.add(44);
        integerArrayList.add(11);

        System.out.println(integerArrayList);

        // size() method returns the size of ArrayList:
        System.out.println("Size of an Arraylist now is : " + integerArrayList.size());


        // contains() returns true if list contains specified element, else false:
        System.out.println("If List contains 22 : " + integerArrayList.contains(22));


        // isEmpty() returns true if list not empty, else false:
        System.out.println("If List empty or not : " + integerArrayList.isEmpty());


        // get() - returns the element/value from the List by passing the index:
        // If Index doesn't exist IndexOutOfBoundsException will be thrown.
        System.out.println("The value of Index 1 : " + integerArrayList.get(1));


        // indexOf() - returns index from the List, by passing the value, else returns -1:
        System.out.println("The Index of value 38 is : " + integerArrayList.indexOf(38));


      // integerArrayList.lastIndexOf() -  returns Index(int) of a last inserted value:
        System.out.println("The last Index of Value 11 : " + integerArrayList.lastIndexOf(11));



        String checkingSubString = "Hello World!!!!!!!";
        System.out.println(checkingSubString.substring(6,11));


       //subList() - returns some values of A List by passing the starting and Ending Index:
        System.out.println("Printing Values 22,33,11 : " + integerArrayList.subList(2,5));


        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Green");
        stringArrayList.add("Yellow");
        stringArrayList.add("White");


        stringArrayList.remove("Yellow");
        System.out.println(stringArrayList);



       // remove() - remove the Value (we have write Integer.valueOf(value), returns true, else false:
        // if there are duplicate values, remove() Object, removes the 1st occurrence of a passed value:
        System.out.println(integerArrayList.remove(Integer.valueOf(11000))); // true;
        System.out.println(integerArrayList);




        // remove() -   removes the passed Index, returns the removed Value, if not found IndexOutOfBoundsException:
        System.out.println(integerArrayList.remove(5));
        System.out.println(integerArrayList);



        // set() - will update the existing Index by Passing the Value at certain Index:
        integerArrayList.set(0, 5555);
        System.out.println(integerArrayList);


        integerArrayList.clear();
        System.out.println("After clear : " + integerArrayList);
        System.out.println("The size after clearing is : " + integerArrayList.size());





    }



}
