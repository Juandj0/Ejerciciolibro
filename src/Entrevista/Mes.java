/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrevista;

/**
 *
 * @author Nicolas Garcia y Juan David Jaime
 */
public class Mes {
    private String nombre;
    private int numero;
    private int numero_dias;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNumero_dias(int numero_dias) {
        this.numero_dias = numero_dias;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getNumero() {
        return numero;
    }

    public int getNumero_dias() {
        return numero_dias;
    }

    public Mes(String nombre,int numero, int numero_dias) {
        this.nombre = nombre;
        this.numero = numero;
        this.numero_dias = numero_dias;
    }
}
