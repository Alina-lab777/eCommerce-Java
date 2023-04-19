package JavaClass26;

public interface TireFactory2 {
   public boolean typeOfTheTireRequired();

   default int defaultNumberOfTiresRequired() {
      System.out.println("The Default Number of Tires needed are 4 ");
      return 4;

   }

}
