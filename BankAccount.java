import java.text.SimpleDateFormat;
import java.util.Date;

public class BankAccount {

	private String ownerName;
	float amount;
	String status;
	int accountType;
	String city, state;
	int pinCode;

	public BankAccount(String ownerName, int accountType) {
		amount = 0;
		this.ownerName = ownerName;
		this.accountType = accountType;
		this.status = "ACTIVE";
	}

	public void setAddress(String city, String state, int pinCode) {
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public void deposit(float amount) {
		this.amount += amount;
	}

	public void withdraw(float amount) {
		if (this.amount >= amount) {
			this.amount -= amount;
		} else {
			System.out.println("Insufficient Balance \n");
		}
	}

	public void viewDetails() {
		
		System.out.println("\n");
		System.out.println("Name : " + ownerName);
		System.out.println("Address : " + city + " , " + state + " , " + pinCode);
		if (accountType == 0)
			System.out.println("Account Type : SAVINGS");
		else
			System.out.println("Account Type : CURRENT");

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		System.out.print("Date Of Creaation : ");
		System.out.println(formatter.format(date));
		
		System.out.println("Account Status : " + status);

		System.out.println("\n");
	}

	public void checkBalance() {
		System.out.println("Available Balance : " + amount + "\n");
	}

}
