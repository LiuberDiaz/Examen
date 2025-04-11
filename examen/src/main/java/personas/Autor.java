package personas;

/**
 * @author paz
 */
public class Autor extends Persona {
    /**
     * constructor de autor
     *
     * @param nombre
     * @param dni
     * @param telefono
     * @param direccion
     */
    public Autor(String nombre, String dni, String telefono, String direccion) {
        super(nombre, dni, telefono, direccion);
    }

    public Autor(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "personas.Persona{" +
                "nombre='" + getNombre() + '\'' +
                '}';
    }
}
