import java.util.*;

public class Salesman {
    // int [] inpArr = {310,21,34,32,23,3,343};
    int profit = 0;
    public void getProfit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int lenOfarr=scan.nextInt();
        int [] inpArr = new int[lenOfarr];
        for (int i = 1; i <=lenOfarr; i++) {
            System.out.print("Enter element "+i+":");
            int inp = scan.nextInt();
            inpArr[i]=inp;
            System.out.println("s");
        }
        for (int i = 0; i < inpArr.length-1; i++) {
            for(int j=0;j<inpArr.length-1;j++){
                if(profit<inpArr[j+1]-inpArr[i]){
                    profit=inpArr[j+1]-inpArr[i];
                }
            }
        }
        System.out.println(inpArr);
        System.out.println(profit);
        scan.close();
    }

    public static void main(String[] args) {
        new Salesman().getProfit();
    }
    
}
