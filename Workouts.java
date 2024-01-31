import java.util.ArrayList;
import java.util.Scanner;
public class Workouts {


        String inp,numString;
        String vowels = "aeiou";
        int startRange,endRange;
        Scanner scan = new Scanner(System.in);
        public void removeVowel(){
            inp=scan.nextLine();
            for(int i=0;i<inp.length();i++){
                if(vowels.contains(Character.toString(inp.charAt(i)).toLowerCase())){
                    continue;
                }
                else{
                    System.out.print(inp.charAt(i));
                }
            }
        }
        public void remove5(){
            startRange=scan.nextInt();
            endRange=scan.nextInt();
            for(int i=startRange;i<=endRange;i++){
                numString=String.valueOf(i);
                if(!numString.contains("5")){
                    System.out.print(i +" ");
                }
            }
        }
        String nickName="",names;
        int nOfNames; long rand;

        public void nickName(){
            ArrayList <String> arr = new ArrayList<>();
            System.out.println("Enter no of names :");
            nOfNames=scan.nextInt();
            scan.nextLine();

            for (int i = 0; i < nOfNames; i++) {
                System.out.println("Enter name :");
                names=scan.nextLine();
                arr.add(names);
            }
            for (int j = 0; j < arr.size(); j++) {
                int rand = (int)Math.round(Math.random()*arr.get(j).length());
                for (int k = 0; k < arr.get(j).length(); k++) {
//                    System.out.print(rand);

                    if(k==rand){
                        System.out.print(arr.get(j).charAt(k));
                    }
                }
            }
        }
        public static void main(String[] args) {
            Workouts obj = new Workouts();
//            obj.removeVowel();
            obj.nickName();
        }
}


