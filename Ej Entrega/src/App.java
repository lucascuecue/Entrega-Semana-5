import com.coti.tools.Esdia;
import modelo.Director;
import modelo.Pelicula;
import modelo.Videoteca;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion;
        float velocidad = 1.0f;
        Pelicula[] peliculas = new Pelicula[10];
      
        ImpresionMenu();
        opcion = Esdia.readInt("Seleccione una opción (1-5): ");
        switch (opcion) {
            case 1:
            int size = Esdia.readInt("Introduce el tamaño de la nueva videoteca: ");
            peliculas = new Pelicula[size];
            System.out.println("");
            System.out.println("Nueva biblioteca de películas creada");
            System.out.println("-------------------------------------");
                break;
            case 2:
                velocidad = Esdia.readFloat("Introduce la velocidad de reproducción (1.0 por defecto): ");
                break;
            case 3:
                
                break;
            case 4:

                break;
            case 5:

                break;
        
            default:
                System.out.println("El número introducido no es válido. Introduce un entero del 1 al 5");
                break;
        }
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
}
