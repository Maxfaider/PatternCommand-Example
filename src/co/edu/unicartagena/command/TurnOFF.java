
package co.edu.unicartagena.command;

/**
 *
 * @author Alan M.E
 * @see 31/03/2017
 */
public class TurnOFF implements Command {

    private Lights receptor;

    public TurnOFF(Lights receptor) {
        this.receptor = receptor;
    }
    
    @Override
    public void excute() {
        this.receptor.apagar();
    }
    
}
