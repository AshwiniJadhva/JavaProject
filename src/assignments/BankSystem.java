package assignments;

public class BankSystem {
	int currentBalance = 50000;
	int debitCount, creditCount, printBalance;
	static int totaldebitcount, totalcreditcount, totalprintbal;
	
	void debit_Amount(int debitAmt) {
		if(debitAmt>0) {
			if(currentBalance>debitAmt) {
				currentBalance = currentBalance - debitAmt;
				debitCount++;
				totaldebitcount++;
			}
		}else System.out.println("Invalid Input");
		 
	}
	
	void credit_Amount(int creditAmt) {
		if(creditAmt>0) {
			currentBalance = currentBalance + creditAmt;
			creditCount++;
			totalcreditcount++;
		}else System.out.println("Invalid Input");
		
	}
	
	void printBalance(boolean printbalance) {
		System.out.println("printing balance - "+printbalance);
		if(printbalance) {
			printBalance++;
			totalprintbal++;
		}else {
			System.out.println(" Not requried ");
		}
		System.out.println("current balance is: "+currentBalance);
	}
	
	void individualTransactionSummary(boolean user1, boolean user2) {
		if(user1) {
			System.out.println("user1 transaction summery : "+"debit count is - "+ debitCount+" times, "+"credit count is - "+creditCount+" times, "+"printBalance - "+printBalance+" times");
		}
		else if(user2) {
			System.out.println("user2 transaction summery : "+"debit count is - "+ debitCount+" times, "+"credit count is - "+creditCount+" times, "+"printBalance - "+printBalance+" times");
			
		}
	}
	
	void allTransactionSummary() {
		System.out.println("TOTAL TRANSACTION : "+" debit count - "+totaldebitcount+" time, credit count - "+totalcreditcount+" times, printBalance - "+totalprintbal+" times");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankSystem bankingSystem_1 = new BankSystem();
		bankingSystem_1.debit_Amount(10000);
		bankingSystem_1.credit_Amount(5000);
		bankingSystem_1.credit_Amount(4300);
		bankingSystem_1.printBalance(true);
		bankingSystem_1.printBalance(false);
		bankingSystem_1.individualTransactionSummary(false, false);
		
		BankSystem bankingSystem_2 =  new BankSystem();
		bankingSystem_2.debit_Amount(4000);
		bankingSystem_2.credit_Amount(5000);
		bankingSystem_2.debit_Amount(6000);
		bankingSystem_2.credit_Amount(3000);
		bankingSystem_2.printBalance(true);
		bankingSystem_2.individualTransactionSummary(false, true);
		
		bankingSystem_1.allTransactionSummary();
		
		
	}

}
