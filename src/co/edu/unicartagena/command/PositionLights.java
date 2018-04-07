
package co.edu.unicartagena.command;

/**
 *
 * @author Alan M.E
 * @see 31/03/2017
 */

public class PositionLights extends Lights {

    public PositionLights() {
        
    }

    @Override
    public void encender() {
        System.out.println("*********Oscuridad detectada***********");
        System.out.println("     Luces de Posición: Activadas      ");
        System.out.println("***************************************");
    }

    @Override
    public void apagar() {
        System.out.println("     Luces de Posición: Desactivadas      ");
    }
    
}
