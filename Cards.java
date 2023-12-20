import java.util.*;
public class Cards{
    Scanner scan = new Scanner(System.in);
    private String cardType;
    protected String password ="12345";
    String inputString="",passInput,newPassword;
    int balance =50000,amount;


    public void setCardType(String cardType){
        this.cardType=cardType;
    }

    public String getCardType(){
        return this.cardType;
    }

    public void getOption(){
        System.out.println("1.check balance.");
        System.out.println("2.withdraw amount.");
        System.out.println("3.Deposit");
        System.out.println("4.change pin.");
        System.out.println();
        System.out.print("enter your option :");
        inputString =scan.nextLine();
        System.out.println(inputString);
        platinumCard();
    }

    public void platinumCard(){
        int count =0;
        System.out.println("Enter Your Pin :");
        passInput=scan.nextLine();
        if(!passInput.equals(password) && count<=2){
            count++;
            System.out.println("Incorrect Pin");
            System.out.println("Please enter valid pin number:"); 
            passInput=scan.nextLine();
        }
  
    }

    public void operations(){
        
        if(passInput.equals(password)){
            if(inputString.equals("2")){
                System.out.println("enter amount to withdraw");
                amount=scan.nextInt();
                if (amount<balance){
                    balance-=amount;
                    System.out.println("Amount Withdrawn successfully.");
                }
                else{
                    System.out.println("insufficient balance");
                }
            } 
            
            else if(inputString.equals("3")){
                System.out.println("Enter Amount to deposit.");
                amount=scan.nextInt();
                if(amount<=25000){
                    balance+=amount;
                    System.out.println("Amount Deposited sucessfully.");
                }
                else{
                    System.out.println("25,000 is the maximum limit for platinum card User");
                }
            }
        }
       
    }

    public void queries(){
        // System.out.println(inputString);
        if(inputString.equals("4")){        
            System.out.println("Enter old pin");
            String oldPassword =scan.nextLine();
            if(oldPassword.equals(password)){
                newPassword=scan.nextLine();
                password=newPassword;   
            }  
        }

         else if(inputString.equals("1")){
            System.out.println(inputString);
            System.out.println(balance);
        }
    }
}

class Premium extends Cards{

    @Override
    public void operations(){
        Cards c1 = new Cards();
        c1.queries();
        if(inputString.equals("2")){
            System.out.println("enter amount to withdraw");
            amount=scan.nextInt();
            if (amount<balance){
                if(amount<=10000){
                    balance-=amount;
                    System.out.println("Amount Withdrawn successfully.");
                }
                else{
                    System.out.println("Exceeding limit for platinum user");
                }
            }
            else{
                System.out.println("insufficient balance ");
            }
        } 
        else if(inputString.equals("3")){
            System.out.println("Enter Amount to deposit.");
            amount=scan.nextInt();
            if(amount<=49000){
                balance+=amount;
                System.out.println("Amount Deposited sucessfully.");
            }
            else{
                System.out.println("49,000 is the maximum limit for Gold card User");
            }
        }
    }
}

class Main{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String cType;
        System.out.println("enter your card type.");
        cType=scan.nextLine();
        
        Cards c = new Cards();
        Premium p =  new Premium();
        System.out.println(cType);
        System.out.println(cType);
        if(cType.toLowerCase().equals("gold")){
            c.setCardType(cType);
            c.getOption();
            c.operations();
            c.queries();
        }
        else if(cType.toLowerCase().equals("platinum")){
            p.setCardType(cType);
            p.getOption();
            p.operations();
            p.queries();
        }
        else{
            System.out.println("Invalid card Type.");
        }
    }
}
