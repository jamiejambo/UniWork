
public class CreditAccount extends AbstractBankAccount{

	private int creditLimit;
	
	//default constructor for CreditAccount
	CreditAccount(String name, int num, int amt)
    {
    	super(name, num, amt);
    	this.creditLimit= calculateCreditLimit(amt);
    }
	//overloaded constructor for CreditAccount
	CreditAccount(String name, int num,int amt,int credit)
    {
            super(name,num,amt);
            this.creditLimit=credit;
            
    }

	@Override
	public void deposit(int amt) {
		// TODO Auto-generated method stub
		balance = balance + amt;
		
	}
	@Override
	public void withdraw(int amt) {
		// TODO Auto-generated method stub
		
	}
	
	private static int calculateCreditLimit(int amt) {
		if( amt>1 && amt <= 2000)
			return 100;
		else if (amt <= 4000)
			return 200;
		else
			return 300;
		
	}//end method
	
	public String toString() {
		return super.toString()+"\nCredit Limit\t:"+creditLimit;
	}
	
	public void print() {
		
		System.out.println("\nBank Name\t: "+getBankName() + 
				"\nAccount Holder\t: "+ accountName
				+"\nAccount Number\t: "+accountNum + 
				"\nAccount Balance\t: "+balance +
				"\nCredit Limit\t: "+ creditLimit);
		
	}//end print

}
