
package co.edu.unicartagena.command;

/**
 *
 * @author Alan M.E
 * @see 31/03/2017
 */

public class ShortLights extends Lights {

    public ShortLights() {
        
    }
    
    @Override
    public void encender() {
        System.out.println("**********Niebla detectada*************");
        System.out.println("    Luces de onda Corta: Activadas     ");
        System.out.println("***************************************");
    }

    @Override
    public void apagar() {
        System.out.println("   Luces de onda Corta: Desactivadas   ");
    }
    
}
