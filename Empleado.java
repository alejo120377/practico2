package kiosco;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Empleado {

    private String nombre;
    private String apellido;
    private LocalDateTime horarioDeEntrada;
    private LocalDateTime horarioDeSalida;


    public Empleado(String nombre, String apellido, LocalDateTime horarioDeEntrada, LocalDateTime horarioDeSalida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.horarioDeEntrada = horarioDeEntrada;
        this.horarioDeSalida = horarioDeSalida;
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

    public LocalDateTime getHorarioDeEntrada() {
        return horarioDeEntrada;
    }

    public void setHorarioDeEntrada(LocalDateTime horarioDeEntrada) {
        this.horarioDeEntrada = horarioDeEntrada;
    }

    public LocalDateTime getHorarioDeSalida() {
        return horarioDeSalida;
    }

    public void setHorarioDeSalida(LocalDateTime horarioDeSalida) {
        this.horarioDeSalida = horarioDeSalida;
    }

    public Venta  vender (ArrayList<Articulo>listaArticulos){
        Venta  venta =new Venta();









