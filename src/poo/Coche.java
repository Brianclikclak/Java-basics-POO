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

    public void set_color(String color_coche){      // Este es el metodo SETTER - Establecemos el valor del atributo
        color = color_coche;
    }

    public String get_color(){      // Este es el metodo GETTER - Retornamos el valor del atributo
        return "El color del coche es " + color;
    }

    public void configura_asientos(String asientos_cuero){     //Metodo SETTER

        if(asientos_cuero == "si"){
            this.asientos_cuero = true;
        }
        else{
            this.asientos_cuero = false;
        }
    }

    public  String dime_asientos(){     // Metodo GETTER

        if(asientos_cuero){
            return "El coche tiene asientos de cuero";
        }
        else{
          return "El coche tiene asientos de serie";
        }
    }

    public void configura_climatizador(String climatizador){     //Metodo SETTER

        if (climatizador == "si"){
            this.climatizador = true;
        }
        else {
            this.climatizador = false;
        }
    }

    public  String dime_climatizador(){       // Metodo GETTER

        if (climatizador == true){
            return "El coche viene con climatizador incorporado";
        }
        else {
            return "El coche viene con aire acondicionado";
        }
    }

    public String dime_peso_coche(){       // SETTER + GETTER

        int peso_carroceria = 500;
        peso_total = peso_plataforma + peso_carroceria;    // Establecemos un peso total = SETTER

        if (asientos_cuero == true){
            peso_total = peso_total + 50;
        }
        if (climatizador == true){
            peso_total = peso_total + 20;
        }
        return "El peso del coche es " + peso_total;       // Retornamos el peso total = GETTER
    }




}

