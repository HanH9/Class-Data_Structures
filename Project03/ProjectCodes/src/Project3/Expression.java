package Project3;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * The Expression class that can get a infix, convert infix to postfix and calculate postfix
 * @author H9
 * @version 1.0
 */
public class Expression {
    // Infix expression
    String infix;

    
    /**
     * A default constructor.
     */
    public Expression()
    {
    	this.infix = null;
    }
    
    /**
     * Overloading constructor witn a string to infix
     */
    public Expression(String str)

    {
    	this.infix = str;
    }


    /**
     * Get the infix
     * @return infix
     */
    public String getInfix() {
		return infix;
	}
    
    /**
     * Sets the infix
     * @param infix
     */

	public void setInfix(String infix) {
		this.infix = infix;
	}

    /**
     * Gets the priority of operator
     * @param string A reference to an operator
     * @return the priority of the operator
     */
    public int Priority(String string)
    {
        if(string.equals("*")||string.equals("/"))
        {
            return 1;
        }
        if (string.equals("+")||string.equals("-"))
        {
            return 0;
        }
        else return -1;
    }
    
    /**
     * Converts an infix to a postfix
     * @param infix A infix
     * @return A list stored postfix
     */
    public ArrayList<String> toPostfix()
    {
        // A list to store postfix
        ArrayList<String>list = new ArrayList<>();
        // A stack to store tokens
        GenericStack<String>tokenStack = new GenericStack<>();
        
    	// Split the infix by one of " +-*/()"
        StringTokenizer stringTokenizer = new StringTokenizer(this.infix," +-*/()",true);
        // Use the infix to postfix algorithm discussed in the class
        while (stringTokenizer.hasMoreTokens())
        {
        	// Add operands into list
            String item = stringTokenizer.nextToken();
            if(item.matches("\\d+"))
            {
                list.add(item);
            }
            // Escape the space
            else if (item.equals(" "))
        	{
        		continue;
			}
            // Use converting algorithm to deal with operand
            else if(item.equals("+") ||item.equals("*") ||item.equals("-") ||item.equals("/")
                    ||item.equals("(") ||item.equals(")"))
            {
                if (tokenStack.isEmpty())
                {
                    tokenStack.push(item);
                }
                else if (item.equals("("))
                {
                    tokenStack.push(item);
                }
                else if (item.equals(")"))
                {
                    while (!(tokenStack.peek().equals("(")))
                    {
                        list.add(tokenStack.pop());
                    }
                    tokenStack.pop();
                }
                else if (Priority(item) > Priority(tokenStack.peek()))
                {
                    tokenStack.push(item);
                }
                else if (Priority(item) <= Priority(tokenStack.peek()))
                {
                    while (!tokenStack.isEmpty() && Priority(item) <= Priority(tokenStack.peek()))
                    {
                        list.add(tokenStack.pop());
                    }
                    tokenStack.push(item);
                }
            }
        }
        while (!tokenStack.isEmpty())
        {
            list.add(tokenStack.pop());
        }
        return list;
    }
    
    /**
     * Calculates the value of expression
     * @param infix A infix
     * @return The value of expression
     */
    public int getValue()
    {
        // A list to store postfix
        ArrayList<String>postfix = new ArrayList<>();
        // To store the value of expression
    	int value = 0;
    	// A stack to store num that help to calculate postfix
        GenericStack<Integer> numStack = new GenericStack<>();
        
        // Convert a infix to postfix
        postfix = this.toPostfix();
        
        // Calculate the postfix
        for (String string : postfix)
        {
            if (string.matches("\\d+")) {
                numStack.push(Integer.valueOf(string));
            } else {
                int num1 = numStack.pop();
                int num2 = numStack.pop();
                switch (string) {
                    case "+":
                        value = num1 + num2;
                        break;
                    case "-":
                        value = num2 - num1;
                        break;
                    case "*":
                        value = num1 * num2;
                        break;
                    default:
                        value = num2 / num1;
                        break;
                }
                numStack.push(value);
            }
        }
        return value;
    }
    
    @Override
    // prints infix, postfix and the value
    public String toString()
    {
    	// Print postfix as a string
    	StringBuilder postString = new StringBuilder();
        ArrayList<String>postfix = this.toPostfix();
        for(int i = 0;i<= postfix.size()-1;i++)
        {
        	postString.append(postfix.get(i));
        }
        
    	return "Infix:"+this.getInfix() + "   " + "Postfix:" + postString.toString()
    			+ "   " + "Value:" + this.getValue();
    }
    
    @Override
    // Completes judgment according to the value of expression
    public boolean equals(Object o) {
    	if (this.getClass() != o.getClass()) 
    		return false;
    	Expression expression = (Expression)o;
        return this.getValue() == expression.getValue();
    }
}
