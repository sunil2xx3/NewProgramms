import java.util.ArrayList;
import java.util.Scanner;
public class Skip {
    ArrayList <Integer> output = new ArrayList<>();
    int sum=0;
    int [] arr = {1,2,3,4,5,6,7,8,9,10};
    Scanner scan = new Scanner(System.in);
    int k =scan. nextInt();
    public void solve(){
        for (int i = 0; i < arr.length; i++) {
            if(i%k==0 && arr[i]!=0){
                output.add(arr[i]);          
                sum+=arr[i];
            }
        }
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            if(i<output.size()){
                arr[i]=output.get(i);
            }
            else{
                arr[i]=0;
            }      
        }
        output.removeAll(output);  
        while(sum>arr[0]){
            sum=0;
            solve();
        }
    }
    public static void main(String[] args) {
        Skip sk = new Skip();
        sk.solve();
    }
}