/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsconcurrente.tp2.ejercicio2;

/**
 *
 * @author Kolia
 */
public class ThreadTesting {
    
    public static void main(String[] args) {
        Thread miHilo = new MiEjecucion();
        miHilo.start();
//        try {
//            Thread.sleep(1000);
//        } catch (Exception e) {
//            System.out.println("error");
//        }
//        
        System.out.println("En el main");
    }
}
