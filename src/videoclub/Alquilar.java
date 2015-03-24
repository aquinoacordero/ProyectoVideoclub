package videoclub;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author aquinoacordero
 */
public class Alquilar {
    
    public void alquilar(String titulo,ArrayList fPeliculas){
        Inicio obj_ini=new Inicio();
        Iterator<Peliculas> itrPeliA = fPeliculas.iterator();
        while(itrPeliA.hasNext()){
            Peliculas busca=itrPeliA.next();
            if(titulo.equalsIgnoreCase(busca.getTitulo())){
                if(busca.getCantidad()>0){
                    JOptionPane.showMessageDialog(null, "La retirada de la pelicula se ha realizado correctamnete");
                    busca.setCantidad(busca.getCantidad()-1);
                }else{
                    JOptionPane.showMessageDialog(null, "Error en la recogida");
                }
            }
        }
        obj_ini.inicio(fPeliculas);
        
    }
}
