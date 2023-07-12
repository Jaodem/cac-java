package ar.com.codoacodo.oop;

import java.time.LocalDateTime;

public class Musica extends Articulo {
    
    String sello;

    public Musica(
        String titulo,
        String imagen,
        double precio,
        String autor,
        boolean novedad,
        String sello,
        String codigo,
        LocalDateTime fechaCreacion) {
        super(titulo, imagen, precio, autor, novedad, codigo, fechaCreacion);
        this.sello = sello;
    }

    // setter | getter
    public String getSello() {
        return sello;
    }
    
    
    /*
    public void setSello(String sello) {
        this.sello = sello;
    }
    */
    
    // Polimorfnismo
    public String toString() {
        return super.toString() + ", Musica [sello=" + sello + "]";
    }
    
    
}
