package JavaClass23;

import java.util.ArrayList;

public class JavaHomeWork23 {

    /**
     * Homework:
     *
     * 1. Write a Java Program to create an Arraylist of a String Datatype, add these letters : A,B,C,D,E,F,G,H.
     * Using “for Loop” print to the console only these letters:
     * A,
     * C,
     * E,
     * G.
     *
     * 2. From the same Arraylist extract only E, F, G, and print to the console; Result should look like this:
     * [E, F, G]
     *
     * 3. Write a Java Program to create an Arraylist of Integer, add these numbers: 1,2,3,4,5,6,7,8,9,10.
     *    Using the For Loop set every second index to 7777. Result should look like this:
     *    [7777, 2, 7777, 4, 7777, 6, 7777, 8, 7777, 10]
     **/

    /**
     * Collection ---> it is a framework that provides predefined methods so we can manipulate
     * the group of Objects.
     *
     * Types: List(Interface)
     * ArrayList(Java Class that implements list)
     *
     * Syntax: ArrayList<DataType>
     *
     * Array Limitations: Fixed Size.
     * While creating the Array we must know and assign all the value.
     *
     * Advantages of ArrayList: Keeps order of Insertions(I don't have to worry about placing at certain index).
     **/


    public static void main(String[] args) {


        int[] someArray = {1, 2, 3, 4, 5, 6, 7};

        int[] someArrayInt = new int[8]; //we created an array of int data type with the size of 10 values;
        someArrayInt[0] = 0;
        someArrayInt[1] = 1;
        someArrayInt[2] = 2;
        someArrayInt[3] = 3;
        someArrayInt[4] = 21;
        someArrayInt[5] = 34;
        someArrayInt[6] = 63;
        someArrayInt[7] = 71;
        //someArrayInt[15]=76;  limitation of an Array, ArrayOutOfBoundException;


        System.out.println("Value of array : " + someArrayInt[5]);
        System.out.println("Value of array : " + someArrayInt[6]);
        System.out.println("Value of array : " + someArrayInt[7]);

        //ArrayList

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        System.out.println("Size of an arraylist now is : " + integerArrayList.size());

        integerArrayList.add(0);
        integerArrayList.add(11);
        integerArrayList.add(22);
        integerArrayList.add(33);
        integerArrayList.add(11);
        integerArrayList.add(278);
        integerArrayList.add(337);

        System.out.println(integerArrayList);

        // size() method;
        System.out.println("Size of an ArrayList now is : " + integerArrayList.size());

        // contains() returns true if list contains specified elements else false:
        System.out.println("list of contains 22 : " + integerArrayList.contains(22));

        //isEmpty() returns true if the list not empty, else false.
        System.out.println("If list empty ot not : " + integerArrayList.isEmpty());

        // get() method returns elements by passing the index;
        // if index does not exist "IndexOutOfBoundaries" will be thrown.
        System.out.println("The value GET of Index 1 : " + integerArrayList.get(1));

        // indexOf() returns index from the list, by passing the value:
        System.out.println("The index of value 33  "  + integerArrayList.indexOf(33));

        // Last index of
        System.out.println("Last index of  : " + integerArrayList.lastIndexOf(38));

       //lastIndexOf() returns Index(int) of a last inserted value:
        System.out.println("Last index of value : "  + integerArrayList.lastIndexOf(11));

        // substring checking the fist and last index;
        String checkingSubString = "Hello World";
        System.out.println(checkingSubString.substring(6,11));

        // sublist() returns some values of list by passing the starting and ending index.
        System.out.println("Printing Value 22, 34 , 11 " + integerArrayList.subList(2,5));

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Green");
        stringArrayList.add("Yellow");
        stringArrayList.add("White");

        stringArrayList.remove(new String("Yellow"));
        System.out.println(stringArrayList);

       // remove() remove the value we have to write new Integer(value) returns true, else false.
        // if there are duplicated values, remove() Object, removes the 1st occurrence of passed value.
        System.out.println("Removing index 278 : " + integerArrayList.remove(new Integer(278)));

        System.out.println(integerArrayList);

       // remove the passed Index, returns the removed value.If not found BoundOutOfException;
        System.out.println(integerArrayList.remove(5));
        System.out.println(integerArrayList);

        //clear() will empty.
        integerArrayList.clear();
        System.out.println("After clear:  " + integerArrayList);
        System.out.println("The size after the clearing is : " + integerArrayList.size());


        System.out.println("-----------------------------Home Work------------------------------------------------------");


        //Write a Java Program to create an Arraylist of a String Datatype, add these letters : A,B,C,D,E,F,G,H.

        ArrayList<String> lettersArrayList = new ArrayList<>();

        lettersArrayList.add("A");
        lettersArrayList.add("B");
        lettersArrayList.add("C");
        lettersArrayList.add("D");
        lettersArrayList.add("E");
        lettersArrayList.add("F");
        lettersArrayList.add("G");
        lettersArrayList.add("H");

         // Using “for Loop” print to the console only these letters:
        //   * A,
       //   * C,
      //   * E,
     //   * G.

        System.out.println(lettersArrayList.subList(4,7));

       for (int i = 0; i< lettersArrayList.size(); i++){
           System.out.println("Remove letters with loop : " + lettersArrayList.remove(i));
       }

      //  From the same Arraylist extract only E, F, G, and print to the console; Result should look like this:
     // [E, F, G]



         //  Write a Java Program to create an Arraylist of Integer, add these numbers: 1,2,3,4,5,6,7,8,9,10.


        ArrayList<Integer> numbersArrayList = new ArrayList<>();

        numbersArrayList.add(1);
        numbersArrayList.add(2);
        numbersArrayList.add(3);
        numbersArrayList.add(4);
        numbersArrayList.add(5);
        numbersArrayList.add(6);
        numbersArrayList.add(7);
        numbersArrayList.add(8);
        numbersArrayList.add(9);
        numbersArrayList.add(10);

        //   Using the For Loop set every second index to 7777. Result should look like this:
        //  [7777, 2, 7777, 4, 7777, 6, 7777, 8, 7777, 10]

        for (int i = 0; i<numbersArrayList.size(); i+=2){
                        numbersArrayList.set(i, 7777);

        }

        System.out.println(numbersArrayList);




    }


}
