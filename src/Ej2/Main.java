package Ej2;

import java.util.Scanner;

class TextBox{
    private int ancho;
    private int alto;

    private String texto;

    public TextBox(String texto) {
        setTexto(texto, true);
    }

    public TextBox(String texto, int ancho, int alto) {
        this.texto = texto;
        this.ancho = ancho;
        this.alto = alto;
    }

    public TextBox(int ancho, int alto) {
        this.texto = "";
        setAncho(ancho);
        setAlto(alto);
    }

    public void setAncho(int ancho) {
        if (ancho >= 0 && ancho >= texto.length()) {
            this.ancho = ancho;
        }
    }

    public void setAlto(int alto) {
        if (alto >= 1 && !texto.isEmpty()){
            this.alto = alto;
        }
    }

    public void setTexto(String texto) {
        if (!texto.isEmpty()){
            this.texto = texto;
        }
    }

    public void setTexto(String texto, boolean ajustar) {
        if (ajustar && !texto.isEmpty()){
            ancho = texto.length();
            alto = 1;
        }
        this.texto = texto;
    }

    @Override
    public String toString() {
        return ancho + "x" + alto + "\n" +
                "┏" + "━".repeat(ancho) + "┓\n" +
                ("┃" + " ".repeat(ancho) + "┃\n").repeat((alto - 1) / 2) +
                (alto > 0 ? "┃" + " ".repeat((ancho - texto.length() + 1) / 2) + texto + " ".repeat((ancho - texto.length()) / 2) + "┃\n" : "") +
                ("┃" + " ".repeat(ancho) + "┃\n").repeat(alto / 2) +
                "┗" + "━".repeat(ancho) + "┛\n";
    }
}



public class Main {
    public static void main(String[] args) {


        TextBox textBox = new TextBox("holafgdsafasfdsaffsdafdsa");

        System.out.println(textBox);
    }
}
