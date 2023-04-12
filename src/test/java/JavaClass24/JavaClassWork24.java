package JavaClass24;

import JavaClass22.Abstract.TireFactory;

import java.util.*;

public class JavaClassWork24 {

    /**
     *  Arraylist stores NON-PRIMITIVE DataType values. We have to define the datatype as a "wrapper class":
     *  (wrapper class --- when primitive dataTypes starts with Capital Letter)
     *
     *  byte - Byte;
     *  short - Short;
     *  int - Integer;
     *  double - Double;
     *  long -Long;
     *
     *  String, User-Defined classes;
     *
     **/


    /**
     * Set ---> Interface;
     * HashSet ---> Class, that implements "Set" Interface;
     *
     * HashSet ---> The class, from  Collection Framework, that implements "Set" interface, it stores only unique
     *              values, whereas in ArrayList we can store duplicates.
     *
     * Points to remember:
     *          1. HashSet stores the values using hashing technique;
     *          2. HashSet contains only unique values (non-duplicates);
     *          3. HashSet doesn't maintain the insertion order (every time when printed random order values are given)
     *
     **/



    public static void main(String[] args) {

        // we can create the Object of ArrayList:
        ArrayList<Integer> nameOfMyArraylist = new ArrayList();
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Yellow");
        arrayList.add("Black");
        arrayList.add("White");
        arrayList.add("Red");

        System.out.println("ArrayList Values with Insertion Order : " + arrayList);

        // Creation of HashSet:
        HashSet<String> stringHashSet = new HashSet<>();
        Set<String> setName = new HashSet<>();


        setName.add("Red");// not being printed;
        setName.add("Yellow");
        setName.add("Black");
        setName.add("White");
        setName.add("Red"); // printed;

        System.out.println("HashSet Values with Insertion Order : : " + setName);




        System.out.println("The size of HashSet : " + setName.size());
        System.out.println("If contains brown : " + setName.contains("Brown"));

        Iterator allValue = setName.iterator();


       while(allValue.hasNext()){
           System.out.println(allValue.next());
       }











    }


}
