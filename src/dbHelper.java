import java.sql.*;

public class dbHelper {
    private String userName="root";
    private String password="12345";
    private String dbUrl="jdbc:mysql://localhost:3306/assetotomation?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    
  
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error: "+exception.getMessage());
        System.out.println("Error code: "+exception.getErrorCode()); 
    
    }
}