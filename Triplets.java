import java.util.Arrays;
public class Triplets {
    int [] arr = {-1,2,-1,0,4,-4};
    public void triplets(){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i]+arr[j]+arr[j+1]==0){
                    System.out.print("["+arr[i] +" " +arr[j]+" "+arr[j+1]+"]");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Triplets obj = new Triplets();
        System.out.println("Input :"+Arrays.toString(obj.arr));
        System.out.println("Output :");
        obj.triplets();
    }
}
