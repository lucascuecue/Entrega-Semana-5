package modelo;

public class Videoteca {
    //Atributos
    private Pelicula[] peliculas;

    //Métodos
    public Videoteca (Pelicula[] peliculas){
        this.peliculas = peliculas;
    }

    //Setters
    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }
    //Getters
    public Pelicula[] getPeliculas() {
        return peliculas;
    }
}
