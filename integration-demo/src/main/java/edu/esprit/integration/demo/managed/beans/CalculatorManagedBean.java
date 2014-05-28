package edu.esprit.integration.demo.managed.beans;

import javax.ejb.Remote;

@Remote

public interface CalculatorManagedBean {
	 public char getOperand();
	 public char[] getOperands();
	 public void setOperand(char operand);

     public String getResult();
     public int getValue1();
     public void setValue1(int value1);
     public int getValue2();
     public void setValue2(int value2);
     public void calculate();
     public void postConstruct();

}
