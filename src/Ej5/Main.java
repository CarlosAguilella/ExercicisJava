package Ej5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Coche {
    int numero, velocidad, distancia;
    String piloto;

    public Coche(int numero, int velocidad, String piloto, int distancia) {
        this.numero = numero;
        this.velocidad = velocidad;
        this.piloto = piloto;
        this.distancia = distancia;
    }

    void acelerar(int velocidad) {
        this.velocidad += velocidad;
    }
}

class Carrera {
    List<Coche> coches = new ArrayList<>();

    Coche masVeloz() {
        Coche masRapido = coches.get(0);
        for (Coche coche : coches) {
            if (coche.velocidad > masRapido.velocidad) {
                masRapido = coche;
            }
        }
        return masRapido;
    }

    void paso() {
        for (Coche coche : coches){
            coche.acelerar(5-new Random().nextInt(3));
            coche.distancia += coche.velocidad;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Carrera carrera = new Carrera();
        carrera.coches = List.of(
                new Coche(14, 200, "Alonso", 50),
                new Coche(7, 150, "Vettel", 50),
                new Coche(1, 100, "LeClerc", 50),
                new Coche(10, 0, "Hamilton", 50),
                new Coche(77, 175, "Sainz", 50),
                new Coche(99, 50, "Perez", 50)
        );

        carrera.coches.get(0).acelerar(101);
        carrera.coches.get(1).acelerar(150);
        carrera.coches.get(2).acelerar(200);
        carrera.coches.get(3).acelerar(300);
        carrera.coches.get(4).acelerar(125);
        carrera.coches.get(5).acelerar(250);


        System.out.println(carrera.masVeloz().piloto);

    }
}
