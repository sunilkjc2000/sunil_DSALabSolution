package com.greatleaning.balanceBraces;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

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
			Stack<Character> stack
            = new Stack<Character>();
			
			for(int i = 0; i<inputBraceSeq.length(); i++){
			      char ch = inputBraceSeq.charAt(i);
			      // push open brackets to stack and
			      // compare whether open brackets has occurred if there are
			      // closing brackets
			      if(ch=='{'||ch=='('||ch=='['){
			        stack.push(ch);
			      }else if(stack.isEmpty()){
			    	  ret = false;
			    	  break;
			      }
			      else if(ch=='}'){
			        if(stack.peek()=='{'){
			          stack.pop();
			        }
			        else{ret = false;break;}
			        
			      }else if(ch==']'){
			        if(stack.peek()=='['){
			          stack.pop();
			        }
			        else{ret = false; break;}
			           
			      }else if(ch==')'){
			        if(stack.peek()=='('){
			          stack.pop();
			        }
			        else{ret = false;break;}
			               
			      }
			    }
			    if(!stack.isEmpty()){
			      ret = false;
			    }
			    else
			    	ret = true;
			    
			    return ret;
		}
	}

}
