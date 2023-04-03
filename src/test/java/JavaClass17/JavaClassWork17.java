package JavaClass17;
public class JavaClassWork17 {


    //Constructor is created and used if we want user to pass along certain Information while creating the Object of a Class;


    /**
     * Java Constructor ---> it is a special method, that it used to initialize the Object of a Class.
     *                       (is called once the Object of a class is created);
     *
     **/


    /**
     * Rules for Creating Constructor :
     *                      1. The same name as a Class name;
     *                      2. Has no return type;
     *                      3. Can't be abstract, final, static;
     **/


    /**
     * Types of Constructor :
     *                      1. No argument/Default Constructor;
     *                         Gets called once the Object of a Class is created.
     *                         Example : JavaClassWork17 class17 = new JavaClassWork17();
     *                                   ---> JavaClassWork17 (behind the scene Java creates default Constructor);
     *                                   ---> new JavaClassWork17() is the new Object;
     *
     *                      2. Parameterized Constructor ---> consists of a name and parameter list (number of Input parameters,
     *                                                                                               types of Input Parameters,
     *                                                                                               order of Input Parameters)
     *                      3. If there is no Constructor overloading, no any Constructor needs to be created, "default" will be called by default;
     *                      4. If there is Constructor overloading, and user wants to create an Object of a class, default constructor
     *                      needs to be created (which has no arguments/input parameters);
     **/


    /**
     * Private Constructor is defined if we want to limit a user from creating the Object of a Class;
     *
     **/


    /**
     * Constructor Overloading can be achieved when there are 2 or more Constructors (which have the same name as a Class name)
     *              but different Input Parameters;
     **/

    String className;
    int classId ;
    int classSSN;


    //No-arg/Default Constructor:
    JavaClassWork17() {
    }

    // Parameterized Constructor;
    JavaClassWork17 (String constructorName, int constructorId){
        this.className = constructorName;
        this.classId = constructorId;
    }

    // Parameterized Constructor;
    JavaClassWork17 (String userName, int userId, int userSsn){
         this.className = userName;
         this.classId = userId;
         this.classSSN =  userSsn;
    }

    // this keyword is used to set Field variables to method/constructor parameters;


    public static void main(String[] args) {

         JavaClassWork17 j17 = new JavaClassWork17();

        // new JavaClassWork17(); --- we are creating new copy of a certain Class;
        // JavaClassWork17 --- constructor (similar of a which exactly Class copy we want to get);


        JavaClassWork17 class17 = new JavaClassWork17("Jane", 1122);
        System.out.println(class17.className + " : " + class17.classId);

        JavaClassWork17 class17_2 = new JavaClassWork17();

        JavaClassWork17 class17_3 = new JavaClassWork17("John", 2323, 1234567);
        System.out.println("Just created user : " + class17_3.className +" "+ class17_3.classId +" "+class17_3.classSSN);



    }


}
