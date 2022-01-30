
public class Account extends AbstractBankAccount{

	// class variables
	private int bonusValue;
	private AccountType type;
	

	    //overloaded constructor for Account
	    Account(String name, int num,int amt, AccountType type)
	    {
	    	super(name,num,(amt+calculateInitialBonusValue(amt)));
	    	bonusValue = calculateInitialBonusValue(amt);
	    	this.type = type;
	    }


	    
		
		private static int calculateInitialBonusValue(int amt) {
			if(amt>= 1 && amt <= 100) {
				return 10;
			}
			else if(amt <= 300)
				return 20;
			else
				return 30;
		}//end method
		
		//print method
		/*public void print() {
			System.out.println("Bank Name\t:"+ getBankName() 
					+"\nAccount Holder\t:"+ accountName
					+ "\nAccount Number\t: " + accountNum
					+ "\nAccount Balance\t: " + balance);
		}
*/


	    public void deposit(int amt)
	    {
	    	if(amt>100)
	    		balance = balance + (amt + (int)(bonusValue * 0.1));
	    	else
	    		balance = balance + amt;
	    	
	    	
	    }//end method




		@Override
		public void withdraw(int amt) {
			// TODO Auto-generated method stub
			
		}
		
		public void print() {
			
			System.out.println("\nBank Name\t: "+getBankName() + 
					"\nAccount Holder\t: "+ accountName
					+"\nAccount Number\t: "+accountNum + 
					"\nAccount Balance\t: "+balance);
			
		}//end print

		@Override
		public String toString() {
			return "\nAccount Type	: " + this.type + super.toString();
		}//end method toString



	}
