package tpsconcurrente.tp2.ejercicio1;

public class Cliente extends Thread {

    String name;

    public void run​(){
        System.out.println("soy"+Thread.currentThread().getName());
        Recurso.uso();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        
        };
    };
}