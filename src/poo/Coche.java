package poo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Coche {

    int ruedas;
    int largo;
    int ancho;
    int motor;
    int peso;

    public Coche(){

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }

    public static void main(String[] args) {

        Coche Renault = new Coche();

        System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
    }

}