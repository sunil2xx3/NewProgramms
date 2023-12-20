public class NumberCheck {

public void checkNumber(){
    for (int i = 0; i <100; i++){
        int sum=0;
        String reversed="";
        if(i<=9){sum=i;}
        else{ sum=i/10+i%10;}
        if(sum>=10){
            reversed=String.valueOf(sum%10)+String.valueOf(sum/10);
        }
        else{
            reversed=String.valueOf(sum);
        }
        int z=sum*Integer.valueOf(reversed);
        if(i==z){
            System.out.println(i);
        }
    }
}
public static void main(String[] args) {
     new NumberCheck().checkNumber();
}
}
