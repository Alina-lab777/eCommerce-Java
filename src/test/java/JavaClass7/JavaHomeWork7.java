package JavaClass7;

public class JavaHomeWork7 {

    public static void main(String[] args) {

        String CarModel = "Honda"; // we are getting from user, what don't know what he is going to provide;


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