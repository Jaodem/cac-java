package ar.com.codoacodo.oop;

public class Pelicula extends Articulo {
    
    private String productora;

    public Pelicula(String titulo, String imagen, double precio, String autor, boolean novedad, String productora) {
        super(titulo, imagen, precio, autor, novedad);
        this.productora = productora;
    }

    // setter | getter
    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }
    

    @Override
    public String toString() {
        return super.toString() + ", Pelicula [productora=" + productora + "]";
    }


    
}
