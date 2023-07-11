package ar.com.codoacodo.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
    
    /* Staticpermite usar Clase.metodo
     * AdministradorDeConexiones.getConnection()
     * Sin necesidad de instanciar un objeto
    */

    public static Connection getConnection() {
        String hosts = "127.0.0.1"; // localhosts
        String port = "3306";
        String password = "root";
        String username = "root";

        // Driver de conexión a la base de datos
        String driverClassName = "com.mysql.cj.jdbc.Driver";

        // Nombre de la base de datos
        String dbName = "23049-db";

        // No explica try catch, sólo lo usa
        Connection connection;
        try {
            Class.forName(driverClassName);

            String url = "jdbc:mysql://" + hosts + ":"+ port +"/"+ dbName +"?allowPublicKeyRetrieval=true&serverTimeZone=UTC&useSSL=false";

            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            connection = null;
        }

        return connection;
    }
}
