/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_dv;

import java.awt.Color;

/**
 *
 * @author diego
 */
public class Teclado extends Parte {
    private String material;
    private String color;

    public Teclado(String material, String color, int tiempo) {
        super(tiempo);
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Teclado{" + "material=" + material + ", color=" + color + '}';
    }
    
}
