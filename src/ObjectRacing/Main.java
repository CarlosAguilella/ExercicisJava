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
            System.out.println("X".repeat(distancia));
            coches.forEach(coche -> {
                coche.acelerar(Coche.maxVelocidad /2-random.nextInt(Coche.maxVelocidad));
                coche.mover();
                System.out.println("_".repeat(coche.distancia) + "\uD83C\uDFCE"+coche.piloto + "\uD83C\uDFCE");
                        //+ " (" + coche.velocidad + ", " + coche.desgaste + ")");
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
        for (int i = 0; i < 20; i++) {
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
        this.velocidad -= desgaste /10;

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

        Carrera carrera = new Carrera(150);

        carrera.inscribir(new Coche("VERSTAPPEN"));
        carrera.inscribir(new Coche("LECLERC"));
        carrera.inscribir(new Coche("RUSSELL"));
        carrera.inscribir(new Coche("OCON"));
        carrera.inscribir(new Coche("NORRIS"));
        carrera.inscribir(new Coche("BOTTAS"));
        carrera.inscribir(new Coche("STROLL"));
        carrera.inscribir(new Coche("MAGNUSSEN"));
        carrera.inscribir(new Coche("TSUNODA"));
        carrera.inscribir(new Coche("DON FERNANDO ALONSO"));
        carrera.inscribir(new Coche("ALBON"));
        carrera.inscribir(new Coche("PEREZ"));
        carrera.inscribir(new Coche("SAINZ"));
        carrera.inscribir(new Coche("HAMILTON"));
        carrera.inscribir(new Coche("GASLY"));
        carrera.inscribir(new Coche("PIASTRI"));
        carrera.inscribir(new Coche("GUANYU"));
        carrera.inscribir(new Coche("HULKENBERG"));
        carrera.inscribir(new Coche("DE VRIES"));
        carrera.inscribir(new Coche("SARGEANT"));

        carrera.iniciar();
    }
}