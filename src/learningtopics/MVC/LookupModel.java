package learningtopics.MVC;

import java.util.HashMap;


public class LookupModel {
    
    private String name;
    private int number;
    HashMap<String, Integer> phoneList = new HashMap<>();
    
    phoneList.put("Jordan", 8383829244);
    
    phoneList.put("Jordan", "8698673568");
    phoneList.put("Rocio", "3153453452");
    phoneList.put("Jonas", "1522269912");
	
	public void findNumber(String name){
		
            this.number = phoneList.get(name);
		
	}
	
	public int getNumber(){
		
		return number;
		
	}
    
    
}
