import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to print pattern");
        int n = scan.nextInt();
        int s =n;
        String space=" ";
        for (int i =0; i <n; i++) {
          for (int j = 0; j < s; j++) {
            System.out.print(s+" ");
          }
          s--;
          System.out.println();
          System.out.print(space);
          space+=" ";     
        }
        scan.close();
    }
}
