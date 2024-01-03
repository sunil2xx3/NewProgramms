public class PasswordChecker {
    String password="";
    public boolean verifyPassword(){
         if(lengthChecker()==true && upperCaseChecker() ==true &&lowerCaseChecker()==true && specialCharacter()==true && numberChecker()==true){
            return true;
         }
         else{
            return false;
         }
    }

    public void enterPassword(String pass){
        password = pass;
    }

    public boolean lengthChecker(){
        boolean strong = false;

        if (password.length()<8){
           return strong;     
        }
        else{strong=true;}
       return strong;
    }

    public boolean upperCaseChecker(){
        boolean strong=false;
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)>=65 && password.charAt(i)<=90){
              strong = true;
              break;
            } 
        }    
         return strong;
    }

    public boolean lowerCaseChecker(){
        boolean strong = false;
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)>=97 && password.charAt(i)<=122){
               strong = true;
               break;
            }
        }
        return strong;
    }

    public boolean specialCharacter(){
        boolean strong = false;
        for(int i =0;i<password.length();i++){
            if(password.charAt(i) =='!' || password.charAt(i) == '@'|| password.charAt(i)=='#' || password.charAt(i) == '$' || password.charAt(i) == '&'){
                strong = true;
                break;

            }

        }
        return strong;
    }

    public boolean numberChecker(){
        boolean strong = false;
        for(int i=0;i<password.length();i++){
            if (password.charAt(i) >= '0' && password.charAt(i)<= '9') {
                strong=true;
                break;
            }
        }
        return strong;
    }
}



