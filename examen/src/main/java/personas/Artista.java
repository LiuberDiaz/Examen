package personas;

/**
 * @author paz
 */

public class Artista extends Persona {
    /**
     * constructor de artista
     *
     * @param nombre
     * @param dni
     * @param telefono
     * @param direccion
     */
    public Artista(String nombre, String dni, String telefono, String direccion) {
        super(nombre, dni, telefono, direccion);
    }

    public Artista(String nombre) {
        super(nombre);
    }
}
