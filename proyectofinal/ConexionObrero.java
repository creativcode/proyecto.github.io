import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionObrero {
    private static final String User = "root";
    private static final String Password = "";
    private static final String URL = "jdbc:mysql://localhost:3306/bd?user=" + User + "&password=" + Password;

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println("No conectado");
            e.printStackTrace();
            return null;
        }
    }

    public static void cerrarConexion(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        }
    }
}