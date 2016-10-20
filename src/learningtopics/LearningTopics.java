/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtopics;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import org.quickconnectfamily.json.JSONInputStream;



/**
 *
 * @author jbrinkerhoff
 */
public class LearningTopics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    String Guitars = "";
    Map<String, Object> guitarData = new HashMap<>();
    ArrayList<GuitarBean> stringBeans = new ArrayList<GuitarBean>();
    private HashMap<String, Object> data;

    public LearningTopics() {
    }
    
     public void runHttp() {
	// Somewhere in your code this is called in a
	// thread which is not the user interface thread

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
		GuitarBean bean = new GuitarBean();
		
		map = (HashMap<String, String>) this.data.get(key);
                bean.setGuitarmake(map.get("make"));
                
		this.stringBeans.add(bean);
	    }
            
        } catch (Exception e) {
	    e.printStackTrace();
     }
     }
     
     public void setData(HashMap<String, Object> data) {
        this.guitarData = data;
    }
}
