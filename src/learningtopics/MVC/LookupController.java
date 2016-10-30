package learningtopics.MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LookupController {
    
    
    
	private LookupView lookupView;
	private LookupModel lookupModel;
	
	public LookupController(LookupView lookupView, LookupModel lookupModel) {
		this.lookupView = lookupView;
		this.lookupModel = lookupModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		
		this.lookupView.addLookupListener(new LookupListener());
	}
	
	class LookupListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String name;
			
			
			
			try{
			
				name = lookupView.getName();
				
				
				lookupModel.findNumber(name);
				
				lookupView.setNumber(lookupModel.getNumber());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				lookupView.displayErrorMessage("Please enter a name only!");
				
			}
			
		}
		
	}
}
