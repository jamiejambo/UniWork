
abstract public class AbstractBankAccount {

	protected String accountName;
    protected int accountNum;
    protected int balance;
	public final String BANK = "Java Bank";
	
	public abstract void deposit(int amt);


	public AbstractBankAccount(String name, int num , int amt) {
		accountName = name; 
		accountNum = num;
		balance = amt;
	}
	
    //make a deposit to the balance


	public String getBankName() {
		// TODO Auto-generated method stub
		return BANK;
	}
	

	
    public int getBalance ( ) 
    {
      	 
    	return balance;
    }
    
	  //accessor to get the accountnumber
    public int getAccountNum ( ) 
    {
   	 
    	return accountNum;
    }
  
	  //accessor to get the accountname
    public String getAccountName ( ) {
    	 
    	return accountName;
    }
    
	  //modifier to set the balance
    public void setBalance(int num)
    {
    	    balance = num;
    }
    
	  //modifier to set the accountnumber
    public void setAccountNum(int num)
    {
    	    accountNum = num;
    }
	
    //modifier to set the accountname
    public void setAccountName(String name)
    {
    	    accountName = name;
    }

    //make a withdrawal from the balance
    public void withdraw(int amt)
    {
    	    balance=balance-amt;
    }

    public String toString() {
    	String line = "";
    	
    	line = "\nBank Name\t:"+getBankName()+
				"\nAccount Holder\t:"+accountName+
				"\nAccount Number\t:"+accountNum+
				"\nAccount Balance\t:"+balance;
    	
    	return line;
    }
}//end abstract class

