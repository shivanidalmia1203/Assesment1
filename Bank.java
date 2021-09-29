import java.util.Scanner;	

public class Bank {

	public static void main(String[] args) {
	
		System.out.println("Welcome to Account Creation");
		Scanner scn = new Scanner(System.in);
		String name , city , state ;
		int pinCode;
		int accountType;
		float amount;
		int userChoice;
		
		System.out.println("Enter Your Name : ");
		name = scn.nextLine();
		
		System.out.println(" -------------- Enter Your Address ----------- ");
		System.out.println("Enter City name : ");
		city = scn.nextLine();
		System.out.println("Enter State name : ");
		state = scn.nextLine();
		System.out.println("Enter the Pincode : ");
		pinCode = scn.nextInt();
		
		System.out.println("Enter the Account Type : ");
		System.out.println("0 ---> SAVINGS");
		System.out.println("1 ---> CURRENT");
		accountType = scn.nextInt();
		
		
		BankAccount userBankAccount = new BankAccount(name , accountType);
		userBankAccount.setAddress(city, state, pinCode);
		
		System.out.println("Select an option to continue : ");
		System.out.println(" 1.) Deposit \n 2.) Withdraw \n 3.) View Details \n 4.) View Balance \n 5.) Exit");
		
		System.out.println(" \n Enter Your Choice : ");
		userChoice = scn.nextInt();
		
		while(userChoice != 5)
		{
			switch(userChoice)
			{
				case 1:
					System.out.println("Enter the amount you want to deposit : ");
					amount = scn.nextFloat();
					userBankAccount.deposit(amount);
					break;
				case 2:
					System.out.println("Enter the amount you want to withdraw : ");
					amount = scn.nextFloat();
					userBankAccount.withdraw(amount);
					break;
				case 3:
					userBankAccount.viewDetails();
					break;
				case 4:
					userBankAccount.checkBalance();
					break;
				default :
					System.out.println("Enter from the given choices!!");
					break;
					
			}
			System.out.println(" 1.) Deposit \n 2.) Withdraw \n 3.)View Details \n 4.)View Balance \n 5.) Exit");
			System.out.println(" \n Enter Your Choice : ");
			userChoice = scn.nextInt();
		}
		
		System.out.println(" -------------- You have sucessfully exited ---------------------");
		
		
		
	}

}
