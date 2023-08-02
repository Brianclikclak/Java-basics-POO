package poo;

public class Coche {


    private int ruedas;
    private int largo;
    private int ancho;              // Estos son los Atributos que tiene el coche
    private int motor;
    private int peso_plataforma;
    String color;

    int peso_total;
    boolean asientos_cuero, climatizador;

    public Coche(){ // Este el metodo constructor

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    public String getlargo(){  // Este es el metodo GETTER

        return "El largo del coche es " + largo + "cm";
    }

    public void setcolor(){  // Este es el metodo SETTER - Establecemos el color del coche

        color = "azul";
    }

    public String getcolor(){ // Este es el metodo GETTER - Retornamos el color del coche

        return "El color del coche es " + color;
    }



}

