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
public class Orden {
    private Tecnicos tec;
    private Computadora comp;

    public Orden(Tecnicos tec, Computadora comp) {
        this.tec = tec;
        this.comp = comp;
    }

    public Tecnicos getTec() {
        return tec;
    }

    public void setTec(Tecnicos tec) {
        this.tec = tec;
    }

    public Computadora getComp() {
        return comp;
    }

    public void setComp(Computadora comp) {
        this.comp = comp;
    }

    @Override
    public String toString() {
        return "Orden{" + "tec=" + tec + ", comp=" + comp + '}';
    }
    
}
