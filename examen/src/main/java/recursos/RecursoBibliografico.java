package recursos;

/**
 * @author paz
 */

public class RecursoBibliografico {
    private String titulo;
    private int anoPublicacion;
    private boolean disponibilidadPrestamo;

    public RecursoBibliografico(String titulo, int anoPublicacion, boolean disponibilidadPrestamo) {
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
        this.disponibilidadPrestamo = disponibilidadPrestamo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public boolean isDisponibilidadPrestamo() {
        return disponibilidadPrestamo;
    }

    public void setDisponibilidadPrestamo(boolean disponibilidadPrestamo) {
        this.disponibilidadPrestamo = disponibilidadPrestamo;
    }

    /**
     * Implementa el metodo mostrar informacion
     */

    public void mostrarInformacion() {
        System.out.println("Titulo :" + getTitulo());
        System.out.println("Año publicación :" + getAnoPublicacion());
        System.out.println("Disponibilidad :" + isDisponibilidadPrestamo());
    }
}
