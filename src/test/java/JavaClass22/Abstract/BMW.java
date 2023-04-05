package JavaClass22.Abstract;

public class BMW extends Vehicle{

    public int gasTankVolumeInGallons(int theTankVolume) {

       int theTankVolumeInMethod = 0;
        if (theTankVolume>=10){
           theTankVolumeInMethod=10;
            System.out.println(theTankVolumeInMethod);
        } else if (theTankVolume >=20){
            System.out.println("It less than 20");
        } else if (theTankVolume >=50){
            System.out.println("50");
        }
        return theTankVolume;
    }


    protected int enginePower() {
        return 0;
    }
}
