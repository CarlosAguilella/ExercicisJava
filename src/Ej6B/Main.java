package Ej6B;

class Empleado {
    String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}
class Directivo extends Empleado{


    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
}
class Operario extends Empleado{


    public Operario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
}
class Oficial extends Operario{

    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}
class Tecnico extends Operario{
    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
}


public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Rafa");
        Directivo directivo = new Directivo("Mario");
        Operario operario = new Operario("Alfonso");
        Oficial oficial = new Oficial("Luis");
        Tecnico tecnico = new Tecnico("Pablo");
        System.out.println(empleado);
        System.out.println(directivo);
        System.out.println(operario);
        System.out.println(oficial);
        System.out.println(tecnico);
    }
}
