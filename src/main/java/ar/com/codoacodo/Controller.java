package ar.com.codoacodo;

import java.sql.SQLException;
import java.time.LocalDateTime;

import ar.com.codoacodo.dao.impl.DAO;
import ar.com.codoacodo.dao.impl.MySQLDAOImpl;
import ar.com.codoacodo.oop.Articulo;
import ar.com.codoacodo.oop.Libro;

public class Controller 
{
    public static void main( String[] args ) throws SQLException {

        // Create Controller

        // Tendría que tener los parámetros del front (<form>)
        String titulo = "titulo del front";
        double precio = 15000;
        String autor = "autor que viene del front";
        String codigo = "ABC456";
        String isbn = "123456";
        LocalDateTime ldt = LocalDateTime.now();
        
        Articulo nuevo = new Libro(titulo, codigo, precio, autor, false, isbn);
        
        // Interface nombre = new ClaseQueImplementaLaInterface();
        DAO dao = new MySQLDAOImpl();
        
        // Puedo usar los métodos que tiene DAO, sin saber quien cumple el contrato
        dao.create(nuevo);

        System.out.println(nuevo);
    }
}
