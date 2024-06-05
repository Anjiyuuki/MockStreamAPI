// Create a Java class to manage a bank account with functionalities to deposit, withdraw, and check balance.
public class Q10 {

	 private String name;
	    private String accountNumber;
	    private double balance;

	  
	    public Q10(String name, String accountNumber, double initialBalance) {
	        this.name = name;
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: $" + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount");
	        }
	    }
	    
	 // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Invalid");
	        }
	    }

	    // Method to check balance
	    public double checkBalance() {
	        return balance;
	    }

	   
	    public void displayAccountDetails() {
	        System.out.println("Account Holder: " + name);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: $" + balance);
	    }

	    public static void main(String[] args) {
	        Q10 account = new Q10("Angie", "123456789", 500.0);

	        account.displayAccountDetails();
	        account.deposit(200.0);
	        account.withdraw(100.0);
	   
	        System.out.println("Current Balance: $" + account.checkBalance());
	       
	       
	    }

}
