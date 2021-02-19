/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_douglas;

import java.util.ArrayList;

/**
 *
 * @author famii
 */
public class Usuario {
     String Nombre;
     String Apellido;
     String Edad;
     int Codigo;
     String Contraseña;
     int Rol_Usuario; 
     ArrayList<Libros> LibrosPrestados = new ArrayList<>();
     ArrayList<Libros> HistoriallibrosPrestados = new ArrayList<>();
     
     
    public Usuario() {
    }

    public Usuario(String Nombre, String Apellido, String Edad, int Codigo, String Contraseña, int Rol_Usuario) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Codigo = Codigo;
        this.Contraseña = Contraseña;
        this.Rol_Usuario = Rol_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getRol_Usuario() {
        return Rol_Usuario;
    }

    public void setRol_Usuario(int Rol_Usuario) {
        this.Rol_Usuario = Rol_Usuario;
    }

    public ArrayList<Libros> getLibrosPrestados() {
        return LibrosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libros> LibrosPrestados) {
        this.LibrosPrestados = LibrosPrestados;
    }

    public ArrayList<Libros> getHistoriallibrosPrestados() {
        return HistoriallibrosPrestados;
    }

    public void setHistoriallibrosPrestados(ArrayList<Libros> HistoriallibrosPrestados) {
        this.HistoriallibrosPrestados = HistoriallibrosPrestados;
    }
    
    
     
    
}
