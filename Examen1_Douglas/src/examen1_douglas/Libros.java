/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_douglas;

/**
 *
 * @author famii
 */
public class Libros {
    String autores; 
    String titulo; 
    String genero; 
    String Editoriales; 
    String idioma; 
    int Year;
    String ISBN;
    int yearIngresa;
    String EstadoLibro;
    String PersonaLibro;
    int NumCuentaPersona;

    public Libros() {
    }

    public Libros(String autores, String titulo, String genero, String Editoriales, String idioma, int Year, String ISBN, int yearIngresa, String EstadoLibro, String PersonaLibro, int NumCuentaPersona) {
        this.autores = autores;
        this.titulo = titulo;
        this.genero = genero;
        this.Editoriales = Editoriales;
        this.idioma = idioma;
        this.Year = Year;
        this.ISBN = ISBN;
        this.yearIngresa = yearIngresa;
        this.EstadoLibro = EstadoLibro;
        this.PersonaLibro = PersonaLibro;
        this.NumCuentaPersona = NumCuentaPersona;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
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

    public String getEditoriales() {
        return Editoriales;
    }

    public void setEditoriales(String Editoriales) {
        this.Editoriales = Editoriales;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYearIngresa() {
        return yearIngresa;
    }

    public void setYearIngresa(int yearIngresa) {
        this.yearIngresa = yearIngresa;
    }

    public String getEstadoLibro() {
        return EstadoLibro;
    }

    public void setEstadoLibro(String EstadoLibro) {
        this.EstadoLibro = EstadoLibro;
    }

    public String getPersonaLibro() {
        return PersonaLibro;
    }

    public void setPersonaLibro(String PersonaLibro) {
        this.PersonaLibro = PersonaLibro;
    }

    public int getNumCuentaPersona() {
        return NumCuentaPersona;
    }

    public void setNumCuentaPersona(int NumCuentaPersona) {
        this.NumCuentaPersona = NumCuentaPersona;
    }
    
}
