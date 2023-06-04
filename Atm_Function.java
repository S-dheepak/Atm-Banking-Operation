import java.util.*;
class Atm_Function 
{
	public static void main(String[] args) 
	{
	 String name="Dheepak S";  // Name of the customer--->Assumed name
	 int pin=1599;             // Pin alloted by the bank to the customer---->Assumption
	 int deposit;
	 int withdraw;
	 int value;
	 String decision;
	 Banking_Operation b=new Banking_Operation();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Welcome,Please insert your atm card");
	 System.out.println("Enter your pin");
	 int secretNumber=sc.nextInt();
	 if(secretNumber==pin)
		{
	    System.out.println("Dear "+name+" Welcome to KKD Banking");
	    System.out.println("Please select your service");
	    System.out.println("Press \n1.Deposit \n2.Withdraw \n3.Display Balance \n4.Exit");
	    int opt=sc.nextInt();
	    if(opt>=1 && opt<=4)
	     {
		 switch(opt)
		  {
			case 1:
				System.out.println("Enter the amount you want to deposit");
				value=sc.nextInt();
			    b.addAmount(value);
				
				System.out.println("Do you want to display the updated balance?");
				System.out.println("Enter \nyes or no");
				decision=sc.next();
				if(decision.equalsIgnoreCase("yes"))
			    {
					b.displayAmount();
					System.out.println("Thank you for banking with us");
				}
				else if(decision.equalsIgnoreCase("no"))
			    {
					System.out.println("Thank you for banking with us");
				}
				break;

			case 2:
				System.out.println("Enter the amount you want to withdraw");
				value=sc.nextInt();
			    b.withdrawAmount(value);

				System.out.println("Do you want to display the updated balance?");
				System.out.println("Enter \nyes or no");
				decision=sc.next();
				if(decision.equalsIgnoreCase("yes"))
			    {
					b.displayAmount();
					System.out.println("Thank you for banking with us");
				}
				else if(decision.equalsIgnoreCase("no"))
			    {
					System.out.println("Thank you for banking with us");
				}
				break;

			case 3:
				b.displayAmount();
			    break;

			case 4:System.out.println("Thank you visit again");
			       break;

		  }
		}
		else
		{
		 System.out.println("There is no such option available");
		}
		}
	 	
		else
		{
			System.out.println("You have entered invalid pin");
		}
	}
}


class Banking_Operation
{
	int balance=10000;    // Default balance---->Assumption
      
    // Banking Operations
	
	public int addAmount(int value)
	{
	 balance=balance+value;
	 System.out.println("Rs "+value+" is successfully credited to your account");
	 return balance;
	}

	public int withdrawAmount(int value)
	{
	        if(value>balance)
			{
				System.out.println("The amount you entered exceeds your current available balance");
				System.exit(0);
			}
			else if(value<balance)
			{
				balance=balance-value;
				System.out.println("Rs "+value+" is debited from your account");
			}
			return balance;
	}

	public void displayAmount()
    {
	 System.out.println("Your current balance is "+balance);
	}
}