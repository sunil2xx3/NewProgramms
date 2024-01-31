import java.util.Scanner;

public class CheckZero {

    public void checkZero() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter no of inputs :");
        int inputs = scan.nextInt();

        for (int i = 0; i < inputs; i++) {
            boolean isTrue=false;
            System.out.print("enter a number :");
            int num = scan.nextInt();
            String a =String.valueOf(num);
            for (int j = 0; j < a.length()-1; j++) {
                if(a.charAt(j)=='0' && a.charAt(j+1)=='0'){
                    isTrue=true;
                }
            }
            if(isTrue){
                System.out.println("OUTPUT : YES");
            }
            else System.out.println("OUTPUT : NO");
        }
    }

    public static void main(String[] args) {
        CheckZero obj = new CheckZero();
        obj.checkZero();
    }
}
