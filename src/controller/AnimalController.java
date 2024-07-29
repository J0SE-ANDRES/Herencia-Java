package controller;

import model.AnimalModel;

/**
 *
 * @author Jose Torres
 */
public class AnimalController {

    AnimalModel animal_model;

    public void registrarAnimal(String nombre, String raza, int edad) {
        animal_model = new AnimalModel(nombre, raza, edad);
    }

    public AnimalModel mostrarAnimal() {
        return animal_model;
    }

    protected String jugar() {
        return "Jugando desde la clase Animal";
    }

    protected String dormir() {
        return "Durmiendo desde la clase Animal";
    }

    protected String comer() {
        return "Comiendo desde la clase Animal";
    }

}
