package ar.com.codoacodo.dao.impl;

import java.util.ArrayList;

import ar.com.codoacodo.oop.Articulo;
import ar.com.codoacodo.oop.Libro;

// Se cumple el contrato
public class MySQLDAOImpl implements DAO {

    // Atributos
    private String tableName = "articulo";

    // Constructor 

    // Métodos    
    // Va a cumplir ese contrato entre DAO y esta clase
    public Articulo getById(Long id) { // 1
        return new Libro(null, null, 0, null, false, null);
    }

    @Override
    public void delete(Long id) {
        String sql = "delete from articulos where id = " + id;

    }

    @Override
    public ArrayList<Articulo> findAll() {
        String sql = "select * from articulos";
        return null;
    }

    @Override
    public void update(Articulo articulo) {
        String sql = "update articulos set titulo= , precio= , autor= ";
    }

    @Override
    public void create(Articulo articulo) {
        String sql = "insert into articulos";
        sql += "(titulo, autor, precio, fecha, novedad)";
        sql += "value(..., ..., ..., ..., ...)";

        // Obtener la Connection

        // PreparedStatement con mi sql

        // ResultSet
    }
    
}
