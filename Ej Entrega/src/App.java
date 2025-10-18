import com.coti.tools.Esdia;
import modelo.Director;
import modelo.Pelicula;
import modelo.Videoteca;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion;
        float velocidad = 1.0f;
        Videoteca miVideoteca = null;
      
        do{
            ImpresionMenu();
        opcion = Esdia.readInt("Seleccione una opción (1-5): ");
        switch (opcion) {
            case 1:
            int tamaño = Esdia.readInt("Introduce el tamaño de la nueva videoteca: ");
            miVideoteca = new Videoteca(tamaño);
            System.out.println("");
            System.out.println("Nueva biblioteca de películas creada. Capacidad: " + tamaño + " películas");
            System.out.println("-------------------------------------");
                break;
            case 2:
                velocidad = Esdia.readFloat("Introduce la velocidad de reproducción (1.0 por defecto): ");
                break;
            case 3:
            //Comprobación de que la videoteca está creada y de que no está llena
            if(miVideoteca == null){
                System.out.println("Primero debes crear una videoteca");
                break;
            }
            if(miVideoteca.getNumPelis() == miVideoteca.getTamaño()){
                System.out.println("Videoteca llena");
                break;
            }
            
            //Creación de la peli a añadir
            Director director = new Director(Esdia.readString("Nombre del director: "), Esdia.readString("Apellido del director: "));
            director.TieneOscar();
            String titulo = Esdia.readString("Título de la película: ");
            int year = Esdia.readInt("Año de estreno: ");
            int duracion = Esdia.readInt("Duración en minutos ");
            float valoracion = Esdia.readFloat("Valoración del 0.0 al 10.0: ");
            while(valoracion < 0.0f || valoracion >10.0f){
                System.out.println("Número introducido no válido. Introduce un número entre 0.0 y 10.0");
                valoracion = Esdia.readFloat("Valoración del 0.0 al 10.0: ");
                }
            Pelicula pelicula = new Pelicula(director, titulo, year, duracion, valoracion);
            miVideoteca.añadirPelícula(pelicula);

                break;
            case 4:

                break;
            case 5:
                System.out.println("Saliendo del sistema...\n");
                break;
        
            default:
                System.out.println("El número introducido no es válido. Introduce un entero del 1 al 5");
                break;
            }
        } while(opcion!=5);        
    }

    //Método para la creación del menú y su impresión por pantalla
    public static void ImpresionMenu (){
        System.out.println("|----------------------------------------------|");
        System.out.println("| MI VIDEOTECA                                 |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| 1) Nueva videoteca de películas              |");
        System.out.println("| 2) Configurar velocidad de reproducción      |");
        System.out.println("| 3) Añadir una nueva película a la videoteca  |");
        System.out.println("| 4) Mostrar información actual de películas   |");
        System.out.println("| 5) Salir (se borrará toda la información)    |");
        System.out.println("|----------------------------------------------|");
        System.out.println("");
    } 

    //Método para impresión por pantalla de la videoteca
    public static void ImpresionVideoteca (Videoteca coleccion){
    }
}
