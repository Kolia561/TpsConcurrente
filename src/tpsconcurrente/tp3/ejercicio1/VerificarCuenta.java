/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsconcurrente.tp3.ejercicio1;


/**
 *
 * @author Kolia
 */
public class VerificarCuenta implements Runnable {

    private CuentaBanco cb = new CuentaBanco();



    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                cb.hacerRetiro(10);
                if (cb.getBalance()< 0) {
                    System.out.println("La cuenta esta sobregirada");
                    
                }
            } catch (Exception e) {
             
        }
        
    }

}
}