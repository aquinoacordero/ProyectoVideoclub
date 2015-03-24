package videoclub;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Videoclub {

    public static void main(String[] args) {

        ArrayList<Peliculas> fPeliculas = new ArrayList<Peliculas>();

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

        Menu obj_menu = new Menu();
        BuscarPelicula obj_busc = new BuscarPelicula();
        Devolver obj_dev=new Devolver();
        int opt;
        opt = obj_menu.Menu();
        if (opt == 0) {
            obj_busc.BuscarPelicula(fPeliculas);
        }else if(opt==1){
            obj_dev.devovler();
        }
    }

}
