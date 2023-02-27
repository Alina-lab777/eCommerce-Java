package JavaClass18;

import static JavaClass18.BankAccountInfo.getBankDetails;
import static JavaClass18.BankAccountInfo.getCountsOfCustomerInquiries;

public class JavaClassWork18 {

    /**
     *  Package ---> Class --- > Global/Field Variables ---> Methods ---> Method Variables;
     *
     **/

    /**
     * Encapsulation ---> is wrapping up the Data under single Unit (Java class)
     **/

    /**
     * Encapsulation can be achieved by Declaring all the Variables in the Class as a "private" and writing public
     * methods in the class to "set" and "get"   the values of Variables;
     *
     **/

    /**
     * "Setter" method ---> is the method that sets the Class field/global Variables;
     *
     * "Getter" method ---> is the method that returns the requested parameters/data, after it has been "set";
     *
     **/





    String someExample;
    static String msg = "Hello World";


    public static void helloWorldMethod(){
        String methodString = "Happy Monday";
        System.out.println(methodString + " : " + msg);
    }


    public static void main(String[] args) {
        BankAccountInfo bankAccountInfo = new BankAccountInfo();

        bankAccountInfo.setName("Jane Doe");
        bankAccountInfo.setEmailAddress("someemail.gmail.com");
        bankAccountInfo.setSsn(12345678);
        System.out.println(bankAccountInfo.getName() + bankAccountInfo.emailAddress + bankAccountInfo.getSsn());


        BankAccountInfo bankAccountInfo1 = new BankAccountInfo();
        bankAccountInfo1.signUp("John Doe", "johndoe@hotmail.com", 35, 150100);
        bankAccountInfo1.getCustomerDetails();

        getBankDetails();


        BankAccountInfo bankAccountInfo2 = new BankAccountInfo();
        bankAccountInfo2.signUp(33, "Chris Doe", "atcomeemail@gmail.com", 22334455);
        bankAccountInfo2.getCustomerDetails();


        getBankDetails();
        getCountsOfCustomerInquiries();
    }




}
