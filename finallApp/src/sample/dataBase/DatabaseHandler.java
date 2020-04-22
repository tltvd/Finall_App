package sample.dataBase;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseHandler extends Configs {
    Connection dbConnection;


    public Connection getDbConnection()throws SQLException,ClassNotFoundException{
        String connectionString= "jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbName+"?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection=DriverManager.getConnection(connectionString,dbUser,dbPass);
        return dbConnection;
    }


    public void signUpUser(String firstname,String lastname,String phone,String city,
                           String gender,String username,String email,String password){
        String insert= "INSERT INTO "+Const.USER_TABLE+"("+Const.USERS_FIRSTNAME+","+Const.USERS_LASTNAME+","+Const.USERS_USERNAME+","+
                Const.USERS_PASSWORD+","+Const.USERS_CITY+","+Const.USERS_EMAIL+","+Const.USERS_GENDER+","+ Const.USERS_PHONE+")"+"VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, firstname);
            prSt.setString(2, lastname);
            prSt.setString(3, username);
            prSt.setString(4, password);
            prSt.setString(5, city);
            prSt.setString(6, email);
            prSt.setString(7, gender);
            prSt.setString(8, phone);
            prSt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }



}
