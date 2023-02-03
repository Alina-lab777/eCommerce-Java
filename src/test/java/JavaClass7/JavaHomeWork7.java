package JavaClass7;

public class JavaHomeWork7 {

    public static void main(String[] args) {

        String CarModel = "Honda"; // we are getting from user, what don't know what he is going to provide;
        String CarModel2 = "Toyota";
        String CarModel3 = "Tesla";
        String CarModel4 = "Lexus RX350";
        String CarModel5 = "Porsche";
        String CarModel6 = "Toyota RAV4";
        String CarModel7 = "Ferrari";

        if (CarModel.equals("Honda") || CarModel.equals("Toyota")) {
            System.out.println("The Vehicle type is : ‘Sedan’ ");
        } else if (CarModel.equalsIgnoreCase("Tesla") || CarModel.equalsIgnoreCase("Kia EV9")) {
            System.out.println("The Vehicle type is : ‘Electric’ ");
        } else if (CarModel.equalsIgnoreCase("Lexus RX350") || CarModel.equalsIgnoreCase("Toyota RAV4")) {
            System.out.println("The Vehicle type is : ‘SUV’ ");
        } else if (CarModel.equalsIgnoreCase("Porsche") || CarModel.equalsIgnoreCase("Ferrari")) {
            System.out.println("The Vehicle type is : ‘Sports Car’ ");
        } else {
            System.out.println("Unknown Vehicle type ");
        }

        if (CarModel2.equalsIgnoreCase("Honda") || CarModel2.equalsIgnoreCase("Toyota")) {
            System.out.println("The Vehicle type is : ‘Sedan’ ");
        } else if (CarModel2.equalsIgnoreCase("Tesla") || CarModel2.equalsIgnoreCase("Kia EV9")) {
            System.out.println("The Vehicle type is : ‘Electric’ ");
        } else if (CarModel2.equalsIgnoreCase("Lexus RX350") || CarModel2.equalsIgnoreCase("Toyota RAV4")) {
            System.out.println("The Vehicle type is : ‘SUV’ ");
        } else if (CarModel2.equalsIgnoreCase("Porsche") || CarModel2.equalsIgnoreCase("Ferrari")) {
            System.out.println("The Vehicle type is : ‘Sports Car’ ");
        } else {
            System.out.println("Unknown Vehicle type ");
        }

        if (CarModel3.equals("Honda") || CarModel3.equals("Toyota")) {
            System.out.println("The Vehicle type is : ‘Sedan’ ");
        } else if (CarModel3.equalsIgnoreCase("Tesla") || CarModel3.equalsIgnoreCase("Kia EV9")) {
            System.out.println("The Vehicle type is : ‘Electric’ ");
        } else if (CarModel3.equalsIgnoreCase("Lexus RX350") || CarModel3.equalsIgnoreCase("Toyota RAV4")) {
            System.out.println("The Vehicle type is : ‘SUV’ ");
        } else if (CarModel3.equalsIgnoreCase("Porsche") || CarModel3.equalsIgnoreCase("Ferrari")) {
            System.out.println("The Vehicle type is : ‘Sports Car’ ");
        } else {
            System.out.println("Unknown Vehicle type ");
        }

        if (CarModel4.equals("Honda") || CarModel4.equals("Toyota")) {
            System.out.println("The Vehicle type is : ‘Sedan’ ");
        } else if (CarModel4.equalsIgnoreCase("Tesla") || CarModel4.equalsIgnoreCase("Kia EV9")) {
            System.out.println("The Vehicle type is : ‘Electric’ ");
        } else if (CarModel4.equals("Lexus RX350") || CarModel4.equals("Toyota RAV4")) {
            System.out.println("The Vehicle type is : ‘SUV’ ");
        } else if (CarModel4.equalsIgnoreCase("Porsche") || CarModel4.equalsIgnoreCase("Ferrari")) {
            System.out.println("The Vehicle type is : ‘Sports Car’ ");
        } else {
            System.out.println("Unknown Vehicle type ");
        }


        if (CarModel5.equals("Honda") || CarModel5.equals("Toyota")) {
            System.out.println("The Vehicle type is : ‘Sedan’ ");
        } else if (CarModel5.equalsIgnoreCase("Tesla") || CarModel5.equalsIgnoreCase("Kia EV9")) {
            System.out.println("The Vehicle type is : ‘Electric’ ");
        } else if (CarModel5.equalsIgnoreCase("Lexus RX350") || CarModel5.equalsIgnoreCase("Toyota RAV4")) {
            System.out.println("The Vehicle type is : ‘SUV’ ");
        } else if (CarModel5.equalsIgnoreCase("Porsche") || CarModel5.equalsIgnoreCase("Ferrari")) {
            System.out.println("The Vehicle type is : ‘Sports Car’ ");
        } else {
            System.out.println("Unknown Vehicle type ");
        }

        if (CarModel6.equals("Honda") || CarModel6.equals("Toyota")) {
            System.out.println("The Vehicle type is : ‘Sedan’ ");
        } else if (CarModel6.equalsIgnoreCase("Tesla") || CarModel6.equalsIgnoreCase("Kia EV9")) {
            System.out.println("The Vehicle type is : ‘Electric’ ");
        } else if (CarModel6.equalsIgnoreCase("Lexus RX350") || CarModel6.equalsIgnoreCase("Toyota RAV4")) {
            System.out.println("The Vehicle type is : ‘SUV’ ");
        } else if (CarModel6.equalsIgnoreCase("Porsche") || CarModel6.equalsIgnoreCase("Ferrari")) {
            System.out.println("The Vehicle type is : ‘Sports Car’ ");
        } else {
            System.out.println("Unknown Vehicle type ");
        }

        if (CarModel7.equals("Honda") || CarModel7.equals("Toyota")) {
            System.out.println("The Vehicle type is : ‘Sedan’ ");
        } else if (CarModel7.equalsIgnoreCase("Tesla") || CarModel7.equalsIgnoreCase("Kia EV9")) {
            System.out.println("The Vehicle type is : ‘Electric’ ");
        } else if (CarModel7.equalsIgnoreCase("Lexus RX350") || CarModel7.equalsIgnoreCase("Toyota RAV4")) {
            System.out.println("The Vehicle type is : ‘SUV’ ");
        } else if (CarModel7.equalsIgnoreCase("Porsche") || CarModel7.equalsIgnoreCase("Ferrari")) {
            System.out.println("The Vehicle type is : ‘Sports Car’ ");
        } else {
            System.out.println("Unknown Vehicle type ");
        }

        int Grade = 60;



        if (Grade >= 90 && Grade <= 100)  {
            System.out.println("Grade A");
        } else if (Grade >= 80 && Grade <= 89) {
            System.out.println("Grade B");
        } else if (Grade >= 70 && Grade <= 79) {
            System.out.println("Grade C");
        } else if (Grade <= 70) {
            System.out.println("gradeD");
        } else {
            System.out.println("non above");
        }





        String car = "Honda";
        if (car.equals("Toyota") || car.equals("Honda")) {
            System.out.println("Toyota car  is not the same make");
        } else if (car.equals("Mazda") || car.equals("Lexus RX350")) {
            System.out.println("Mazda or Lexus  is the same make");
            ;
        } else if (car.equalsIgnoreCase("Chevy")) {
            System.out.println("Chevy is not the same make");
        } else if (car.equalsIgnoreCase("Honda")) {
            System.out.println("It is same make");
        } else if (car.equalsIgnoreCase("Tesla")) {
            System.out.println("Tesla is not the same make");
        } else {
            System.out.println("Car make non above");
        }



        /**
         *  ClassWork:
         *
         * Check the types of a cars: “Honda”,”Toyota”, “Tesla”,”Lexus RX350”,”Porsche” ,”Toyota RAV4”, “Ferrari”
         * Create String carModel;
         *
         * Write a program to check which type of vehicle it is?
         *
         *   (carModel  “Honda” or ”Toyota” ) {
         * 	 System.out.println("The Vehicle type is : ‘Sedan’ ");
         * } (carModel  “Tesla” or ”Kia EV9”) {
         * 	 System.out.println("The Vehicle type is : ‘Electric’ ");
         * } (carModel  “”Lexus RX350” or ” Toyota RAV4”) {
         * 	 System.out.println("The Vehicle type is : ‘SUV’ ");
         * } (carModel  ”Porsche” or ”Ferrari”) {
         * 	 System.out.println("The Vehicle type is : ‘Sports Car’ ");
         * } if none from above {
         * 	 System.out.println("Unknown Vehicle type ");
         * }
         *
         * */


        /**
         * HomeWork:
         *
         * 90-100 Grade-A
         *      System.out.println("Grade A");
         * 80-89  Grade-B
         *      System.out.println("Grade B");
         * 70-79  Grade-C
         *      System.out.println("Grade C");
         * <70    Grade-D
         *      System.out.println("Grade D");
         **/


    }

}