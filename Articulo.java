package kiosco;

public class Articulo {

private String nombre ;
private String prveedor;
private Double precio;

    public Articulo(String nombre, String prveedor, Double precio) {
        this.nombre = nombre;
        this.prveedor = prveedor;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrveedor() {
        return prveedor;
    }

    public void setPrveedor(String prveedor) {
        this.prveedor = prveedor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
