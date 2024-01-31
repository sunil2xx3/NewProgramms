import java.util.Arrays;

public class ArrayManipulator {
    int[] newarr;
    int [] arr;

    public ArrayManipulator(int arr[]){
        this.arr=arr;
    }

    public void addElement(int ele){
        newarr = new int[arr.length+1];
        for (int i = 0; i < newarr.length; i++) {
            if(i==arr.length){

                newarr[arr.length]=ele;
            }
            else
                newarr[i]=arr[i];
        }
    }

    public void removeElement(int ele){
        newarr=new  int[arr.length-1];
        int index =0;
        for (int i = 0; i < newarr.length; i++) {
            if (arr[i]==ele) {
                index++;
                newarr[i]=arr[index];
            }
            else{
                newarr[i]=arr[index];
            }
            index++;
        }
        
    }

    public String toString(){
        String s="[";
        System.out.println(newarr.length);
        for (int i = 0; i < newarr.length; i++) {
            if(i==newarr.length-1){s+=newarr[i]+"]";}
            else
            s+=arr[i]+",";
        }

        return s;
    }

    public static void main(String[] args) {
        int []ar ={1,2,3,4};
        ArrayManipulator obj = new ArrayManipulator(ar);
        obj.addElement(1);
        // System.out.println(Arrays.toString(obj.newarr));
        // obj.removeElement(3);
        System.out.println(obj.toString());
        // System.out.println(Arrays.toString(obj.newarr));
    }

}
