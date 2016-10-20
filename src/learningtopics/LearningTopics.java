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

    public LearningTopics() {
    }
    
     public void runHttp() {
	// Somewhere in your code this is called in a
	// thread which is not the user interface thread

	try {
	    // Set the URL object to point to the JSON file
	    URL url = new URL("http://cwcraigo.com/stockfeed.php?Guitars="+this.Guitars);
            
        } catch (Exception e) {
	    e.printStackTrace();
     }
     }
}
