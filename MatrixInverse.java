public class MatrixInverse {
    int [][] arr = new int[3][3];
    int count =1;

    public static void main(String[] args) {
        MatrixInverse ob = new MatrixInverse();
        ob.matrix();
        ob.rotate();

    }

    public void matrix(){
        System.out.println("Original Matrix :");
        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                if(i-1<0){
                    arr[j][i]=count;
                }
                arr[i][j]=count;
                count++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public void rotate(){
        System.out.println("Rotated Matrix :");
        for (int i = 0; i <3 ; i++) {
            for (int j = 2; j>=0; j--) {
                arr[i][j]=arr[j][i];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}






