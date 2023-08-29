package kiosco;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public Venta vender(ArrayList<Articulo>listaArticulos){
         return  new Venta(listaArticulos,LocalDateTime.now(),this);


    } public void imprimirTicket() throws IOException {
    FileWriter escritor = new FileWriter("./"+ LocalDateTime.now().getYear()+"-"+LocalDateTime.now().getMonthValue()+"-"
            +LocalDateTime.now().getDayOfMonth()+"-"+LocalDateTime.now().getHour()+"-"+LocalDateTime.now().getMinute()+"-"+LocalDateTime.now().getSecond()
            +"-"+".ticket",false);


    escritor.write(out);
    escritor.close();

}




}



