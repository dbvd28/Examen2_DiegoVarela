/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_dv;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Tecnicos {
    private String nombre;
    private int edad;
    private String genero;
    private int ensambladas;

    public Tecnicos(String nombre, int edad, String genero, int ensambladas) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.ensambladas = ensambladas;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEnsambladas() {
        return ensambladas;
    }

    public void setEnsambladas(int ensambladas) {
        this.ensambladas = ensambladas;
    }


    @Override
    public String toString() {
        return   nombre + ", ensambladas=" + ensambladas + '}';
    }
   
}
