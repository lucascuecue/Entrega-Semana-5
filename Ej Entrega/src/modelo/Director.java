package modelo;

public class Director {
    //Atributos
    private String nombre;
    private String apellidos;
    private boolean oscar;

    //Métodos

    public Director(String nombre, String apellidos, boolean oscar) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.oscar = oscar;
    }

    //Setters

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOscar(boolean oscar) {
        this.oscar = oscar;
    }

    //Getters

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getOscar() {
        return oscar;
    }
}
