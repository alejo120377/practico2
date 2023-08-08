public class Persona {



   /* caracteisticas y comportamientos
    aributos y metodo.

    estatura
    color de piel
    edad
            peso
            genero
            id
            nombre
            apellido

            caminar
            respirar
            comer
            trabajar
            estudiar
            dormir
            hablar


    */
    private String colorpiel;
    private double estatura;
    private int edad;
    private double peso;
    private String genero;
    private String ID;
    private String nombre;
    private String apellido;
    private int energia;


 public double getPeso() {
  return peso;
 }

 public void setPeso(double peso) {
  this.peso = peso;
 }

 public String getID() {
  return ID;
 }

 public void setID(String ID) {
  this.ID = ID;
 }

 public int getEnergia() {
  return energia;
 }

 public void setEnergia(int energia) {
  this.energia = energia;
 }

 public void setEstatura(double estaturaEntrada){
  estatura= estaturaEntrada;
 }

 public double getEstatura() {
  return estatura;


 }


    public void setEdad(int edadEntrada){
  edad = edadEntrada;
 }

 public int getEdad() {
  return edad;
 }



 public void setGenero(String generoEntrada){
  genero = generoEntrada;
 }

 public String getGenero() {
  return genero;
 }






 public void setColorpiel(String colorpielEntrada){
  colorpiel= colorpielEntrada;
 }

 public String getColorpiel() {
  return colorpiel;
 }




    public void setApellido(String apellidoEntrada){
  apellido = apellidoEntrada;
 }

 public String getApellido() {
  return apellido;
 }




public void setNombre(String nombreEntrada){
  nombre = nombreEntrada;
 }

 public String getNombre() {
  return nombre;

 }

 @Override
 public String toString() {
  return "Persona{" +
          "colorpiel='" + colorpiel + '\'' +
          ", estatura=" + estatura +
          ", edad=" + edad +
          ", peso=" + peso +
          ", genero='" + genero + '\'' +
          ", ID='" + ID + '\'' +
          ", nombre='" + nombre + '\'' +
          ", apellido='" + apellido + '\'' +
          ", energia=" + energia +
          '}';
 }
}
