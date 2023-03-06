package ObjectRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Carrera {
    Random random = new Random();

    List<Coche> coches = new ArrayList<>();
    int distancia;

    public Carrera(int distancia) {
        this.distancia = distancia;
        Coche.maxVelocidad = distancia/15;
    }

    void iniciar (){
        while(true) {
            System.out.println("-".repeat(distancia));
            coches.forEach(coche -> {
                coche.acelerar(Coche.maxVelocidad /2-random.nextInt(Coche.maxVelocidad));
                coche.mover();
                System.out.println(" ".repeat(coche.distancia) + coche.piloto + " (" + coche.velocidad + ", " + coche.desgaste + ")");
            });

            Coche primero = primeraPosicion();
            if (primero.distancia >= distancia) {
                imprimePodium();
                return;
            }
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }

    private void imprimePodium() {
        for (int i = 0; i < 3; i++) {
            Coche elNano = primeraPosicion();
            System.out.println("El piloto "+ elNano.piloto+" ha quedado en "+(i+1)+" posicion.");
            coches.remove(elNano);
        }
    }

    void inscribir(Coche coche){
        coches.add(coche);
    }

    Coche primeraPosicion(){
        Coche primero = coches.get(0);
        for(Coche coche : coches){
            if (coche.distancia > primero.distancia){
                primero = coche;
            }
        }
        return primero;
    }

}

class Coche {
    String piloto;
    int distancia, velocidad, desgaste;
    static int maxVelocidad;

    public Coche(String piloto) {
        this.piloto = piloto;
    }

    void acelerar(int velocidad){
        this.velocidad += velocidad;
        this.velocidad -= desgaste /4;

        if (this.velocidad<1){
            this.velocidad=1;
        }
        if (this.velocidad>maxVelocidad){
            this.velocidad = maxVelocidad;
        }
    }

    void mover(){
        distancia += velocidad;
        desgaste++;
    }
}


public class Main {
    public static void main(String[] args) {

        Carrera carrera = new Carrera(200);

        carrera.inscribir(new Coche("Carlos"));
        carrera.inscribir(new Coche("Hector"));
        carrera.inscribir(new Coche("Josep"));
        carrera.inscribir(new Coche("Manuel"));
        carrera.inscribir(new Coche("Gerard"));
        carrera.inscribir(new Coche("Alejandro"));
        carrera.inscribir(new Coche("JPene "));
        carrera.inscribir(new Coche("Alonso"));
        carrera.inscribir(new Coche("Hamilton"));
        carrera.inscribir(new Coche("LeClerc"));

        carrera.iniciar();
    }
}