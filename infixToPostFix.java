class Solution
{
    //Function to convert an infix expression to a postfix expression.
	public static String infixToPostfix(String exp) 
	{
		Stack<Character> stack = new Stack<>();
		StringBuilder str = new StringBuilder();
		
		int len = exp.length();
		for(int i=0; i<len; i++){
		    char ch = exp.charAt(i);
		    
		    // If the scanned character is an operand, add it to the output
		    
		    if(Character.isLetterOrDigit(ch))
		        str.append(ch);
		   
		   // if the scanned character is '(' then put it into the stack
		   
		     else if(ch == '(')
		        stack.push(ch);
		      
		  // if the scanned character is ')' then put it until it reaches to '('    
		      
		     else if(ch == ')'){
		         while(!stack.isEmpty() && stack.peek() != '(')
		            str.append(stack.pop());
		         
		         stack.pop();
		     } 
		     else{ // when operator is encountered
		         while(!stack.isEmpty() && prec(ch) <= prec(stack.peek()))
		            str.append(stack.pop());
		            
		          stack.push(ch);
		     }
		     
		}
		
		    // pop all the operators from the stack;
		     while(!stack.isEmpty()){
		         if(stack.peek() == '(')
		            return "Invalid Expression";
		          
		         str.append(stack.pop());
		     }
		     
		return str.toString();
		
	} 
	
	private static int prec(char ch){
	    switch(ch){
	        case '+':
	        case '-':
	            return 1;
	       
	        case '*':
	        case '/':
	            return 2;
	       
	        case '^':
	            return 3;
	    }
	    
	    return -1;
	}
	
}
 
