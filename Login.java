import java.util.Scanner;

public class Login {
    private String userId, password,confirmPassword;
    int passcount=0;
    boolean passStrength=false;
    int loginAs, logOrSignin,options;
    Scanner scan = new Scanner(System.in);
    String studentName, fatherName, motherName, address, dob, bloodGroup, userDetailString,studentOptions;
    String teacherName, role, experience, gender;
    PasswordChecker pw = new PasswordChecker();
    DBConnection dbObj = new DBConnection();

    public void setDetails(String userId, String password) {
        this.password = password;
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public String getUserid() {
        return userId;
    }

    public boolean login(){
        System.out.println("Enter your user id :");
        userId=scan.nextLine();
        System.out.println("Enter your password :");
        password=scan.nextLine();
        System.out.println("re enter your password");
        confirmPassword=scan.nextLine();

        if(confirmPassword.equals(password)){
            pw.enterPassword(password);
            System.out.println(pw.verifyPassword());

            if(pw.verifyPassword()==true ){
                // dbObj.verifyUser(userId);
                passStrength=true;
            }
            else{
                System.out.println("enter a strong password.");
            }
        }
        else{
            if(passcount<3){
            System.out.println("Password doesn't match with above password\nplease enter matching password.");
            confirmPassword=scan.nextLine();
            passcount++;
            }
            else{System.out.println("You have reached the maximum Attempts.");}
        }
        return passStrength;
    }
    public void getinput() {
        System.out.println("1.Login.\n2.SignUp");
        System.out.println("Enter your Option.");
        logOrSignin = scan.nextInt();
        System.out.println("1.Student.\n2.Teacher.");
        loginAs = scan.nextInt();
        scan.nextLine();
        
        if(logOrSignin==1 && loginAs==1 && login()==true){
            dbObj.commString="select uId,Spassword from Studentdata where uId =";
            dbObj.verifyUser(userId);
            if(dbObj.existingUser.equals(userId) && dbObj.userpassword.equals(password)){
                studentLogin();
            }
            else{
                System.out.println("Incorrect user id or password");
            }
        }
        else if(logOrSignin==1 && loginAs==2 && login()==true){
            dbObj.commString="select userID,password from TeacherDatas where userID =";
            dbObj.verifyUser(userId);
            System.out.println(dbObj.existingUser);
            System.out.println( dbObj.userpassword);
            if(dbObj.existingUser.equals(userId) && dbObj.userpassword.equals(password)){
                teacherLogin();
            }
            else{
                System.out.println("Incorrect user id or password");
            }
        }
        else if(logOrSignin==2 && loginAs==1 ){
            studentSignIn();
        }
        else if(logOrSignin==2 && loginAs==2){
            teacherSignIn();
        }    
        else{
            System.out.println("Enter a valid option.");
        }
        
    }
    
    
    
    public void studentSignIn() {
        
        System.out.print("Enter Student Name :");
        studentName=scan.nextLine();
        System.out.print("enter your father's name :");
        fatherName=scan.nextLine();
        System.out.print("enter your mother's name :");
        motherName=scan.nextLine();
        System.out.print("enter your address :");
        address=scan.nextLine();
        System.out.print("enter your DOB :");
        dob=scan.nextLine();
        System.out.print("Enter your Blood group :");
        bloodGroup=scan.nextLine();
        if(login()==true){
            setDetails(userId,password);
            setinfo();
            dbObj.getConnection(userDetailString);
        }
        
       
    }
    
    public void studentLogin() {
        boolean checkedIn=false; 
            System.out.println("1.show profile.\n2.check in.\n3.checkout.");
            System.out.println("enter your option.");
            studentOptions=scan.nextLine();
            switch (studentOptions.toLowerCase()){
                case "1":
                    dbObj.commString="select * from Studentdata where uId = '";
                    dbObj.readFromDb(userId);
                case "2":
                    checkedIn=true;
                case "3":
                    checkedIn=false;
                }
                
    }
        
      

    public void teacherSignIn() {
        System.out.println("Enter your name :");
        teacherName=scan.nextLine();
        System.out.println("Enter your role :");
        role=scan.nextLine();
        System.out.println("Enter Gender (M or F) :");
        gender =scan.nextLine();
        System.out.println("Enter years of experience :");
        experience=scan.nextLine();
        if(login()){
            dbObj.commString = "insert into TeacherDatas values(";
            userDetailString=userId + ",'" + teacherName + "','" + role+ "'," +experience  + ",'"+gender+"','"+password+"'";
            dbObj.getConnection(userDetailString);
        }
    }

    public void teacherLogin() {
            System.out.println("1.View profile.\n2.View Students profile.\n3.Add Student.");
            options=scan.nextInt();
            scan.nextLine();
            switch (options) {
                case 1:
                    dbObj.commString="select * from TeacherDatas where  userID= '";
                    dbObj.readFromDb(userId);
                    break;
                case 2:
                    System.out.println("enter Student id :");
                    userId=scan.nextLine();
                    studentLogin();
                case 3:
                    studentSignIn();
                default:
                    break;
        }
    }

    public void setinfo() {
        userDetailString = "'" + userId + "','" + studentName + "','" + fatherName + "','" + motherName + "','"+ address + "','" + dob + "','" + bloodGroup + "','" +password+"'";
    }

    public static void main(String[] args) {
        Login s= new Login();
        s.getinput(); 
        
    }

}

