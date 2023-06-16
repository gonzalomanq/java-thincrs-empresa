import model.Cliente;
import model.OrdenVentaDetalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class main {

    static final String DB_URL = "jdbc:mysql://localhost/empresa";
    static final String USER = "root";
    static final String PASS = "Banamex21";
    static final String QUERY = "SELECT * from Cliente where idcliente = ?";
   // static final String QUERY2 = "SELECT * from Persona where idpersona = ?";
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setIdCliente(1);
        cliente.setNombreCliente("Gonzalo Manquero Lazo");
        cliente.setDireccionCliente("Av. Siempre Viva #1234 Chihuahua");
        cliente.setRfcCliente("MALG001230-23");

        OrdenVentaDetalle venta1 = new OrdenVentaDetalle();
        venta1.setIdOrdenVentaCabecera(1);
        venta1.setCodigoMaterial("SKU1");
        venta1.setDescripcionMaterial("Vaso Peltre");
        venta1.setPrecioUnitario(10);
        venta1.setUnidades(1);

        System.out.println(venta1);

        System.out.println(cliente);

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        PreparedStatement sentencia = conn.prepareStatement(QUERY);
        sentencia.setInt(1,1);

        ResultSet result = sentencia.executeQuery();
        while (result.next()){
            System.out.println(result.getString("nombre_cliente"));
        }

        conn.close();

    }
}
