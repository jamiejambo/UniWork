
public class testBank {
	
	public static void main(String[] args) {
     
	// Instantiate 3 accounts
		// Using constructor with values
    Account a1 = new Account("Sanjay Gupta",11556,300, AccountType.SAVINGS);
    	// Using default constructor
    Account a2 = new Account("He Xai",22338,500, AccountType.SAVINGS);
    
    Account a3 = new Account ("Ilya Mustafana", 44559, 1000, AccountType.SAVINGS);
    
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    
    System.exit(0);
	}//end main

}//end class
