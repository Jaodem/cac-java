package ar.com.codoacodo.dao.impl;

import java.util.ArrayList;

import ar.com.codoacodo.oop.Articulo;
import ar.com.codoacodo.oop.Libro;

// Se cumple el contrato
public class MySQLDAOImpl implements DAO {

    // Atributos
    private String tableName;

    // Constructor
    public MySQLDAOImpl() {
        this.tableName = "articulos";
    }

    // Métodos    
    // Va a cumplir ese contrato entre DAO y esta clase
    public Articulo getById(Long id) { // 1
        return new Libro(null, null, 0, null, false, null);
    }

    @Override
    public void delete(Long id) {
        String sql = "delete from " + this.tableName + " where id = " + id;
        // Acá va la magia que falta

    }

    @Override
    public ArrayList<Articulo> findAll() {
        String sql = "select * from " + this.tableName;
        return null;
    }

    @Override
    public void update(Articulo articulo) {
        String sql = "update " + this.tableName + " set titulo= , precio= , autor= ";
    }

    @Override
    public void create(Articulo articulo) {
        String sql = "insert into " + this.tableName;
        sql += "(titulo, autor, precio, fecha, novedad)";
        sql += "value(..., ..., ..., ..., ...)";

        // Obtener la Connection

        // PreparedStatement con mi sql

        // ResultSet
    }
    
}
