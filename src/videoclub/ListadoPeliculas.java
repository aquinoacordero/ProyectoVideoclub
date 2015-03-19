package videoclub;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aitor
 */
public class ListadoPeliculas {

    ArrayList<Peliculas> fPeliculas = new ArrayList<Peliculas>();

    public void ListadoPeliculas() {

        File fichero = new File("Lista.txt");
        Scanner scan = null;

        try {
            scan = new Scanner(fichero);
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                String[] dividirLista = linea.split(", ");
                Peliculas listaPeliculas = new Peliculas();
                listaPeliculas.setTitulo(dividirLista[0]);
                listaPeliculas.setDirector(dividirLista[1]);
                listaPeliculas.setGenero(dividirLista[2]);
                listaPeliculas.setAño(dividirLista[3]);
                listaPeliculas.setCantidad(Integer.parseInt(dividirLista[4]));
                fPeliculas.add(listaPeliculas);
            }
        } catch (Exception except1) {
            except1.printStackTrace();
        } finally {
            try {
                if (scan != null) {
                    scan.close();
                }
            } catch (Exception except2) {
                except2.printStackTrace();
            }
        }

        /*System.out.println("... Guardados "+fPeliculas.size()+" partidos de fútbol  ...");
         System.out.println("ME cago en mi madre");
         Iterator<Peliculas> itrPeli = fPeliculas.iterator();
         while(itrPeli.hasNext()){
         Peliculas pelis = itrPeli.next();
         System.out.println(pelis.getTitulo() + " "
         + pelis.getDirector() + "-"
         + pelis.getGenero() + " "
         + pelis.getAño());
         }*/
    }

    public int Menu() {
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona una opción",
                "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Buscar pelicula", "Devolver pelicula", "Salir del Videoclub"},
                "Sair do programa");
        return opcion;
    }

    public void BuscarPelicula() {
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona una opción",
                "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Buscar pelicula por titulo",
                    "Buscar pelicula por director",
                    "Buscar pelicula por genero", 
                    "Buscar pelicula por año", 
                    "Salir del Videoclub"},
                "Sair do programa");
        Iterator<Peliculas> itrPeli = fPeliculas.iterator();
         while(itrPeli.hasNext()){
        
        switch(opcion){
            case 0:
                String a=JOptionPane.showInputDialog("Introduzca el titulo de la pelicula");
                 Peliculas pelis = itrPeli.next();
                if (a.equalsIgnoreCase(pelis.getTitulo())){
               int seleccion = JOptionPane.showOptionDialog(null, pelis.toString(),
                "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Alquilar",
                "Volver",},
                "Sair do programa");
               
                    //El if de si el array tiene pelis
               
                    switch (seleccion){
                        case 0: 
                            
                           //Escriba usted 
                           
                int alquilao= JOptionPane.showOptionDialog(null,"Pelicula alquilada",
                "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Volver",
                "Salir",},
                "Sair do programa");
                            switch(alquilao){
                                case 0:
                                    this.Menu();
                                case 1:
                                    System.exit(0);
                            }
                        case 1:
                            this.Menu();
                    }
                } break;
        }

    }

    }
}
