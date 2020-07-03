/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_dv;

/**
 *
 * @author diego
 */
public class Disco extends Parte{
     private String marca;
    private int tamaño;

    public Disco(String marca, int tamaño, int tiempo) {
        super(tiempo);
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Disco{" + "marca=" + marca + ", tama\u00f1o=" + tamaño + '}';
    }
    
}
