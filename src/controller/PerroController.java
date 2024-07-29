package controller;

import model.PerroModel;

/**
 *
 * @author Jose Torres
 */
public class PerroController extends AnimalController {

    private PerroModel perro_model;

    public void registrarPerro(String nombre, String raza, int edad, String pedigree) {
        perro_model = new PerroModel(nombre, raza, edad, pedigree);
    }

    public PerroModel mostrarPerro() {
        return perro_model;
    }

    @Override
    public String comer() {
        return "Comiendo desde la clase Perro";
    }

    @Override
    public String jugar() {
        return "Jugando desde la clase Perro";
    }

    @Override
    public String dormir() {
        return "Durmiendo desde la clase Perro";
    }

}
