package poo;

import javax.swing.*;

public class Uso_Coche {

    public static void main(String[] args) {

        Coche Seat = new Coche();

        Seat.set_color(JOptionPane.showInputDialog("Introduce de que color desea el coche"));
        System.out.println(Seat.get_color());

        System.out.println(Seat.dime_datos_generales());

        Seat.configura_asientos(JOptionPane.showInputDialog("¿Desea asientos de cuero incorporados?"));
        System.out.println(Seat.dime_asientos());

        Seat.configura_climatizador(JOptionPane.showInputDialog("¿Desea climatizador incorporado?"));
        System.out.println(Seat.dime_climatizador());


        System.out.println(Seat.dime_peso_coche());

        System.out.println("El precio final del coche es: " + Seat.precio_coche() + "€.");

    }


}
