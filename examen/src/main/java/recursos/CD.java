package recursos;

import interfaces.Prestable;
import personas.Artista;

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
    public void prestar() {
        // porque en el examen no lo hice

    }


    @Override

    public void devolver() {
        // porque en el examen no lo hice
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("personas.Artista :" + getArtista());
    }
}
