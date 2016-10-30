package learningtopics.MVC;

import java.awt.event.ActionListener;
import javax.swing.*;

public class LookupView extends JFrame {
    
    private JTextField name  = new JTextField(10);
	private JButton getNumberButton = new JButton("Get Number");
	private JTextField phoneNumber = new JTextField(10);
	
	LookupView(){
		
		
		
		JPanel LookupPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		LookupPanel.add(name);
		LookupPanel.add(getNumberButton);
		LookupPanel.add(phoneNumber);
		
		this.add(LookupPanel);
		
		
		
	}
	
	public String getName(){
		
		return name.getText();
		
	}
	
	

	
	
	// Open a popup that contains the error message passed
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}

    void addLookupListener(LookupController.LookupListener lookupListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNumber(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
