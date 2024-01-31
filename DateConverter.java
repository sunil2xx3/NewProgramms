import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class DateConverter {
    public void date(String data){
        String a="";
        String[] s=data.split(":");
        a=s[s.length-1];
        if (a.toUpperCase().contains("PM") && Integer.parseInt(s[0])<12 && Integer.parseInt(s[0])>0){
            s[0]=String.valueOf(12+Integer.parseInt(s[0]));
        }
        else if(a.toUpperCase().contains("AM") && Integer.parseInt(s[0])==12){
            s[0]="00";
        }
        System.out.print("Railway Time :");
        for (int i = 0; i <3; i++) {
            if(i!=2){
                System.out.print(s[i]+":");
            }
            else {
                System.out.println(s[i]+".");
            }
        }


//        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateConverter obj = new DateConverter();
        System.out.println("Enter time in HH/MM/SS");
        String time = scan.nextLine();
        obj.date(time);
    }
}
