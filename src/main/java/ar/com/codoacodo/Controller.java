package ar.com.codoacodo;

import java.sql.SQLException;
import java.time.LocalDateTime;

import ar.com.codoacodo.dao.impl.DAO;
import ar.com.codoacodo.dao.impl.MySQLDAOImpl;
import ar.com.codoacodo.oop.Articulo;

public class Controller 
{
    public static void main( String[] args ) throws SQLException {
        // Interface nombre = new ClaseQueImplementaLaInterface();
        DAO dao = new MySQLDAOImpl();

        // Tendría que tener los parámetros del front (<form>)
        String titulo = "titulo del front";
        double precio = 15000;
        String autor = "autor que viene del front";
        String codigo = "ABC456";
        String isbn = "123456";
        LocalDateTime ldt = LocalDateTime.now();

        // Puedo usar los métodos que tiene DAO, sin saber quien cumple el contrato
        Articulo a = dao.getById(1l);

        System.out.println(a);
    }
}
