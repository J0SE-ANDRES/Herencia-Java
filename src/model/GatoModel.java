package model;

/**
 *
 * @author Jose Torres
 */
public class GatoModel extends AnimalModel {

    private String uso_caja_arena;

    public GatoModel(String uso_caja_arena) {
        this.uso_caja_arena = uso_caja_arena;
    }

    public GatoModel(String nombre, String raza, int edad, String uso_caja_arena) {
        super(nombre, raza, edad);
        this.uso_caja_arena = uso_caja_arena;
    }

    public String getUso_caja_arena() {
        return uso_caja_arena;
    }

    public void setUso_caja_arena(String uso_caja_arena) {
        this.uso_caja_arena = uso_caja_arena;
    }

    @Override
    public String toString() {
        return "Informacion del Gato\n" + super.toString() + "\nuso de la caja de arena: " + uso_caja_arena;
    }

}
