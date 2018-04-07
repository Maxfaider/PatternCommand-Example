
package co.edu.unicartagena;

import co.edu.unicartagena.command.Command;
import co.edu.unicartagena.command.LightController;
import co.edu.unicartagena.command.Lights;
import co.edu.unicartagena.command.LongLights;
import co.edu.unicartagena.command.PositionLights;
import co.edu.unicartagena.command.ShortLights;
import co.edu.unicartagena.command.TurnOFF;
import co.edu.unicartagena.command.TurnON;

/**
 *
 * @author Alan M.E
 * @see 31/03/2017 
 */
public class PatronCommand {

    private static LightController controller = new LightController();
    private static Lights shortLights;
    private static Lights positionLights;
    private static Lights longLights;
    
    
    public static void main(String[] args) {
        new PatronCommand().configuration();
       
        TurnON encenderCorta = new TurnON(shortLights);
        TurnOFF apagarCorta = new TurnOFF(shortLights);
        
        TurnON encenderLarga = new TurnON(longLights);
        TurnOFF apagarLarga = new TurnOFF(longLights);
        
        TurnON encenderPosition = new TurnON(positionLights);
        TurnOFF apagarPosition = new TurnOFF(positionLights); 
        
        ejecutar(encenderCorta);
        ejecutar(apagarCorta);
        
        //ejecutar(encenderLarga);
        //ejecutar(apagarLarga);
        
        //ejecutar(encenderPosition);
        //ejecutar(apagarPosition);
        
    }
    
    private static void ejecutar(Command command) {
        controller.setCommand(command);
        controller.invoke();
    }
    
    private void configuration() {
        longLights = new LongLights();
        shortLights = new ShortLights();
        positionLights = new PositionLights();
    }
    
}
