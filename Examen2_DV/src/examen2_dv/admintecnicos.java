/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_dv;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class admintecnicos {

    private ArrayList<Tecnicos> tecnicos = new ArrayList();
    private File archivo = null;

    public admintecnicos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Tecnicos> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(ArrayList<Tecnicos> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admintecnicos{" + "tecnicos=" + tecnicos + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Tecnicos t : tecnicos) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getGenero() + ";");
                bw.write(t.getEnsambladas() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        tecnicos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    tecnicos.add(new Tecnicos(sc.next(),
                            sc.nextInt(),
                            sc.next(), sc.nextInt()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

    public void Eliminar(String nombre) {
        try {
            cargarArchivo();
            int elim = 0;
            for (int i = 0; i < tecnicos.size(); i++) {
                if (tecnicos.get(i).getNombre().equals(nombre)) {
                    elim = i;
                }
            }
            tecnicos.remove(elim);
            escribirArchivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Modnombre(String nombre, String nuevo) {
        try {
            cargarArchivo();
            for (int i = 0; i < tecnicos.size(); i++) {
                if (tecnicos.get(i).getNombre().equals(nombre)) {
                    tecnicos.get(i).setNombre(nuevo);
                }
            }
            escribirArchivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Modedad(String nombre, int años) {
        try {
            cargarArchivo();
            for (int i = 0; i < tecnicos.size(); i++) {
                if (tecnicos.get(i).getNombre().equals(nombre)) {
                    tecnicos.get(i).setEdad(años);
                }
            }
            escribirArchivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Modgenero(String nombre, String nuevo) {
        try {
            cargarArchivo();
            for (int i = 0; i < tecnicos.size(); i++) {
                if (tecnicos.get(i).getNombre().equals(nombre)) {
                    tecnicos.get(i).setGenero(nuevo);
                }
            }
            escribirArchivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
