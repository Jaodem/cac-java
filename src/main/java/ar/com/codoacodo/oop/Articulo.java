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
    protected String codigo;

    // Constructor/es
    // Si no se escribe el constructor, JVM da uno por defecto
    public Articulo(
        String titulo,
        String imagen,
        double precio,
        String autor,
        boolean novedad,
        String codigo,
        LocalDateTime fechaCreacion) {
            this.titulo = titulo;
            this.imagen = imagen;
            this.precio = precio;
            this.autor = autor;
            this.novedad = false;
            this.fechaCreacion = fechaCreacion;
            this.novedad = novedad;
            this.codigo = codigo;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
