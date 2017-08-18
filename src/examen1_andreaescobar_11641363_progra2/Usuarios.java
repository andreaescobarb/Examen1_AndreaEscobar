package examen1_andreaescobar_11641363_progra2;

import java.util.ArrayList;
import java.util.Date;

public class Usuarios {
    private String usuario;
    private String contraseña;
    private Date nacimiento;
    private int telefono;
    private String correo;
    private String nombre;
    private String genero;
    private ArrayList<Libro> libros;
    private ArrayList<Usuarios> amigos;

    public Usuarios() {
    }

    public Usuarios(String usuario, String contraseña, Date nacimiento, int telefono, String correo, String nombre, String genero, ArrayList<Libro> libros, ArrayList<Usuarios> amigos) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
        this.genero = genero;
        this.libros = libros;
        this.amigos = amigos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Usuarios> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuarios> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nacimiento=" + nacimiento + ", telefono=" + telefono + ", correo=" + correo + ", nombre=" + nombre + ", genero=" + genero + ", libros=" + libros + ", amigos=" + amigos + '}';
    }
}
