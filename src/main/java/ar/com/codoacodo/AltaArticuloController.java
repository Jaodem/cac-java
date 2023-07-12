package ar.com.codoacodo;

import java.io.IOException;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.impl.DAO;
import ar.com.codoacodo.dao.impl.MySQLDAOImpl;
import ar.com.codoacodo.oop.Articulo;
import ar.com.codoacodo.oop.Libro;

public class AltaArticuloController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Create Controller

        // Tendría que tener los parámetros del front (<form>)
        String titulo = "titulo del front";
        double precio = 15000;
        String autor = "autor que viene del front";
        String codigo = "ABC456";
        String isbn = "123456";
        LocalDateTime fechaCreacion = LocalDateTime.now();
        
        Articulo nuevo = new Libro(titulo, codigo, precio, autor, false, isbn, codigo, fechaCreacion);
        
        // Interface nombre = new ClaseQueImplementaLaInterface();
        DAO dao = new MySQLDAOImpl();

        // Puedo usar los métodos que tiene DAO, sin saber quien cumple el contrato
        try {
            dao.create(nuevo); // try | catch | finally
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
