package videoclub;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author aquinoacordero
 */
public class BuscarPelicula {

    public void buscarPelicula(ArrayList fPeliculas) {
        Alquilar obj_alq = new Alquilar();
        Inicio obj_Ini = new Inicio();

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
                            null, new Object[]{"Alquilar Pelicula",
                                "Volver",},
                            "Sair do programa");

                    if (seleccion == 0) {
                        obj_alq.alquilar(/*pelis.getTitulo()*/);
                    } else {
                        obj_Ini.inicio(fPeliculas);
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
                        obj_Ini.inicio(fPeliculas);
                    }
                }
            }
        } else if (opcion == 2) {
            String titulo = JOptionPane.showInputDialog("Introduzca el GENERO de la pelicula");
            while (itrPeli.hasNext()) {
                Peliculas pelis = itrPeli.next();
                if (titulo.equalsIgnoreCase(pelis.getGenero())) {
                    int seleccion = JOptionPane.showOptionDialog(null, pelis.toString(),
                            "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, new Object[]{"Alquilar",
                                "Volver",},
                            "Sair do programa");

                    if (seleccion == 0) {
                        obj_alq.alquilar();
                    } else {
                        obj_Ini.inicio(fPeliculas);
                    }
                }
            }
        } else if (opcion == 3) {
            String titulo = JOptionPane.showInputDialog("Introduzca el AÑO de la pelicula");
            while (itrPeli.hasNext()) {
                Peliculas pelis = itrPeli.next();
                if (titulo.equalsIgnoreCase(pelis.getAño())) {
                    int seleccion = JOptionPane.showOptionDialog(null, pelis.toString(),
                            "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, new Object[]{"Alquilar",
                                "Volver",},
                            "Sair do programa");

                    if (seleccion == 0) {
                        obj_alq.alquilar();
                    } else {
                        obj_Ini.inicio(fPeliculas);
                    }
                }
            }
        }
    }
}