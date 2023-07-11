package ar.com.codoacodo.oop;

public class Musica extends Articulo {
    
    String sello;

    public Musica(String titulo, String imagen, double precio, String autor, boolean novedad, String sello) {
        super(titulo, imagen, precio, autor, novedad);
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
