package poo;

public class Uso_Coche {

    public static void main(String[] args) {

        Coche Seat = new Coche();
        Seat.set_color("amarillo");
        System.out.println(Seat.get_color());
        System.out.println(Seat.dime_datos_generales());
        Seat.configura_asientos("no");
        System.out.println(Seat.dime_asientos());
        Seat.configura_climatizador("si");
        System.out.println(Seat.dime_climatizador());
        Seat.dime_peso_coche();
        System.out.println(Seat.peso_total);

    }


}
