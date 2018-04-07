
package co.edu.unicartagena.command;

/**
 *
 * @author Alan M.E
 * @see 31/03/2017
 */

public class TurnON implements Command {
    
    private Lights receptor;

    public TurnON(Lights receptor) {
        this.receptor = receptor;
    }

    @Override
    public void excute() {
        this.receptor.encender();
    }
    
}
