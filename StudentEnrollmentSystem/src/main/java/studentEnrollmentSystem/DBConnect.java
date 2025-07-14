package studentEnrollmentSystem;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/InfoClassWorkNormalization";
        String user = "root";
        String pass = "9441";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }
}
