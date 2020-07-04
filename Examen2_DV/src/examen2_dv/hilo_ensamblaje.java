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
    private int tam;
    private JTable tabla;
    private Computadora c;
private JProgressBar progBar_t;

    public hilo_ensamblaje(JProgressBar progBar_t,int tam, JTable tabla, Computadora c) {
          this.progBar_t = progBar_t;
        this.avanzar = true;
        this.vive = true;
        this.tam = tam;
        this.tabla = tabla;
        this.c = c;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                if (progBar_t.getValue() < progBar_t.getMaximum()) {
                    progBar_t.setMaximum(tam);
                    this.progBar_t.setValue(this.progBar_t.getValue() + 1);

                } else {
                    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                    Object[] newrow2 = {"RAM", c.getRam().getTiempo()};
                    Object[] newrow3 = {"Disco Duro", c.getDisk().getTiempo()};
                    Object[] newrow4 = {"Bateria", c.getBaterry().getTiempo()};
                    Object[] newrow5 = {"Teclado", c.getTeclado().getTiempo()};
                    Object[] newrow6 = {"Pantalla", c.getPantalla().getTiempo()};
                    Object[] newrow7 = {"Procesador", c.getProcesador().getTiempo()};
                    model.addRow(newrow2);
                    model.addRow(newrow3);
                    model.addRow(newrow4);
                    model.addRow(newrow5);
                    model.addRow(newrow6);
                    model.addRow(newrow7);
                    tabla.setModel(model);  
                }
                avanzar=false;
            }
            try {
                Thread.sleep(1000);

            } catch (Exception ex) {

            }
        }
    }
}
