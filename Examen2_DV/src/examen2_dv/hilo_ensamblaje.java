/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_dv;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class hilo_ensamblaje implements Runnable {

    private boolean avanzar;
    private boolean vive;
    private JTable tabla;
    private Computadora c;
    private JProgressBar progBar_t;

    public hilo_ensamblaje(JProgressBar progBar_t, JTable tabla, Computadora c) {
        this.progBar_t = progBar_t;
        this.avanzar = true;
        this.vive = true;
        this.tabla = tabla;
        this.c = c;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                try {
                    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                    progBar_t.setMaximum(c.getRam().getTiempo());
                    for (int i = 0; i < c.getRam().getTiempo(); i++) {
                        progBar_t.setValue(i);
                        Thread.sleep(1000);
                    }
                    progBar_t.setValue(0);
                    Object[] newrow2 = {"RAM", c.getRam().getTiempo()};
                    model.addRow(newrow2);
                    tabla.setModel(model);
                    progBar_t.setMaximum(c.getDisk().getTiempo());
                    for (int i = 0; i < c.getDisk().getTiempo(); i++) {
                        progBar_t.setValue(i);
                        Thread.sleep(1000);
                    }
                    Object[] newrow3 = {"Disco Duro", c.getDisk().getTiempo()};
                    model.addRow(newrow3);
                    tabla.setModel(model);
                    progBar_t.setValue(0);
                    progBar_t.setMaximum(c.getBaterry().getTiempo());
                    for (int i = 0; i < c.getBaterry().getTiempo(); i++) {
                        progBar_t.setValue(i);
                        Thread.sleep(1000);
                    }
                    Object[] newrow4 = {"Bateria", c.getBaterry().getTiempo()};
                    model.addRow(newrow4);
                    tabla.setModel(model);
                    progBar_t.setValue(0);
                    progBar_t.setMaximum(c.getTeclado().getTiempo());
                    for (int i = 0; i < c.getTeclado().getTiempo(); i++) {
                        progBar_t.setValue(i);
                        Thread.sleep(1000);
                    }
                    Object[] newrow5 = {"Teclado", c.getTeclado().getTiempo()};
                    tabla.setModel(model);
                    progBar_t.setValue(0);
                    progBar_t.setMaximum(c.getTeclado().getTiempo());
                    for (int i = 0; i < c.getTeclado().getTiempo(); i++) {
                        progBar_t.setValue(i);
                        Thread.sleep(1000);
                    }
                    Object[] newrow6 = {"Pantalla", c.getPantalla().getTiempo()};
                    model.addRow(newrow6);
                    tabla.setModel(model);
                    progBar_t.setValue(0);
                    progBar_t.setMaximum(c.getPantalla().getTiempo());
                    for (int i = 0; i < c.getPantalla().getTiempo(); i++) {
                        progBar_t.setValue(i);
                        Thread.sleep(1000);
                    }
                    Object[] newrow7 = {"Procesador", c.getProcesador().getTiempo()};
                    model.addRow(newrow7);
                    tabla.setModel(model);
                    avanzar = false;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);

            } catch (Exception ex) {

            }
        }
    }
}
