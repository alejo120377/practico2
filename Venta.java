package kiosco;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venta {

 private ArrayList<Articulo> listaArticulos;
 private LocalDateTime fechaHora;

 private Empleado Empleado;

 public Venta(ArrayList<Articulo> listaArticulos, LocalDateTime fechaHora, Empleado empleado) {
  this.listaArticulos = listaArticulos;
  this.fechaHora = fechaHora;
  Empleado = empleado;

 }

 public ArrayList<Articulo> getListaArticulos() {
  return listaArticulos;
 }

 public void setListaArticulos(ArrayList<Articulo> listaArticulos) {
  this.listaArticulos = listaArticulos;
 }

 public LocalDateTime getFechaHora() {
  return fechaHora;
 }

 public void setFechaHora(LocalDateTime fechaHora) {
  this.fechaHora = fechaHora;
 }

 public kiosco.Empleado getEmpleado() {
  return Empleado;
 }

 public void setEmpleado(kiosco.Empleado empleado) {
  Empleado = empleado;
 }
}





