package kiosco;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main2 {

    public static void main (String[]args) {

        ArrayList<Articulo> listaArticulos = new ArrayList<>();
        Venta venta;
        Empleado jose = new Empleado("jose", "baez", "23789098");
        listaArticulos.add(new Articulo("galletitas", 45, 567.9, "pepas"));
        listaArticulos.add(new Articulo("yerba", 34, 1040.0, "payadito"));
        listaArticulos.add(new Articulo("azucar", 23, 660.8, "ledesma"));


    }

}
