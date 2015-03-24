package videoclub;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
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
        Iterator<Peliculas> itrPeliD = fPeliculas.iterator();
        Iterator<Peliculas> itrPeliG = fPeliculas.iterator();
        Iterator<Peliculas> itrPeliAn = fPeliculas.iterator();

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
                        obj_alq.alquilar(pelis.getTitulo(), fPeliculas);
                    } else {
                        obj_Ini.inicio(fPeliculas);
                    }
                }
            }
        } else if (opcion == 1) {
            String director = JOptionPane.showInputDialog("Introduzca el DIRECTOR de la pelicula");
            while (itrPeli.hasNext()) {
                Peliculas pelis = itrPeli.next();
                if (director.equalsIgnoreCase(pelis.getDirector())) {

                    System.out.println(pelis.toString());

                }
            }

            String titulo = JOptionPane.showInputDialog("Introduzca el TITULO de la pelicula");
            while (itrPeliD.hasNext()) {
                Peliculas pelisD = itrPeliD.next();
                if (titulo.equalsIgnoreCase(pelisD.getTitulo())) {
                    int seleccion = JOptionPane.showOptionDialog(null, pelisD.toString(),
                            "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, new Object[]{"Alquilar Pelicula",
                                "Volver",},
                            "Sair do programa");

                    if (seleccion == 0) {
                        obj_alq.alquilar(pelisD.getTitulo(), fPeliculas);
                    } else {
                        obj_Ini.inicio(fPeliculas);
                    }
                }
            }

        } else if (opcion == 2) {
            String genero = JOptionPane.showInputDialog("Introduzca el GENERO de la pelicula");
            while (itrPeli.hasNext()) {
                Peliculas pelis = itrPeli.next();
                if (genero.equalsIgnoreCase(pelis.getGenero())) {

                    System.out.println(pelis.toString());
                }
            }

            String titulo = JOptionPane.showInputDialog("Introduzca el TITULO de la pelicula");
            while (itrPeliG.hasNext()) {
                Peliculas pelisG = itrPeliG.next();
                if (titulo.equalsIgnoreCase(pelisG.getTitulo())) {
                    int seleccion2 = JOptionPane.showOptionDialog(null, pelisG.toString(),
                            "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, new Object[]{"Alquilar Pelicula",
                                "Volver",},
                            "Sair do programa");

                    if (seleccion2 == 0) {
                        obj_alq.alquilar(pelisG.getTitulo(), fPeliculas);
                    } else {
                        obj_Ini.inicio(fPeliculas);
                    }
                }
            }

        } else if (opcion == 3) {
            String año = JOptionPane.showInputDialog("Introduzca el AÑO de la pelicula");
            while (itrPeli.hasNext()) {
                Peliculas pelis = itrPeli.next();
                if (año.equalsIgnoreCase(pelis.getAño())) {

                    System.out.println(pelis.toString());
                }
            }

            String titulo = JOptionPane.showInputDialog("Introduzca el TITULO de la pelicula");
            while (itrPeliAn.hasNext()) {
                Peliculas pelisAn = itrPeliAn.next();
                if (titulo.equalsIgnoreCase(pelisAn.getTitulo())) {
                    int seleccion2 = JOptionPane.showOptionDialog(null, pelisAn.toString(),
                            "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, new Object[]{"Alquilar Pelicula",
                                "Volver",},
                            "Sair do programa");

                    if (seleccion2 == 0) {
                        obj_alq.alquilar(pelisAn.getTitulo(), fPeliculas);
                    } else {
                        obj_Ini.inicio(fPeliculas);
                    }
                }
            }

        }
    }
}
