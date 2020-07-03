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
public class Bateria extends Parte{
    private String material;
    private int horas;

    public Bateria(String material, int horas, int tiempo) {
        super(tiempo);
        this.material = material;
        this.horas = horas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Bateria{" + "material=" + material + ", horas=" + horas + '}';
    }
    
}
