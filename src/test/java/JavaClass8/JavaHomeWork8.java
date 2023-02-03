package JavaClass8;

public class JavaHomeWork8 {


    /**
     * If your BMI is less than 18.5,
     * System.out.println("It falls within the underweight range.\nYou need to gain some weight");
     * If your BMI is 18.5 to 24.9,
     * System.out.println("It falls within the Healthy Weight range.\nKeep on eating healthy");
     * If your BMI is 25.0 to 29.9,
     * System.out.println("It falls within the overweight range.\nYou have to exercise");
     * If your BMI is 30.0 or higher,
     * System.out.println("It falls within the obese range.\nYou have to diet");
     * <p>
     * <p>
     * For example, a person who weighs 180 lbs. and is 5 feet and 5 inches tall (65 inches total)
     * would calculate their BMI in the following way:
     * <p>
     * 180 x 703 = 126,540.
     * 126,540 / 65 = 1,946.769.
     * 1,946.769 / 65 = 29.95.
     * <p>
     * Their BMI would be 29.9.
     * <p>
     * double feetToInches = heightInFeet * 12 + heightInInches;
     */

    public static void main(String[] args) {


        double bodyHeightInFeet = 5.0;
        double bodyHeightInInches = 9.0;
        double bodyWeightInPounds = 160.5;


        double bodyHeightTotal = bodyHeightInFeet * 12 + bodyHeightInInches ;
        System.out.println(bodyHeightTotal);
        double bodyWeightTotal = bodyWeightInPounds * 703;
        System.out.println(bodyWeightTotal);
        double divideWTtoHT = bodyWeightTotal / bodyHeightTotal;
        System.out.println(divideWTtoHT);
        double bmiResult = divideWTtoHT / bodyHeightTotal;
        System.out.println(bmiResult);


        if (bmiResult <= 18.5)  {
            System.out.println("It falls within the underweight range.nYou need to gain some weight");
        } else if (bmiResult >= 18.5 && bmiResult <= 24.9) {
            System.out.println("It falls within the Healthy Weight range.nKeep on eating healthy");
        } else if (bmiResult >= 25.0 && bmiResult <= 29.9) {
            System.out.println("It falls within the overweight range.nYou have to exercise");
        } else if (bmiResult >= 29.9) {
            System.out.println("It falls within the obese range.nYou have to diet");
        } else {
            System.out.println("non above");
        }



    }
}
