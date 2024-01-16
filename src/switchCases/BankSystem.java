package switchCases;

/*Assignment 9 : 2nd April 2021

Create a Banking System which has the following functionality.

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
Hint : Create 3 non static instance variable.
Output :
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output :
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time*/

public class BankSystem {
	
	int balance = 10000;
	int debitCount;
	int creditCount;
	int printBal;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintBal;
	
	
	void getTransactionDetails(int amt, String operation) {
		
		switch(operation) {
		case "debit":
			if(balance>amt) {
				balance = balance - amt;
				debitCount++;
				totalDebitCount++;
			}
			else System.out.println("insuficient Money");
			break;
			
		case "credit":
			balance = balance + amt;
			creditCount++;
			totalCreditCount++;
			break;
			
		case "printBal":
			printBal++;
			totalPrintBal++;
			break;
			
			default:
				System.out.println("Inavlid Oparation");
		}
		
		
	}
	
	void individualTransactionSummary() {
		System.out.print("debit - "+debitCount +" times, ");
		System.out.print("credit -  "+creditCount+" Times, ");
		System.out.println("print bal -  "+printBal+" Times, ");
		
	}
	
	void allTransactionSummary() {
		System.out.print("All Tranction summer : ");
		System.out.print("credit - "+totalCreditCount+" Times, ");
		System.out.print(" debit - "+totalDebitCount+" Times, " );
		System.out.print(" print balance - "+totalPrintBal+" Times. ");
	}
	
	public static void main(String[] args) {
		
		System.out.println("user1 transaction summary :");
		BankSystem bankSystem1 = new BankSystem();
		bankSystem1.getTransactionDetails(1200, "debit");
		bankSystem1.getTransactionDetails(1000, "credit");
		bankSystem1.getTransactionDetails(1000, "credit");
		bankSystem1.getTransactionDetails(0, "printBal");
		bankSystem1.individualTransactionSummary();
		
		System.out.println("user2 transaction summary :");
		BankSystem bankSystem2 =  new BankSystem();
		bankSystem2.getTransactionDetails(100, "credit");
		bankSystem2.getTransactionDetails(200, "credit");
		bankSystem2.getTransactionDetails(300, "credit");
		bankSystem2.getTransactionDetails(400, "credit");
		bankSystem2.getTransactionDetails(500, "credit");
		bankSystem2.getTransactionDetails(500, "debit");
		bankSystem2.getTransactionDetails(500, "debit");
		bankSystem2.individualTransactionSummary();
		
		bankSystem1.allTransactionSummary();
	}

}
