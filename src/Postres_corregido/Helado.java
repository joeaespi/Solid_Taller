/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres_corregido;

import Leche_corregida.Tipos_Leches;
import Otros.Aderezo;
import Procesos_corregido.CambioLeche;
import Procesos_corregido.Operaciones;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Helado implements Operaciones, CambioLeche {
     private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
   private Tipos_Leches leche;
    public Helado(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        leche = Tipos_Leches.Entera;
    }    
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }

    @Override
    public void anadirAderezo(Object O, Aderezo aderezo) {
           Helado h= (Helado) O;
            h.getAderezos().add(aderezo);
    }

    @Override
    public void quitarAderezo(Object O, Aderezo aderezo) {
        Helado h= (Helado) O;
         h.getAderezos().remove(aderezo);
    }

    public Tipos_Leches getLeche() {
        return leche;
    }

    public void setLeche(Tipos_Leches leche) {
        this.leche = leche;
    }

    @Override
    public void cambioLeche(Tipos_Leches leches) {
        setLeche(leches);
        System.out.println("Usando leche " + leches);
    }
    @Override
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }        
}
