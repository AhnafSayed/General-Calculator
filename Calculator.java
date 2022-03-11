import java.util.Scanner;
import java.io.*;
 
public class Calculator 
{
	
	public int add(int num1, int num2)
	{
	
		int sum;
		sum = num1 + num2;
		
		return sum;
	}
	
	public int sub(int num1, int num2)
	{
	
		int sum;
		sum = num1 - num2;
		
		return sum;
	}
	
	public int multi(int num1, int num2)
	{
	
		int sum;
		sum = num1 * num2;
		
		return sum;
	}
	
	public int div(int num1, int num2)
	    {
	
		int sum = 0;
		if (num2 == 0)
		{
			System.out.println("An error occured: Can't divide by 0!");
			
		}
		else
		{
			sum = num1 / num2;
			
		}
		
		return sum;
	}
	
		public int pow(int base, int exp)
	{
	
		int sum = 1;
		
		if (exp == 0)
		{
			sum = 1;
		}
		
		while (exp > 0)
		{
			sum = sum * base;
			exp--;
			
		}
	
		
		return sum;
		
	}
    
	
	public int mod(int num1, int num2)
	{
	
		int sum;
		sum = num1 % num2;
		
		return sum;
	}
	

    public static void main(String[] args) {
    	
    	int choice;
    	int x;
    	int y;
    	int sum;
    	PrintStream out;
    	
    	Calculator calculator1 = new Calculator();
    
    	
    	try
    	{
    		out = new PrintStream ("Calculator Output.txt");
    		do
    		{
    			System.out.println("General Calculator Project by Ahnaf Sayed (18-36920-1)");
    			System.out.println("------------------------------------------------------\n");
    			System.out.println("1.  Add(+)");
    			System.out.println("2.  Subtract(-)");
    			System.out.println("3.  Multiplication(*)");
    			System.out.println("4.  Division(/)");
    			System.out.println("5.  Power(^)");
    			System.out.println("6.  Modulus(%)");
    			System.out.println("7.  End Application\n");
    			System.out.println("Enter Operation: ");
    		
    			Scanner input = new Scanner(System.in);
    			choice = input.nextInt();
    		
    			while ((choice < 1 || choice > 6) && choice != 7)
    			{
    				System.out.println("Please enter operation 1, 2, 3, 4, 5 or 6: " );
    				choice = input.nextInt();
					
    			}
    			if(choice != 7)
				{
    			System.out.println("Please enter the first number: ");
    			x = input.nextInt();
				System.out.println("Please enter the second number or the power/base of first number: ");
    			y = input.nextInt();
    	
    				switch (choice)
    				{
    					case 1: 
    						sum = calculator1.add(x,y);
    						System.out.printf("The addition result is %d\n\n",sum);
    						out.println(x + "+" + y + "=" + sum);
    						break;
    			
    					case 2:
    						sum = calculator1.sub(x,y);
    						System.out.printf("The subtraction result is %d\n\n",sum);
    						out.println(x + "-" + y + "=" + sum);
    						break;
    			
    					case 3:
    						sum = calculator1.multi(x,y);
    						System.out.printf("The multiplication result is %d\n\n",sum);
    						out.println(x + "*" + y + "=" + sum);
    						break;
    			
    					case 4:
    						sum = calculator1.div(x,y);
    						System.out.printf("The division result is %d\n\n",sum);
    						out.println(x + "/" + y + "=" + sum);
    						break;
							
						case 5:
    					    sum = calculator1.pow(x,y);
    					    System.out.printf("The power result is %d\n\n",sum);
    					    out.println(x + "^" + y + "=" + sum);
    					    break;
    			
    					case 6:
    						sum = calculator1.mod(x,y);
    						System.out.printf("The modulus result is %d\n\n",sum);
    						out.println(x + "%" + y + "=" + sum);
    						break;
					}
				}
    		}
    		
    		while (choice != 7);
    		System.out.println("Calculator output log: ");
    	
    	}
    	
    	catch(Exception ex)
    	{
    		System.out.println("An error occured!");
    	}
        { 
        try
        {
	    File myObj = new File("Calculator Output.txt"); 
	    Scanner myReader = new Scanner (myObj); 
	    while (myReader.hasNextLine()) 
		{ 
	    String data = myReader.nextLine(); 
	    System.out.println(data);
	    }
        myReader.close();
        } 
        catch (FileNotFoundException ex) 
        {
        System.out.println("An error occurred!");
        ex.printStackTrace();
        }
       }
      }
   }