/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

/**
 *
 * @author Nicolas Garcia y Juan David Jaime
 */
public class Libro {
    //atributos de clase libro
    private String titulo;
    private String autor;
    private int numeropaginas;
    private int calificacion;
   
//constructor libro
    public Libro(String titulo, String autor, int numeropaginas, int calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
        this.calificacion = calificacion;
        
    }
// getters y setters atributos de clase libro
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
