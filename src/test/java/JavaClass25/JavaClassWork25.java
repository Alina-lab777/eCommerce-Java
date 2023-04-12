package JavaClass25;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;



public class JavaClassWork25 {

    /**
     *  HashMap ---> collection class, that allows to store Key and Value pair, where "Key" always unique,
     *               "Value" can be duplicate;
     *
     *  Map ---> Interface
     *  HashMap ---> class, that implements interface;
     *
     *  Syntax :
     *
     *   Map <Key, Value> nameOfHashMap = new HashMap<>();
     *   HashMap <Key, Value> nameOfHashMap = new HashMap<>();
     *
     *
     *  Points to remember:
     *
     *      1. HashMap doesn't keep insertion order;
     *      2. Keys are unique (different ID's);
     *      3. Values can be duplicate (same Employee with different ID's)
     *
     *
     **/


    public static void main(String[] args) {


        HashMap<Integer, String > employeeInfo = new HashMap<>(); // Ctrl + Enter


        //put() ---> inserts new entries;
        employeeInfo.put(1, "Jane Doe");
        employeeInfo.put(2, "John Doe");
        employeeInfo.put(2, "Anna Smith");// this one takes place, and overwrites put(2, "John Doe");
        employeeInfo.put(3, "Anna Smith");
        employeeInfo.put(5, "John Doe");

        System.out.println("The existing Values are : " + employeeInfo);
        System.out.println("Size of HashMap is : " + employeeInfo.size());


        employeeInfo.remove(1);


        System.out.println("The existing Values are : " + employeeInfo);
        System.out.println("Size of HashMap is : " + employeeInfo.size());


        // replace() ---> replaces one value;
        employeeInfo.replace(3, "Anna Smith", "John Travolta");
        System.out.println("The existing Values are : " + employeeInfo);


        //replaceAll() ---> Lambda expression, example with toUpperCase();
        employeeInfo.forEach((key, value) -> value.toUpperCase());
       // System.out.println("The existing Values are : " + employeeInfo);


        // keySet()---> we can extract all the keys and store in a Set of Key Datatype:

       Set<Integer>  allEmployeeIds = employeeInfo.keySet();
       System.out.println(allEmployeeIds);


       // To Print all values() and store it Collection of its own datatype (ex: String);
        Collection<String> allEmployeeNames = employeeInfo.values();
        System.out.println("All Employee names Info : " + allEmployeeNames);





    }

}
