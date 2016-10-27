package learningtopics;

import java.util.HashMap;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import org.quickconnectfamily.json.JSONInputStream;


public class LearningTopics {

    
    public static void main(String[] args) {
        
        LearningTopics learningTopics = new LearningTopics();
        learningTopics.runHttp();
        
    }
    
    String Guitars = "";
    Map<String, Object> guitarData = new HashMap<>();
    ArrayList<GuitarBean> stringBeans = new ArrayList<GuitarBean>();
    private HashMap<String, Object> data;

    public LearningTopics() {
    }
    
     public void runHttp() {
	

	try {
	    // create a URL object that points to the JSON on my website
	    URL url = new URL("http://jordanbrinkerhoff.net/guitars.php?Guitars="+this.Guitars);
            
              // connect using HttpURLConnecton
	    HttpURLConnection connect = (HttpURLConnection) url.openConnection();

	    // setup input stream using JSONInputStream 
	    JSONInputStream jsonInput = new JSONInputStream(connect.getInputStream());

	    // get the JSON object as a HashMap
	    setData((HashMap<String, Object>) jsonInput.readObject());
            
            HashMap<String, String> map = new HashMap<String,String>();
	    for (String key : this.data.keySet()) {
		GuitarBean gbean = new GuitarBean();
		
		map = (HashMap<String, String>) this.data.get(key);
                gbean.setGuitarmake(map.get("make"));
                gbean.setGuitarmodel(map.get("model"));
                
		this.stringBeans.add(gbean);
	    }
            
        } catch (Exception e) {
	    e.printStackTrace();
     }
     }
     
     public void setData(HashMap<String, Object> data) {
        this.guitarData = data;
    }
}
