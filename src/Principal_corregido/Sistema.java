/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal_corregido;
import Postres_corregido.*;
import Leche_corregida.Tipos_Leches;
import Otros.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        helado_vainilla.anadirAderezo(helado_vainilla, Aderezo.CREMA);
        helado_vainilla.anadirAderezo(helado_vainilla, Aderezo.FRUTILLA);
        helado_vainilla.cambioLeche(Tipos_Leches.Descremada);
        System.out.println(helado_vainilla);
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        pastel_chocolate.quitarAderezo(pastel_chocolate, Aderezo.CREMA);
        pastel_chocolate.anadirAderezo(pastel_chocolate, Aderezo.FRUTILLA);
        pastel_chocolate.cambioLeche(Tipos_Leches.Deslactosada);
        System.out.println(pastel_chocolate);
        
        
    }
}
