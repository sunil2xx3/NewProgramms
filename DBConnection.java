import java.sql.*;
public class DBConnection{
    String commString = "insert into Studentdata values(";
    Connection con;
    PreparedStatement stmt;
    public void getConnection(String query) {

        commString += query + ")";
        System.out.println(commString);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Users", "sunil", "sunilsks");
            stmt = con.prepareStatement(commString);
            stmt.execute(commString);

        } catch (Exception se) {
            System.out.println(se);
        }

    }

    public void readFromDb(String userId) {

        commString+=userId+"'";
        System.out.println(commString);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Users", "sunil", "sunilsks");
            stmt = con.prepareStatement(commString);
            ResultSet rs = stmt.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();
            int col = meta.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    String str = meta.getColumnName(i);
                    System.out.print(str.toString()+"   :");
                    System.out.println(rs.getString(i)+" ");
                }
            }
        } catch (Exception se) {
            System.out.println(se);
        }
        finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            }
            catch(Exception e){

            }
        } 
    }

    String existingUser="",userpassword="";
    public void verifyUser(String Id){
        commString+="'"+Id +"'";
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Users", "sunil", "sunilsks");
            stmt = con.prepareStatement(commString);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                existingUser=rs.getString(1);
                userpassword=rs.getString(2);
            }
        } catch (Exception se) {
            System.out.println(se);
        }
        finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            }
            catch(Exception e){
            }
        }   
        
    }
 
}