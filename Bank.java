import java.util.Scanner;	

public class Bank {

	public static void main(String[] args) {
	
		System.out.println("Welcome to Account Creation");
		Scanner scn = new Scanner(System.in);
		String name , city , state ;
		int pinCode;
		boolean accountType;
		float amount;
		int userChoice;
		
		System.out.println("Enter Your Name : ");
		name = scn.next();
		
		System.out.println("Enter Your Address : ");
		System.out.println("Enter City name : ");
		city = scn.next();
		System.out.println("Enter State name : ");
		state = scn.next();
		System.out.println("Enter the Pincode : ");
		pinCode = scn.nextInt();
		
		System.out.println("Enter the Account Type : ");
		System.out.println("0 ---> SAVINGS");
		System.out.println("1 ---> CURRENT");
		accountType = scn.nextBoolean();
		
		
		BankAccount userBankAccount = new BankAccount(name , accountType);
		userBankAccount.setAddress(city, state, pinCode);
		
		System.out.println("Select an option to continue : ");
		System.out.println(" 1.) Deposit \n 2.) Withdraw \n 3.)View Details \n 4.)View Balance \n 5.) Exit");
		
		userChoice = scn.nextInt();
		
		while(userChoice != 5)
		{
			System.out.println(" 1.) Deposit \n 2.) Withdraw \n 3.)View Details \n 4.)View Balance \n 5.) Exit");
			switch(userChoice)
			{
				case 1:
					System.out.println("Enter the amount you wan to deposit : ");
					amount = scn.nextFloat();
					userBankAccount.deposit(amount);
				case 2:
					System.out.println("Enter the amount you wan to withdraw : ");
					amount = scn.nextFloat();
					userBankAccount.withdraw(amount);
				case 3:
					
				case 4:
					
				default :
					System.out.println("Enter from the given choices!!");
					
			}
			userChoice = scn.nextInt();
		}
		
		System.out.println("You have sucessfully exited");
		
		
		
	}

}
