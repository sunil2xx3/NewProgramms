import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class RoundingCalculator {
    String[] arr;
    public static void main(String[] args) {
        RoundingCalculator rc = new RoundingCalculator();
        rc.roundingTheNumber();
    }
    public void roundingTheNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the decimal value: ");
        double num = input.nextDouble();
        input.nextLine();

        System.out.println("Enter the place you wants to round off: ");
        String place = input.nextLine();

        String str = "" + num;
        arr = str.split("\\.");
//        System.out.println(Arrays.toString(arr));

        if (place.equals("one")){
            onesPlace();
        }
        if (place.equals("ten")){
            tenthPlace();
        }
        if (place.equals("hundred")){
            hundredthPlace();
        }
    }
    public void onesPlace(){
        for (int i = 1; i < arr.length;i++) {
            String numStr = arr[i];
            int num1 = Integer.parseInt(String.valueOf(numStr.charAt(0)));
            if (num1 < 5){
                System.out.println(arr[0]);
            }
            if (num1 >= 5){
                int real = Integer.parseInt(arr[0]);
                System.out.println("Your number : " + (real + 1));
            }
        }
    }
    public void tenthPlace(){
        for (int i = 1; i < arr.length;i++) {
            String numStr = arr[i];
            int num1 = Integer.parseInt(String.valueOf(numStr.charAt(1)));
            if (num1 < 5){
                System.out.println(arr[0] + "." + numStr.charAt(0));
            }
            if (num1 >= 5){
                String decimal = arr[0] + "." + numStr.charAt(0);
                double real = Double.parseDouble(decimal);
                System.out.println("Your number : " + (real + 0.1));
            }
        }
    }
    public void hundredthPlace(){
        for (int i = 1; i < arr.length;i++) {
            String numStr = arr[i];
            int num1 = Integer.parseInt(String.valueOf(numStr.charAt(2)));
            if (num1 < 5){
                System.out.println(arr[0] + "." + numStr.charAt(0) + numStr.charAt(1));
            }
            if (num1 >= 5){
                String decimal = arr[0] + "." + numStr.charAt(0) + numStr.charAt(1);
                double real = Double.parseDouble(decimal);
                System.out.println("Your number : " + (real + 0.01));
            }
        }
    }
}
