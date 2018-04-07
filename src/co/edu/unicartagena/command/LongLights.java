
package co.edu.unicartagena.command;

/**
 *
 * @author Alan M.E
 * @see 31/03/2017
 */

public class LongLights extends Lights {
    
    public LongLights() {
        
    }

    @Override
    public void encender() {
        System.out.println("*********Oscuridad detectada***********");
        System.out.println("    Luces de onda larga: Activadas     ");
        System.out.println("***************************************");
    }

    @Override
    public void apagar() {
        System.out.println("   Luces de onda larga: Desactivadas   ");
    }
}
