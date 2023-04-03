package JavaClass20.Inheritance;

public class Main {
    public static void main(String[] args) {

        // All methods are called from this class only, if there is IS-relationship set-up, no overridden methods are called;
        SuperClass superClass = new SuperClass();
        System.out.println(superClass.isStringIdentical("DesktOP", "Desktop"));


        // All methods are called from this class only, if there is IS-relationship set-up, no overridden methods are called;
        SubClass subClass = new SubClass();
        System.out.println(subClass.isStringIdentical("LAPtop", "LapTOP"));



        // SuperClass is a Parent (Parent can hold a baby) --- SubClass is a child;
        // All methods are called from this class only, if there is IS-relationship set-up, and overridden methods are called
        // the latest will be executed (meaning overridden methods from the Child class);
       /* SuperClass superSub = new SubClass();
        System.out.println(superSub.isStringIdentical("CAR", "car"));*/




        // Child can't hold the Parent, meaning we can't create the reference variable of
        // a Child class and refer it to the Parent Object;
        //SubClass subSuper = new SuperClass();



        /**
         * We can create the reference variable of a Parent/Super class and an Object of a Child/Sub class;
         *
         *              ---> if methods in Child have been overridden, the latest will be executed;
         *              ---> else all properties of a Super/Parent class;
         *
         **/



        SuperClass superName = new SuperClass();
        System.out.println("Parent's asset : " + superName.inheritedWillMoney(150, 2000));


        SubClass subName = new SubClass();
        System.out.println("Child inherited asset plus his : "+ subName.inheritedWillMoney(150,2000));


    }
}
