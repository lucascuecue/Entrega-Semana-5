package modelo;

public class Videoteca {
    //Atributos
    private Pelicula[] peliculas;
    private int tamaño;
    private int numPelis = 0;

    //Métodos
    public Videoteca (int tamaño){
        peliculas = new Pelicula[tamaño];
        this.tamaño = tamaño;
    }

    public void añadirPelícula (Pelicula pelicula){
        if(numPelis < peliculas.length){
            peliculas[numPelis] = pelicula;
            numPelis++;
        }
    }

    //Setters
    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public void setNumPelis(int numPelis) {
        this.numPelis = numPelis;
    }
    //Getters
    public Pelicula[] getPeliculas() {
        return peliculas;
    }
    public int getTamaño() {
        return tamaño;
    }
    public int getNumPelis() {
        return numPelis;
    }
}
