/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsconcurrente.tp3.ejercicio4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kolia
 */
public class Auto extends Vehiculo implements Runnable {

    Surtidor compartido;
    int tramo;

    public Auto(String nombre, Surtidor compartido, int km) {

        this.kmFaltantesParaElService = km;
        this.tramo = 1000;
        this.modelo = nombre;
        this.compartido = compartido;

    }

    @Override
    public void run() {
        
        System.out.println("El "+modelo+" andara "+
                kmFaltantesParaElService);
        try {
            Thread.sleep(kmFaltantesParaElService);
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Auto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
