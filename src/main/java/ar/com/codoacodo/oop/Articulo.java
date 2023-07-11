package ar.com.codoacodo.oop;

import java.time.LocalDateTime;

// Todas las clases son hijas de Object
// Nombre
public abstract class Articulo {
    
    // Atributos: convertir a protected

    protected String titulo;
    protected double precio;
    protected String imagen;
    protected String autor;
    protected boolean novedad;
    protected LocalDateTime fechaCreacion;

    // Constructor/es
    // Si no se escribe el constructor, JVM da uno por defecto
    public Articulo(
        String titulo,
        String imagen,
        double precio,
        String autor,
        boolean novedad) {
            this.titulo = titulo;
            this.imagen = imagen;
            this.precio = precio;
            this.autor = autor;
            this.novedad = false;
            this.fechaCreacion = LocalDateTime.now();
            this.novedad = novedad;
    }

    // Métodos: va entre llaves
    public String mostrarImagen() {
        return this.imagen;
    }

    public void mas10Porciente() {
        // En java los números con decimales son por defecto del tipo double
        this.precio *= 1.1;
    }

    @Override
    public String toString() {
        return "Articulo [titulo=" + titulo + ", precio=" + precio + ", imagen=" + imagen + ", autor=" + autor
                + ", novedad=" + novedad + ", fechaCreacion=" + fechaCreacion + "]";
    }

}
