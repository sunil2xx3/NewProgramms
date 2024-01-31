import java.util.Scanner;
public class MoveBall {
    int[][]arr;
    int rows,cols,option;
    Scanner scan = new Scanner(System.in);
     public void grid() {
         System.out.println("enter no of grids");
         System.out.print("rows :");
         rows=scan.nextInt();
         System.out.print("Columns :");
         cols = scan.nextInt();
         arr =new int[rows][cols];
     }

     public void showGrid(int row,int col){
         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                 if(i==row && j==col){
                     arr[i][j]=1;
                     System.out.print(arr[i][j] +" ");
                 }
                 else{
                    arr[i][j]=0;
                    System.out.print(arr[i][j] +" ");
                 }
             }
             System.out.println();
         }
     }

     public void options(){
         while(option!=3){
             System.out.println("1.show Grid\n2.change position\n3.Terminate");
             option = scan.nextInt();
             if(option==1){
                 showGrid(0,0);
             }
             else if (option==2) {
                 System.out.println("enter the position.\nrow :");
                 int row=scan.nextInt();
                 System.out.println("column :");
                 int col =scan.nextInt();
                 showGrid(row,col);
             }
             else if (option==3) {
                 System.out.println("Ended....");
                 break;
             }
         }
     }

    public static void main(String[] args) {
        MoveBall obj = new MoveBall();
        obj.grid();
        obj.options();

    }
}
