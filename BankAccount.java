
public class BankAccount {

	private
	 String ownerName; 
	 float amount;
	 String status;
	 boolean accountType;
	 String city , state;
	 int pinCode;
	 
	 
	 public BankAccount(String ownerName , boolean accountType)
	 {
		 this.ownerName = ownerName;
		 this.accountType = accountType;
	 }
	 
	 public void setAddress(String city , String state , int pinCode)
	 {
		 this.city = city;
		 this.state = state;
		 this.pinCode = pinCode;
	 }
	 
	 public void getAddress()
	 {
		 System.out.println("The Address is : " + city  + " , " + state + " , " + pinCode);
	 }
	 
	 public void deposit(float amount)
	 {
		 
	 }
	 
	 public void withdraw(float amount)
	 {
		 
	 }
	 public void viewDetails()
	 {
		 
	 }

	 public void checkBalance()
	 {
		 
	 }
	

}
