package controller;

import model.GatoModel;

/**
 *
 * @author Jose Torres
 */
public class GatoController extends AnimalController {

    private GatoModel gato_model;

    public void registrarGato(String nombre, String raza, int edad, String uso_caja_arena) {
        gato_model = new GatoModel(nombre, raza, edad, uso_caja_arena);
    }

    public GatoModel mostrarGato() {
        return gato_model;
    }

    @Override
    public String jugar() {
        return "Jugando desde la clase Gato";
    }

    @Override
    public String comer() {
        return "Comiendo desde la clase Gato";
    }

    @Override
    public String dormir() {
        return "Durmiendo desde la clase Gato";
    }

}
