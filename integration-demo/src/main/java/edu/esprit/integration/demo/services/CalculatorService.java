package edu.esprit.integration.demo.services;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.esprit.integration.demo.managed.beans.CalculatorManagedBean;

@ManagedBean
@SessionScoped

public class CalculatorService  implements Serializable,CalculatorManagedBean{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static char[] operands = { '+', '-', '*', '/' };
	 int value1;
	    int value2;
	    char operand;
	     String result;
	     
	  
	    	 
	    	 public char[] getOperands() {
	    		          return operands;
	    		          
	    		   }
	    	 public char getOperand() {
	    		          return operand;
	    		          }
	    	 
	    	 public void setOperand(char operand) {
	    		        System.out.printf("setOperand: %s", operand);
	    		        this.operand = operand;
	    		     }
	    		  
	    		      public String getResult() {
	    		          return result;
	    		      }
	    		 
	    		     public void setResult(String result) {
	    		         this.result = result;
	    		      }
	    		  
	    		     public int getValue1() {
	    		          return value1;
	    		     }
	    		  
	    		      public void setValue1(int value1) {
	    		          System.out.printf("setValue1: %s\n", value1);
	    		          this.value1 = value1;
	    		      }
	    		  
	    		      public int getValue2() {
	    		          return value2;
	    		      }
	    		  
	    		      public void setValue2(int value2) {
	    		          System.out.printf("setValue2: %s\n", value2);
	    		          this.value2 = value2;
	    		      }
	    		  
	    		      public void calculate() {
	    		          switch(getOperand()) {
	    		              case '+' :
	    		                  result = String.valueOf(value1 + value2);
	    		                  break;
	    		              case '-' :
	    		                  result = String.valueOf(value1 - value2);
	    		                  break;
	    		              case '*' :
	    		                  result = String.valueOf(value1 * value2);
	    		                  break;
	    		              case '/' :
	    		                  double v1 = value1;
	    		                  double v2 = value2;
	    		                  result = String.valueOf(v1 / v2);
	    		                  break;
	    		          }
	    		          System.out.printf("Calculate: %s %s %s = %s\n",
	    		                  getValue1(),
	    		                  getOperand(),
	    		                  getValue2(),
	    		                  getResult());
	    		  
	    		      }
	    		  
	    		      @PostConstruct
	    		      public void postConstruct() {
	    		          System.out.println("postConstruct");
	    		          operand = '+';
	    		          value1 = 0;
	    		          value2 = 0;
	    		          result = "n/a";
	    		      }
	    	     }



