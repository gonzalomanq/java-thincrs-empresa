import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class main {

    static final String DB_URL = "jdbc:mysql://localhost/empresa";
    static final String USER = "root";
    static final String PASS = "Banamex21";
    static final String QUERY = "SELECT * from Persona where idpersona = ?";
    static final String QUERY2 = "SELECT * from Persona where idpersona = ?";
    public static void main(String[] args) throws Exception {

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement sentencia = conn.prepareStatement(QUERY);
        sentencia.setInt(1,1);

        ResultSet result = sentencia.executeQuery();
        while (result.next()){
            System.out.println(result.getString("nombre_persona"));
        }

        conn.close();

    }
}
