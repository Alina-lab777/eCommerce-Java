package JavaClass11;

import java.util.Locale;

public class Coding_Home_Work {
    public static void main(String[] args) {

        int a = 50;
        int b = 30;
        if (a > b) {
            System.out.println("A is more than B");
        } else {
            System.out.println("B is more than A");
        }

        int x = 50;
        int y = 50;
        if (x == y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        int t = 100;
        int l = 80;
        if (t == l) {
            System.out.println("1");
        } else if (t > l) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        int time = 20;
        String result = time < 18 ? "Good Day" : "Good Evening";
        System.out.println(result);


        int dayOfTheWeek = 7;
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        String[] cars = {"Volvo", "BMW", "Ford"};
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].contains("o")) {
                System.out.println(cars[i]);
            }
        }

        String[] car = {"Volvo", "BMW", "Ford", "Mercedes", "Volkswagen", "Chevrolet"};
        for (int i = 0; i < car.length; i++) {
            if (car[i].length() > 6) {
                System.out.println("Car brand name length is more than 6 : " + car[i]);
            } else if (car[i].length() < 4) {
                System.out.println("Car brand name length is less than 6 : " + car[i]);
            } else {
                System.out.println("Car brand name leftovers : " + car[i]);
            }
        }

        String str = "Don't expect the results without the hard work any number of any words ";
        String[] afterSplit = str.split(" ");
        for (int i = 0; i < afterSplit.length; i++) {
            String temp = afterSplit[i].substring(0, 1).toUpperCase();
            System.out.print(temp);

        }

        System.out.println("");

        String quote = "work hard in silENce. let SUCCESS make the noiSE tests";
        String[] splitArr = quote.split(" ");
        for (int i = 0; i < splitArr.length; i++) {
            String low = splitArr[i].substring(0, 1).toUpperCase() + splitArr[i].substring(1).toLowerCase();
            System.out.print(" " + low);



        }

        System.out.println("");

        int[] speedingRangeOverTheLimit = {10, 25, 38, 45, };
        for (int i = 0; i < speedingRangeOverTheLimit.length; i++) {


            if (speedingRangeOverTheLimit[i] >= 1 && speedingRangeOverTheLimit[i] <= 10) {
                System.out.println("Your driving penalty points are = 3");
            } else if (speedingRangeOverTheLimit[i] >= 11 && speedingRangeOverTheLimit[i] <= 20) {
                System.out.println("Your driving penalty points are = 4");
            } else if (speedingRangeOverTheLimit[i] >= 21 && speedingRangeOverTheLimit[i] <= 30) {
                System.out.println("Your driving penalty points are = 6");
            } else if (speedingRangeOverTheLimit[i] >= 31 && speedingRangeOverTheLimit[i] <= 40) {
                System.out.println("Your driving penalty points are = 8");
            } else if (speedingRangeOverTheLimit[i] > 40) {
                System.out.println("Your driving license is suspended");
            }
        }



        String quote2 = "work hard in silENce let SUCCESS make the noiSE tests";
        String[] splitArr2 = quote2.split(" ");
        for (int i = 0; i < splitArr2.length; i++) {

            String withConcat = splitArr2[i].substring(0,1).toUpperCase().
                                concat(splitArr2[i].substring(1, splitArr2[i].length()-1).toLowerCase()).
                                concat(splitArr2[i].substring(splitArr2[i].length()-1).toUpperCase());


            System.out.print(withConcat + " ");
        }





    }
}