package learningtopics;

import java.util.HashMap;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import org.quickconnectfamily.json.JSONInputStream;


public class LearningTopics {

    
    public static void main(String[] args) {
        
    }
    
    String Guitars = "";
    Map<String, Object> guitarData = new HashMap<>();
    ArrayList<GuitarBean> stringBeans = new ArrayList<GuitarBean>();
    private HashMap<String, Object> data;

    public LearningTopics() {
    }
    
     public void runHttp() {
	

	try {
	    // Set the URL object to point to the JSON file
	    URL url = new URL("http://jordanbrinkerhoff.net/guitars.php?Guitars="+this.Guitars);
            
              // Connect to the site using HttpURLConnecton
	    HttpURLConnection connect = (HttpURLConnection) url.openConnection();

	    // Setup input stream using JSONInputStream to easily retrieve data
	    JSONInputStream jsonInput = new JSONInputStream(connect.getInputStream());

	    // Get the JSON object as a HashMap
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
