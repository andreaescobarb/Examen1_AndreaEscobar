package examen1_andreaescobar_11641363_progra2;

import java.util.Date;

public class Libro {
    private String titulo;
    private String genero;
    private int puntaje;
    private int valor;
    private String descripcion;
    private int copias;
    private String autor;
    private Date fechapublicacion;
    private int edicion;

    public Libro() {
    }   

    public Libro(String titulo, String genero, int puntaje, int valor, String descripcion, int copias, String autor, Date fechapublicacion, int edicion) {
        this.titulo = titulo;
        this.genero = genero;
        this.puntaje = puntaje;
        this.valor = valor;
        this.descripcion = descripcion;
        this.copias = copias;
        this.autor = autor;
        this.fechapublicacion = fechapublicacion;
        this.edicion = edicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(Date fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", genero=" + genero + ", puntaje=" + puntaje + ", valor=" + valor + ", descripcion=" + descripcion + ", copias=" + copias + ", autor=" + autor + ", fechapublicacion=" + fechapublicacion + ", edicion=" + edicion + '}';
    }
}
