package ifElseSwitchCase;

public class IfelseDemo {

	public static void main(String[] args) {
		
		int num1 = 25;
	    int num2 = 78;
	    int num3 = 87;
	    
	    if(num1>num2 & num1>num3)
	    { 
	    	System.out.println("First number is the greatest one " +num1 );
	    }
	    
	    else if(num2>num3 & num2>num1)
	    {
	    	System.out.println("Second number is greatest " +num2);
	    }
	    
	    else
	    {
	    	System.out.println("Third number is greatest " +num3);
	    }
	    	
	}

}
