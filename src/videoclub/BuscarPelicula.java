package videoclub;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author aquinoacordero
 */
public class BuscarPelicula {

    public void BuscarPelicula(ArrayList fPeliculas) {
        Alquilar obj_alq = new Alquilar();
        Menu obj_menu = new Menu();

        int opcion = JOptionPane.showOptionDialog(null, "Selecciona una opción",
                "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Buscar pelicula por titulo",
                    "Buscar pelicula por director",
                    "Buscar pelicula por genero",
                    "Buscar pelicula por año",
                    "Salir del Videoclub"},
                "Sair do programa");
        Iterator<Peliculas> itrPeli = fPeliculas.iterator();

        if (opcion == 0) {
            String titulo = JOptionPane.showInputDialog("Introduzca el TITULO de la pelicula");
            while (itrPeli.hasNext()) {
                Peliculas pelis = itrPeli.next();
                if (titulo.equalsIgnoreCase(pelis.getTitulo())) {
                    int seleccion = JOptionPane.showOptionDialog(null, pelis.toString(),
                            "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, new Object[]{"Alquilar",
                                "Volver",},
                            "Sair do programa");

                    if (seleccion == 0) {
                        obj_alq.alquilar();
                    } else {
                        obj_menu.Menu();
                    }
                }
            }
        } else if (opcion == 1) {
            String titulo = JOptionPane.showInputDialog("Introduzca el DIRECTOR de la pelicula");
            while (itrPeli.hasNext()) {
                Peliculas pelis = itrPeli.next();
                if (titulo.equalsIgnoreCase(pelis.getDirector())) {
                    int seleccion = JOptionPane.showOptionDialog(null, pelis.toString(),
                            "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, new Object[]{"Alquilar",
                                "Volver",},
                            "Sair do programa");

                    if (seleccion == 0) {
                        obj_alq.alquilar();
                    } else {
                        obj_menu.Menu();
                    }
        }
        }
    }
    }
}
    
