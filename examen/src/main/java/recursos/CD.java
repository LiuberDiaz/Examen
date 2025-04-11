package recursos;

import interfaces.Prestable;
import personas.Artista;

/**
 * @author paz
 */

public class CD extends RecursoBibliografico implements Prestable {
    private Artista artista;

    public CD(String titulo, int anoPublicacion, boolean disponibilidadPrestamo, Artista artista) {
        super(titulo, anoPublicacion, disponibilidadPrestamo);
        this.artista = artista;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }


    @Override
    /**
     * implementa el metodo prestar
     */
    public void prestar() {
        // porque en el examen no lo hice

    }


    @Override
    /**
     * implementa el metodo prestar
     */
    public void devolver() {
        // porque en el examen no lo hice
    }

    /**
     * metodo mostrar informacion
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("personas.Artista :" + getArtista());
    }
}
