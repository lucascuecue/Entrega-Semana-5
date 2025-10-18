package modelo;
import java.util.Scanner;

public class Director {
    //Atributos
    Scanner scanner = new Scanner(System.in);
    private String nombre;
    private String apellidos;
    private boolean oscar;

    //Métodos

    public Director(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void TieneOscar(){
        boolean check = false;
        do{System.out.print("¿Tiene algún óscar? (S/N): ");
        String resp = scanner.nextLine();
        if(resp.equals("S")){
            oscar = true;
            check = true;
            }
        else if(resp.equals("N")){
            oscar = false;
            check = true;
            }
        else {
            System.out.println("Opción introducida incorrecta. Escoge entre S (Sí) o N (No)");
        }
       }while(!check);
    }

    public String OscarToString (){
        if (oscar == true){
            return "Sí";
        }else{
            return "No";
        }
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
