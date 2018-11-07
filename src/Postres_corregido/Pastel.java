/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres_corregido;

import Otros.Aderezo;
import Procesos_corregido.Operaciones;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Pastel implements Operaciones{
     private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Pastel(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }

    @Override
    public void anadirAderezo(Object O, Aderezo aderezo) {
        Pastel p= (Pastel) O;
         p.getAderezos().add(aderezo);
    }

    @Override
    public void quitarAderezo(Object O, Aderezo aderezo) {
       Pastel p= (Pastel) O;
         p.getAderezos().remove(aderezo);
    }
    
}
