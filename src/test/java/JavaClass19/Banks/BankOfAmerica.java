package JavaClass19.Banks;

public class BankOfAmerica extends FED {

    static double bankOfAmerica = 1.50;


    public double baseRateOfInterest(){
        return super.baseRateOfInterest() + bankOfAmerica;
    }


    public int baseRateOfInterest1111(int num1, int num2){
        System.out.println(super.baseRateOfInterest8888(num1));
        return num1 + num2;
    }

}
