package recursos;

import interfaces.Prestable;
import personas.Autor;

public class Libro extends RecursoBibliografico implements Prestable {
    private Autor autor;

    public Libro(String titulo, int anoPublicacion, boolean disponibilidadPrestamo, Autor autor) {
        super(titulo, anoPublicacion, disponibilidadPrestamo);
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public void prestar() {
        //porque en el examen no lo hice

    }

    @Override
    public void devolver() {
        // porque en el examen no lo hice
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("personas.Autor :" + getAutor());
    }

}
