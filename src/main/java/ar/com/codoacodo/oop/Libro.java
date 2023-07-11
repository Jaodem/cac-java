package ar.com.codoacodo.oop;

// Libro es hijo (extends) de Articulo
public class Libro extends Articulo {
    // Atributo
    private String isbn;

    // Constructor/es
    public Libro(
        String titulo,
        String imagen,
        double precio,
        String autor,
        boolean novedad,
        String isbn
    ) {
        // 1 - Nace el padre
        super(titulo, imagen, precio, autor, novedad);

        // 2 - Nace el hijo
        this.isbn = isbn;
    }

    // Métodos
    public String obtenerIsbn() {
        return this.isbn;
    }

    @Override
    public String toString() {
        // El toString() del padre + el del hijo
        return super.toString() + ", Libro [isbn=" + isbn + "]";
    }

    
}
