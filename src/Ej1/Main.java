package Ej1;
class Persona{
    String nombre;
    String apellido1;
    String apellido2;

    void setNombre(String nombre){
        this.nombre = nombre;
    }
    void setApellido1(String apellido1){
        this.apellido1 = apellido1;
    }
    void setApellido2(String apellido2){
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public Persona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public String laOrdenasion(){
        return apellido1 +" "+apellido2+", "+nombre;
    }

    public boolean laResepsion(String laComparasion){

        if (laComparasion.equals(apellido1)||laComparasion.equals(apellido2)||laComparasion.equals(nombre)){
            return true;
        } else {
            return false;
        }

    }



}
public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("gerard", "falco", "perez");

        persona.laOrdenasion();

        System.out.println(persona.laResepsion("juan"));
        System.out.println(persona.laResepsion("falco"));

    }
}
