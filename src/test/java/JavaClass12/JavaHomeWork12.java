package JavaClass12;

public class JavaHomeWork12 {
    public static void main(String[] args) {

        //for loop increment
        // for (int i =0; i<value.length; i++)
        // for loop decrement
        // for (int i = var.length; i++)

        //Decremented for Loop
        for (int i = 10; i >= 0; i--) {
            System.out.print(" " + i);
        }

        System.out.println();

        String str = "InterviewQuestion";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        //Palindrome
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This is not Palindrome");
        }

        //Advanced Operator
        for (int i = 0; i <= 50; i += 5) {
            System.out.print(" " + i);
        }

        //Nested for Loop

        String[] flowers1 = {"Rose", "Tulip", "Daisy", "Violet"};
        String[] flowers2 = {"Orchid", "Lotus", "ROse", "Lavender"};

        for (int i = 0; i < flowers1.length; i++) {
            for (int j = 0; j < flowers2.length; j++) {
                if (flowers1[i].equalsIgnoreCase(flowers2[j])) {
                    System.out.println("this flower is duplicate " + flowers2[j]);
                }
            }
        }


        /**
         *
         String[] flower = {"Rose", "Violet", "Carnation", "Dandelion", "Lotus", "Daisy", "Orchid", "Rose"};

         Everything within 1 Decrement Loop:

         The result of flower, that endsWith("n");
         The result of flower, the length more than 6;
         The number of Loop + flower name;

         Hint for number of rounds:
         Create int var and assign it to Your Loop;

         Please follow this output:
         -------------------------------------------------------------
         Orchid found at number of Rounds : 6
         Dandelion found at number of Rounds : 3
         Carnation found at number of Rounds : 2
         Violet found at number of Rounds : 1
         **/

        String[] flower = {"Rose", "Violet", "Carnation", "Dandelion", "Lotus", "Daisy", "Orchid", "Rose"};


        for (int i = 0; i < flower.length; i++) {
            if (flower[i].endsWith("n")) {
                System.out.println("The result of flower, that endsWith(n) - " + flower[i]);
            }
        }
        System.out.println("================================");

        for (int l = 0; l < flower.length; l++) {
            if (flower[l].length() >= 6) {
                System.out.println("The result of flower, the length more than 6 - " + flower[l]);
            }
        }
        System.out.println("================================");

        // for (int f=0; f<flower.length; f++) {
        int var;
        for (var = 0; var < flower.length; var++) {

            System.out.println(flower[var] + " found at number of Rounds : " + var);
        }


        //write New Addition below for HomeWork12:

        System.out.println("==================================================================");

        for (int w = flower.length - 1; w > 0; w--) {
            int fwer = w; // basically all operation that "w" would perform, just was reassigned to "fwer";

            if (flower[fwer].endsWith("n")) {
                System.out.println("The result of flower, that endsWith(n) " + flower[w] + " Number of rounds : " + w);
            } else if (flower[fwer].length() >= 6) {
                System.out.println("The result of flower, the length more than - 6 " + flower[fwer] + " Number of rounds : " + fwer);
            } else {
                System.out.println(flower[fwer] + "found at number of Rounds : " + w);
            }
        }

    }

}
