/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsconcurrente.tp3.ejercicio2;

/**
 *
 * @author Kolia
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Vida yo = new Vida();

        Personaje orco = new Personaje(-3, yo);
        Personaje curandero = new Personaje(3, yo);
        
        
        Thread h1 = new Thread(orco, "orco");
        Thread h2 = new Thread(curandero, "curandero");
        
        h1.start();
        h2.start();
        h1.join();
        h2.join();
        System.out.println("la vida es de "+ yo.getVida());
    }
}   
