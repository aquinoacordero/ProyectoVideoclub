package videoclub;

public class Peliculas {

    private String titulo;
    private String director;
    private String genero;
    private String año;
    private int cantidad;

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, String genero, String año) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.año = año;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pelicula= " + titulo + "\n" +"director=" + director +"\n" + "genero=" + genero + "\n" +"a\u00f1o=" + año;
    }

}
