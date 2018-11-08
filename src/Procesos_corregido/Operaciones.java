/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos_corregido;

import Otros.Aderezo;

/**
 *
 * @author USER
 */
public interface Operaciones {
     public abstract void anadirAderezo(Object O,Aderezo aderezo);
     public abstract void quitarAderezo(Object O,Aderezo aderezo);
     public abstract double calcularPrecioFinal();
    
}
