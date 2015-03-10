package videoclub;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Aitor
 */
public class ListadoPeliculas {

    public void ListadoPeliculas() {
        ArrayList<Peliculas> fPeliculas = new ArrayList<Peliculas>();
        File fichero = new File("Lista.txt");
        Scanner scan = null;
        Peliculas listaPeliculas = new Peliculas();

        try {
            scan = new Scanner(fichero);
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                String[] dividirLista = linea.split(", ");

                listaPeliculas.setTitulo(dividirLista[0]);
                listaPeliculas.setDirector(dividirLista[1]);
                listaPeliculas.setGenero(dividirLista[2]);
                listaPeliculas.setAño(dividirLista[3]);
                //listaPeliculas.setCantidad(Integer.parseInt(dividirLista[4]));
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

        //public void mostrarPeliculas() {
        Iterator<Peliculas> itrPeliculas = fPeliculas.iterator();
        while (itrPeliculas.hasNext()) {
            Peliculas partido = itrPeliculas.next();
            System.out.println(listaPeliculas.getTitulo()+" "
                    + listaPeliculas.getDirector() + "-"
                    + listaPeliculas.getGenero() + " "
                    + listaPeliculas.getAño());
        }
    
}
}
