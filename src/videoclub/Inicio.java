package videoclub;

import java.util.ArrayList;

/**
 *
 * @author Aitor
 */
public class Inicio {
    
    public void inicio(ArrayList fPeliculas){

    Menu obj_menu = new Menu();
    BuscarPelicula obj_busc = new BuscarPelicula();
    Devolver obj_dev = new Devolver();
    int opt;
    opt  = obj_menu.Menu();
    if (opt == 0) {
            obj_busc.buscarPelicula(fPeliculas);
    }
    else if(opt == 1){
            obj_dev.devovler();
    }

}
}
