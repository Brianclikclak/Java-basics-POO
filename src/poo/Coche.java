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

    public String dime_datos_generales(){  // Este es el metodo GETTER
        return "La plataforma del vehiculo tiene " + ruedas + " ruedas." + " Mide " + largo/1000 +
                " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg.";
    }

    public void set_color(String color_coche){  // Este es el metodo SETTER - Establecemos el color del coche
        color = color_coche;
    }

    public String get_color(){ // Este es el metodo GETTER - Retornamos el color del coche
        return "El color del coche es " + color;
    }

    public void configura_asientos(String asientos_cuero){  //Metodo SETTER

        if(asientos_cuero == "si"){
            this.asientos_cuero = true;
        }
        else{
            this.asientos_cuero = false;
        }
    }

    public  String dime_asientos(){  // Metodo GETTER

        if(asientos_cuero){
            return "El coche tiene asientos de cuero";
        }
        else{
          return "El coche tiene asientos de serie";
        }
    }




}

