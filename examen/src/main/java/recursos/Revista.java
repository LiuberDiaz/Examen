package recursos;

import interfaces.Prestable;

/**
 * @author paz
 */

public class Revista extends RecursoBibliografico implements Prestable {
    private int numero;

    public Revista(String titulo, int anoPublicacion, boolean disponibilidadPrestamo, int numero) {
        super(titulo, anoPublicacion, disponibilidadPrestamo);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * implementa el metodo prestar
     */

    @Override
    public void prestar() {
        // porque en el examen no lo hice

    }

    /**
     * implementa el metodo devolver
     */

    @Override
    public void devolver() {
        // porque en el examen no lo hice

    }

    /**
     * implementa el metodo mostrar informacion
     */

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de recursos.Revista:" + getNumero());
    }
}
