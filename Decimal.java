import java.util.ArrayList;
import java.util.Scanner;

public class Decimal {
    
    public void removeDot(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your decimal value.");
        float f = scan.nextFloat();
        String s = String.valueOf(f);
        String ns="";
        ArrayList <String> arr = new ArrayList<>(); 
        
        for (int i = 0; i <s.length()-1; i++) {
            arr.add(Character.toString(s.charAt(i)));
        }

        // for (int j = arr.size()-1; j>0; j--) {
        //     System.out.println(Integer.valueOf(arr.get(j)));
        //     if(Integer.valueOf(arr.get(j))>5 ){
        //         ns+=Integer.valueOf(arr.get(j-1))+1;
        //     } 
        // }
        System.out.println(arr);



    
    }
    public static void main(String[] args) {
        new Decimal().removeDot();
    }
}
