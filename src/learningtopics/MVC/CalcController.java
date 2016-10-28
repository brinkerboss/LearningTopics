package learningtopics.MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalcController {
    
    
    
	private CalcView calcView;
	private CalcModel calcModel;
	
	public CalcController(CalcView calcView, CalcModel calcModel) {
		this.calcView = calcView;
		this.calcModel = calcModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		
		this.calcView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
			
				firstNumber = calcView.getFirstNumber();
				secondNumber = calcView.getSecondNumber();
				
				calcModel.addTwoNumbers(firstNumber, secondNumber);
				
				calcView.setCalcSolution(calcModel.getCalculationValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				calcView.displayErrorMessage("Integers Only!");
				
			}
			
		}
		
	}
}
