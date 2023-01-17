package Models;

public class Avion extends Thread {
    String nom;
    Aeroport a;
    public Avion(String s) {
        nom = s;
    }
    public void run() {
        a = new Aeroport();
        System.out.println("Je suis avion " + nom + " sur aeroport " +

                a);
    }
}