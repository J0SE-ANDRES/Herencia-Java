package model;

/**
 *
 * @author Jose Torres
 */
public class AnimalModel {

    protected String nombre;
    protected String raza;
    protected int edad;

    public AnimalModel() {
    }

    public AnimalModel(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "\nraza: " + raza + "\nedad: " + edad;
    }

}
