package assignments;
/*
 * Assignment 9 : 2nd April 2021

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
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time
 */
public class Bank {
	
	int balance = 50000;
	int creditCount;
	int debitCount;
	int printBal;
	
	static int finalCreditCount;
	static int finalDebitCount;
	static int finalPrintBal;
	
	void debitAmt(int amt) {
		balance = balance - amt;
		debitCount++;
		finalDebitCount++;
	}
	
	void creditAmt(int amt) {
		balance = balance + amt;
		creditCount++;
		finalCreditCount++;
	}
	
	void printBal() {
	//	System.out.println("current balance is : "+balance );
		printBal++;
		finalPrintBal++;
		
	}
	
	void individualTransactionSummary() {
		System.out.print("debit - "+debitCount +" times, ");
		System.out.print("credit -  "+creditCount+" Times, ");
		System.out.println("print bal -  "+printBal+" Times, ");
		
	}
	
	void allTransactionSummary() {
		System.out.print("All Tranction summer : ");
		System.out.print("credit - "+finalCreditCount+" Times, ");
		System.out.print(" debit - "+finalDebitCount+" Times, " );
		System.out.print(" print balance - "+finalPrintBal+" Times. ");
	}
	
	public static void main(String[] args) {
		System.out.print("user1 transaction summery : ");
		Bank bank1 =  new Bank();
		bank1.debitAmt(20000);
		bank1.creditAmt(10000);
		bank1.creditAmt(4000);
		bank1.printBal();
		bank1.individualTransactionSummary();
		
		System.out.print("user2 transaction summey : ");
		Bank bank2 =  new Bank();
		bank2.debitAmt(3000);
		bank2.debitAmt(5000);
		bank2.creditAmt(4000);
		bank2.creditAmt(9000);
		bank2.creditAmt(1000);
		bank2.creditAmt(3000);
		bank2.creditAmt(2000);
		bank2.individualTransactionSummary();
		
		bank1.allTransactionSummary();
		
		
	}

}
