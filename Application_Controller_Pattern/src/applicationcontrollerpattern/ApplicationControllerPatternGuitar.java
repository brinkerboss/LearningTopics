package applicationcontrollerpattern;

import java.util.HashMap;


public class ApplicationControllerPatternGuitar {

    public static HashMap<String,GuitarHandler> hashMapGuitarInfo = new HashMap<String, GuitarHandler>(); 
    

    public static void handleCommand(String name) {
      
        hashMapGuitarInfo.put("fender", new Fender());
        hashMapGuitarInfo.put("gibson", new Gibson());
        hashMapGuitarInfo.put("prs", new PRS());
        hashMapGuitarInfo.put("rickenbacker", new Rickenbacker());
        
        GuitarHandler handler = hashMapGuitarInfo.get(name);
        
        handler.execute();
        
    }
    
}
