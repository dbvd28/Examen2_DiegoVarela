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
public class Computadora implements Serializable{

    private int noserie;
    private int Año;
    private String color;
    private String material;
    private RAM ram;
    private Disco disk;
    private Bateria baterry;
    private Teclado teclado;
    private Pantalla pantalla;
    private Procesador procesador;
    private static final long SerialVersionUID = 777L;

    public Computadora(int noserie, int Año, String color, String material, RAM ram, Disco disk, Bateria baterry, Teclado teclado, Pantalla pantalla, Procesador procesador) {
        this.noserie = noserie;
        this.Año = Año;
        this.color = color;
        this.material = material;
        this.ram = ram;
        this.disk = disk;
        this.baterry = baterry;
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    public int getNoserie() {
        return noserie;
    }

    public void setNoserie(int noserie) {
        this.noserie = noserie;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Disco getDisk() {
        return disk;
    }

    public void setDisk(Disco disk) {
        this.disk = disk;
    }

    public Bateria getBaterry() {
        return baterry;
    }

    public void setBaterry(Bateria baterry) {
        this.baterry = baterry;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" + noserie + ", Año=" + Año + ", material=" + material + ", ram=" + ram + '}';
    }

}
