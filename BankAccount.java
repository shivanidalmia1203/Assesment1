
public class BankAccount {

	private
	 String ownerName; 
	 float amount;
	 String status;
	 int accountType;
	 String city , state;
	 int pinCode;
	 
	 
	 public BankAccount(String ownerName , int accountType)
	 {
		 amount = 0;
		 this.ownerName = ownerName;
		 this.accountType = accountType;
	 }
	 
	 public void setAddress(String city , String state , int pinCode)
	 {
		 this.city = city;
		 this.state = state;
		 this.pinCode = pinCode;
	 }
	 
	 public void deposit(float amount)
	 {
		 this.amount += amount; 
	 }
	 
	 public void withdraw(float amount)
	 {
		 if (this.amount >= amount)
		 {
			 this.amount -= amount;
		 }
		 else
		 {
			 System.out.println("Insufficient Balance \n");
		 }
	 }
	 public void viewDetails()
	 {
		 System.out.println("Name : " + ownerName);
		 System.out.println("Address : " + city + " , " + state + " , " + pinCode);
		 if (accountType == 0)
			 System.out.println("Account Type : SAVINGS");
		 else
			 System.out.println("Account Type : CURRENT");
		 
		 System.out.println("\n");
	 }

	 public void checkBalance()
	 {
		 System.out.println("Available Balance : " + amount + "\n");
	 }
	

}
