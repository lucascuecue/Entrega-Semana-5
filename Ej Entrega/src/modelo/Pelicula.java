package modelo;

public class Pelicula {
    //Atributos
    private Director director;
    private String titulo;
    private int year;
    private int duracion;
    private float valoracion;

    //Métodos
    public Pelicula(Director director, String titulo, int year, int duracion, float valoracion){
        this.director = director;
        this.titulo = titulo;
        this.year = year;
        this.duracion = duracion;
        this.valoracion = valoracion;
    }


    //Setters
    public void setDirector(Director director) {
        this.director = director;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //Getters
    public Director getDirector() {
        return director;
    }
    public int getDuracion() {
        return duracion;
    }
    public String getTitulo() {
        return titulo;
    }
    public float getValoracion() {
        return valoracion;
    }
    public int getYear() {
        return year;
    }
}
