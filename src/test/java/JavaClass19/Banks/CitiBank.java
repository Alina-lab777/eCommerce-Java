package JavaClass19.Banks;

public class CitiBank extends FED {

static double citiInterest = 1.8;


 public double baseRateOfInterest(){
     return super.baseRateOfInterest()+ citiInterest;
 }

}
