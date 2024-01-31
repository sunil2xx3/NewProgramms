import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
public class Request{
    ArrayList<String> arr = new ArrayList<String>();
    ArrayList<String> pas = new ArrayList<String>();
    boolean isPresent = false;
    Connection con = null;
    PreparedStatement stmt = null;
    String commString = "";

//    public static void main(String []args) {
//        Request obj = new Request();
//        obj.createUser("sunilsks","Stak");
//
//    }
    public void  getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ServletBase", "sunil", "sunilsks");
            System.out.println(commString);
        }
        catch (Exception se) {
            System.out.println(se);
        }


    }

    public void createUser(String user, String password) {
        commString="insert into LoginDemo1 values ('"+user+"','"+password+"')";
        try {
            getConnection();
            stmt=con.prepareStatement(commString);
            stmt.execute();
        }
        catch(Exception e){

        }
    }

    public boolean verifyUser(String user,String password){
        commString="select * from LoginDemo1";
        try{
            getConnection();

            ResultSet rs = stmt.executeQuery(commString);
            ResultSetMetaData meta = rs.getMetaData();
            int col = meta.getColumnCount();
            System.out.println(col);
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    String str = meta.getColumnName(i);
                    if(i==col){pas.add(rs.getString(i));}
                    else
                        arr.add(rs.getString(i));
                }
            }
            for (int j = 0; j < pas.size(); j++) {
                if (user.equals(arr.get(j)) && password.equals(pas.get(j))) {
                    isPresent=true;
                    break;
                }
            }
        }
        catch (Exception se) {
            System.out.println(se);
        }

        return isPresent;
    }
}

