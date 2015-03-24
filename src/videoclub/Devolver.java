package videoclub;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author aquinoacordero
 */
public class Devolver {

    public void devovler(ArrayList fPeliculas) {
        Iterator<Peliculas> itrPelidv = fPeliculas.iterator();
        Inicio obj_ini=new Inicio();
        String nombre = JOptionPane.showInputDialog("Introducir la pelicula a devolver: ");
        while (itrPelidv.hasNext()) {
            Peliculas busca = itrPelidv.next();
            if (nombre.equalsIgnoreCase(busca.getTitulo())) {
                if (busca.getCantidad() < 3 && busca.getCantidad() >= 0) {
                    JOptionPane.showMessageDialog(null, "Peliculas devuelta");
                    busca.setCantidad(busca.getCantidad()+1);
                }else{
                    JOptionPane.showMessageDialog(null, "Devolucion nula");
                }
            }
        }
        obj_ini.inicio(fPeliculas);
    }
}
