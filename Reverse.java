import java.util.ArrayList;
import java.util.*;

public class Reverse {
   
    int count =0;
    public void reverseString(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string.");
        String orgString = scan.nextLine();
    //     // String orgString = "Hello, World!";
        String reversedString="";
        ArrayList <String> arr= new ArrayList<String>();
        ArrayList <Character> spe = new ArrayList<>();
        ArrayList <Integer> inte = new ArrayList<>();
        String newString="";
        String asd="!@#$%^&*() ,.;:'/+-_";
        
        for (int i = 0; i <orgString.length(); i++) {
            if(asd.contains(Character.toString(orgString.charAt(i)))){
                if(newString!=""){
                    System.out.println(newString);
                    arr.add(newString);
                    newString="";
                    count++;  
                }
                count++;
                spe.add(orgString.charAt(i));
                inte.add(count);
            }
            else{
                newString+=orgString.charAt(i);
            }
        }
        if(newString!=""){arr.add(newString);count++;}
        String[] str= new String[count];
        System.out.println(arr);
        int sw=arr.size()-1;

        for (int index = 0; index < count; index++) {
            if(inte.size()!=0 && index<inte.size()){
                System.out.println(Character.toString(spe.get(index)));
                str[inte.get(index)-1]=(Character.toString(spe.get(index)));
            }
            if(str[index]==null ){
                str[index]=arr.get(sw);
                sw--;
            }
            reversedString+=str[index];
        }

        System.out.println(reversedString);
    }

    public static void main(String[] args) {
        new Reverse().reverseString();

    }
}


