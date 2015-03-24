package videoclub;

import javax.swing.JOptionPane;

/**
 *
 * @author aquinoacordero
 */
public class Menu {
    
       public int Menu() {
        int opcion = JOptionPane.showOptionDialog(null, "Selecciona una opción",
                "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new Object[]{"Buscar pelicula", "Devolver pelicula", "Salir del Videoclub"},
                "Sair do programa");
        return opcion;
            
    }
    
}
