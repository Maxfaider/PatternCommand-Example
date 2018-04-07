
package co.edu.unicartagena.command;

/**
 *
 * @author Alan M.E
 * @see  31/03/2017
 */
public class LightController {
    
    private Command command;
    
    public LightController() {
        
    }
    
    public void invoke() {
        this.command.excute();
    }
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
}
