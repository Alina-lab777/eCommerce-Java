package JavaClass8;

public class JavaClassWork8 {

    /**
     * The nested if-else statement represents the block of code within another if block.
     * The inner "if" block of code will get executed once the outer returns true.
     * Each "if" condition has it own "else" statement as well.
     * <p>
     * <p>
     * Syntax :
     * <p>
     * if (statement1) {
     * if (statement2) {
     * if (statement3) {
     * sout"Block of code for statement3";
     * }
     * } else {
     * sout"Block of code for statement2";
     * }
     * } else {
     * sout"Block of code for statement1";
     * }
     */

    public static void main(String[] args) {


        boolean sprintPlanning = false;
        int howOften = 2;
        boolean ifHoliday = false;


        if (sprintPlanning) { //should be true, to go to 2nd "if"
            if (howOften == 2) { //should be true, to go to 3rd "if"
                if (ifHoliday == false) { //should be true, to execute the statement
                    System.out.println("It is time for Sprint Planning meeting !");
                } else {
                    System.out.println("No, today is Holiday, no meeting!");
                }
            } else {
                System.out.println("It is not second week of the months, so no Sprint Planning meeting! ");
            }
        } else {
            System.out.println("It is not Sprint Panning, so no meeting today!");
        }


        int heightInCm = 280;
        int weightInKg = 160;
        int age = 35;


        if (heightInCm >= 180 && heightInCm <= 200) {
            if (weightInKg >= 60 && weightInKg <= 100) {
                if (age >= 16 && age <= 30) {
                    System.out.println("You are eligible to join Basketball Team!");
                } else {
                    System.out.println("Unfortunately you aren't eligible due to your age");
                }
            } else {
                System.out.println("Unfortunately you aren't eligible due to the weight category");
            }
        } else {
            System.out.println("Unfortunately you aren't eligible due to the height category");
        }


        boolean hasApplesOnTheTree = true;
        boolean applesAreGreen = false;
        boolean hasAccessToPickUpTheApples = true;


        if (hasApplesOnTheTree) {
            if (!applesAreGreen) { //"if" is checking that apples are green, need to reverse with ! mark.
                if (hasAccessToPickUpTheApples) {
                    System.out.println("You can pick up some apples ! ");
                } else {
                    System.out.println("You don't have an access to pick up apples");
                }
            } else {
                System.out.println("Apples aren't ripe yet!");
            }
        } else {
            System.out.println("No, there are no Apples on the tree");
        }


        boolean carJeepRedColor = true;
        int jeepQuantity = 25;
        boolean jeepAvailable = false;

        if (carJeepRedColor) {
            if (jeepQuantity >= 30) {
                if (jeepAvailable) {
                    System.out.println("Red color Jeep is available for purchase");

                } else {
                    System.out.println("Vehicle is not available at the moment");
                }
            } else {
                System.out.println("Requested number of vehicles are not available");
            }
        } else {
                System.out.println("The red color is not available");
            }


        }


    }
