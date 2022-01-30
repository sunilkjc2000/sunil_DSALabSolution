package com.greatleaning.balanceBraces;

import java.util.Deque;
import java.util.LinkedList;

public class Balancebraces {
	
	public Balancebraces(String inputBraceSeq) {
		super();
		this.inputBraceSeq = inputBraceSeq;
	}

	private String inputBraceSeq;

	// Routine to check whether input is balanced
	// returns true if input is balanced
	public boolean checkBraceSeq()
	{
		boolean ret = true;
		// Balanced sequence shall have even number of brackets
		if(inputBraceSeq.length()%2 != 0)
		{
            return false;			
		}
		else
		{
			Deque<String> deque
            = new LinkedList<String>();
			
			for (int i = 0; i < inputBraceSeq.length(); i++)
			{
				deque.add(Character.toString(inputBraceSeq.charAt(i)));
			}
			
			//Check whether brackets are balanced by comparing first and last elements
		    while(!deque.isEmpty())
		    {
		    	String check = deque.removeFirst();
		    	if(check.equals("(")){
		    		if(deque.isEmpty() || !deque.removeLast().equals(")")){
		    			// Unbalanced break
		    			ret = false;
		    			break;
		    		}
		    	}
		    	else if(check.equals("{")){
		    		if(deque.isEmpty() || !deque.removeLast().equals("}")){
		    			// Unbalanced break
		    			ret = false;
		    			break;
		    		}
		    	}
		    	else if(check.equals("[")){
		    		if(deque.isEmpty() || !deque.removeLast().equals("]")){
		    			// Unbalanced break
		    			ret = false;
		    			break;
		    		}
		    	}
		    	else {
		    		ret = false;
	    			break;	
		    	}
		    		
		    }
		}
		return ret;
	}

}
