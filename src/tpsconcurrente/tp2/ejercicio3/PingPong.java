/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsconcurrente.tp2.ejercicio3;

/**
 *
 * @author Kolia
 */
public class PingPong extends Thread{
    
    private String cadena;
    private int delay;
    
    public PingPong (String cartel, int canMs){
    
        this.cadena = cartel;
        this.delay = canMs;
    }
    
    public void run(){
        for (int i = 1; i < delay * 10; i++) {
            System.out.println(cadena + "");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
            }
        }
    }
}
