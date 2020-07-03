/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_dv;

import java.io.Serializable;

/**
 *
 * @author diego
 */
public class Parte implements Serializable{
     private static final long SerialVersionUID = 666L;
    private int tiempo;

    public Parte(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Parte{" + "tiempo=" + tiempo + '}';
    }
    
    
}
