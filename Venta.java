package kiosco;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venta {

private ArrayList<Articulo> listaArticulos;
private LocalDateTime FechaVenta;
private LocalDateTime HorarioVenta ;
 private String  Empleado;

 public Venta() {
  this.listaArticulos = listaArticulos;
  FechaVenta = fechaVenta;
  HorarioVenta = horarioVenta;
  Empleado = empleado;
 }

 public ArrayList<Articulo> getListaArticulos() {
  return listaArticulos;
 }

 public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
  this.listaArticulos = listaArticulos;
 }

 public LocalDateTime getFechaVenta() {
  return FechaVenta;
 }

 public void setFechaVenta(LocalDateTime fechaVenta) {
  FechaVenta = fechaVenta;
 }

 public LocalDateTime getHorarioVenta() {
  return HorarioVenta;
 }

 public void setHorarioVenta(LocalDateTime horarioVenta) {
  HorarioVenta = horarioVenta;
 }

 public String getEmpleado() {
  return Empleado;
 }

 public void setEmpleado(String empleado) {
  Empleado = empleado;
 }
}

