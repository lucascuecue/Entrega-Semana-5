package modelo;

public class Videoteca {
    //Atributos
    private Pelicula[] coleccion;

    //Métodos
    public Videoteca (Pelicula[] coleccion){
        this.coleccion = coleccion;
    }

    //Setters
    public void setColeccion(Pelicula[] coleccion) {
        this.coleccion = coleccion;
    }
    //Getters
    public Pelicula[] getColeccion() {
        return coleccion;
    }
}
