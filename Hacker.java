import java.util.ArrayList;

public class Hacker {
    public static void news(){
        ArrayList <Integer> s = new ArrayList<>();
        s.add(1);
        s.add(7);
        s.add(2);
        s.add(4);
        ArrayList <Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < s.size()-1; i++) {
            for(int j=0;j<s.size()-1;j++){
                int df =s.get(i)+s.get(i+1);
                System.out.println(df);
        //         if(df%k!=0){
        //             arr.add(s.get(i));
                
        // // System.out.println(df+" ;k");
        //         }
            }
        }
    }
    public static void main(String[] args) {
        news();
    }
}
