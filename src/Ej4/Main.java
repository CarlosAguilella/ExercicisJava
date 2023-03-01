package Ej4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Examen{
    String asignatura, aula;
    FechaHora fechaHora;

    public Examen(String asignatura, String aula, FechaHora fechaHora) {
        this.asignatura = asignatura;
        this.aula = aula;
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "asignatura='" + asignatura + '\'' +
                ", aula='" + aula + '\'' +
                ", fechaHora=" + fechaHora.toString() +
                '}';
    }
}

class FechaHora{
    Fecha fecha;
    Hora hora;

    public FechaHora(Fecha fecha, Hora hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "FechaHora{" +
                "fecha=" + fecha.toString() +
                ", hora=" + hora.toString() +
                '}';
    }
}

class Fecha{
    int anyo, mes, dia;

    public Fecha(int anyo, int mes, int dia) {
        this.anyo = anyo;
        this.mes = mes;
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "anyo=" + anyo +
                ", mes=" + mes +
                ", dia=" + dia +
                '}';
    }
}

class Hora{
    int hora, minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return "Hora{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                '}';
    }
}

class Calendario{
    List<Examen> examenes = new ArrayList<>();

    public void addExamen(Examen e) {
        examenes.add(e);
    }

    public void addExamenes(Examen... exas) {
        Collections.addAll(examenes, exas);
    }

    @Override
    public String toString() {
        String resultado = "";
        for (Examen examen : examenes) {
            resultado += examen.toString() + "\n";

        }
        return resultado;
    }
}

public class Main {
    public static void main(String[] args) {

        Calendario calendario = new Calendario();

        calendario.addExamenes(
                new Examen("Base de datos", "info2", new FechaHora(new Fecha(2023,2,28),new Hora(15,5))),
                new Examen("Base de desdatos", "info3", new FechaHora(new Fecha(2023,5,8),new Hora(20,35))),
                new Examen("Datos de base", "infoJobs", new FechaHora(new Fecha(2023,12,2),new Hora(18,50)))
        );
        System.out.println(calendario);
    }
}
