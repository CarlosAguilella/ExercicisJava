package Ej6;

class Animal{
    String nombre, tipoAlimentacion;
    int edad;

    public Animal(String nombre, String tipoAlimentacion, int edad) {
        this.nombre = nombre;
        this.tipoAlimentacion = tipoAlimentacion;
        this.edad = edad;
    }

    void morir(){
        System.out.println("ESTOY MUERTO");
    }

    @Override
    public String toString() {
        return "\uD83D\uDC38 Animal  {" +
                "\uD83D\uDC38 nombre ='" + nombre + '\'' +
                ", \uD83D\uDC38tipoAlimentacion ='" + tipoAlimentacion + '\'' +
                ", \uD83D\uDC38edad =" + edad +
                "} ";
    }
}
class Mamifero extends Animal{
    int gestacion;

    public Mamifero(String nombre, String tipoAlimentacion, int edad, int gestacion) {
        super(nombre, tipoAlimentacion, edad);
        this.gestacion = gestacion;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC0BMamifero{" +
                "\uD83D\uDC0Bgestacion=" + gestacion +
                ", \uD83D\uDC0Bnombre='" + nombre + '\'' +
                ", \uD83D\uDC0BtipoAlimentacion='" + tipoAlimentacion + '\'' +
                ", \uD83D\uDC0Bedad=" + edad +
                '}';
    }
}
class Perro extends Mamifero{
    String raza;

    public Perro(String nombre, String tipoAlimentacion, int edad, int gestacion, String raza) {
        super(nombre, tipoAlimentacion, edad, gestacion);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC36Perro{" +
                "\uD83D\uDC36raza='" + raza + '\'' +
                ", \uD83D\uDC36gestacion=" + gestacion +
                ", \uD83D\uDC36nombre='" + nombre + '\'' +
                ", \uD83D\uDC36tipoAlimentacion='" + tipoAlimentacion + '\'' +
                ", \uD83D\uDC36edad=" + edad +
                '}';
    }
}
class Gato extends Mamifero{
    String pedigri;

    public Gato(String nombre, String tipoAlimentacion, int edad, int gestacion, String pedigri) {
        super(nombre, tipoAlimentacion, edad, gestacion);
        this.pedigri = pedigri;
    }

    void miolar(){
        System.out.println("MIAUUU");
    }

    void morir(){
        System.out.println("ESTOY MIAAAAAUUUERTO");
    }


    @Override
    public String toString() {
        return "\uD83D\uDC31Gato{" +
                "\uD83D\uDC31pedigri='" + pedigri + '\'' +
                ", \uD83D\uDC31gestacion=" + gestacion +
                ", \uD83D\uDC31nombre='" + nombre + '\'' +
                ", \uD83D\uDC31tipoAlimentacion='" + tipoAlimentacion + '\'' +
                ", \uD83D\uDC31edad=" + edad +
                '}';
    }
}
class Caballo extends Mamifero{
    String comida;
    int ejercicio;

    public Caballo(String nombre, String tipoAlimentacion, int edad, int gestacion, String comida, int ejercicio) {
        super(nombre, tipoAlimentacion, edad, gestacion);
        this.comida = comida;
        this.ejercicio = ejercicio;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC34Caballo{" +
                "\uD83D\uDC34comida='" + comida + '\'' +
                ", \uD83D\uDC34ejercicio=" + ejercicio +
                ", \uD83D\uDC34gestacion=" + gestacion +
                ", \uD83D\uDC34nombre='" + nombre + '\'' +
                ", \uD83D\uDC34tipoAlimentacion='" + tipoAlimentacion + '\'' +
                ", \uD83D\uDC34edad=" + edad +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Gustavo", "insectos", 3);
        Mamifero mamifero = new Mamifero("Moby Dick", "plancton", 5, 12);
        Perro perro = new Perro("Tobby", "carne", 7, 2, "caniche");
        Gato gato = new Gato("Tom", "pescado", 4, 4, "siamés");
        Caballo caballo = new Caballo("Rocinante", "hierba", 8, 12, "español", 2);

        Animal gato2 = new Gato("Tom", "pescado", 4, 4, "siamés");

        gato2.morir();

        System.out.println(gato2);
        System.out.println(animal);
        System.out.println(mamifero);
        System.out.println(perro);
        System.out.println(gato);
        System.out.println(caballo);
    }
}
