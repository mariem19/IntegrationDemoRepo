package edu.esprit.integration.demo.tests;

import edu.esprit.integration.demo.services.CalculatorService;

public class CalculatorTest {

	public static void main(String[] args) {
	
		CalculatorService service = new CalculatorService(); 
		service.setValue1(2);
		service.setValue2(2);
		service.setOperand('+');
	
		
		service.calculate();


	}

}
