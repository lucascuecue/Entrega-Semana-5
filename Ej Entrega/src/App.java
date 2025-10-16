import com.coti.tools.Esdia;
import modelo.Director;
import modelo.Pelicula;
import modelo.Videoteca;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion;
        ImpresionMenu();
        opcion = Esdia.readInt("Seleccione una opción (1-5): ");
      
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
