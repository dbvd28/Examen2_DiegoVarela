/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_dv;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class admincomputadoras {

    private ArrayList<Computadora> listacomp = new ArrayList();
    private File archivo = null;

    public admincomputadoras(String path) {
        archivo = new File(path);
    }

    public ArrayList<Computadora> getListacomp() {
        return listacomp;
    }

    public void setListacomp(ArrayList<Computadora> listacomp) {
        this.listacomp = listacomp;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admincomputadoras{" + "listacomp=" + listacomp + '}';
    }
      public void cargarArchivo() {
        try {
            listacomp = new ArrayList();
            Computadora temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Computadora) objeto.readObject()) != null) {
                        listacomp.add(temp);
                    }
                } catch (EOFException E) {

                }
                entrada.close();
                objeto.close();
            }
        } catch (Exception e) {
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Computadora t : listacomp) {
                bw.writeObject(t);
            }
            bw.flush();
            fw.close();
            bw.close();

        } catch (Exception e) {

        }
    }
    public void Eliminar(int nombre) {
        try {
            cargarArchivo();
            int elim = 0;
            for (int i = 0; i < listacomp.size(); i++) {
                if (listacomp.get(i).getNoserie()==nombre) {
                    elim = i;
                }
            }
            listacomp.remove(elim);
            escribirArchivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
