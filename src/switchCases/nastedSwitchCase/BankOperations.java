package switchCases.nastedSwitchCase;

/*Assignment - 15 : 9th April'2021

A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
          a) Person can debit or credit amount from respective bank.
              Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]

          b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]

          c) A Method to show total credit, debit operations 
                 output : Total credit operation - 7 times
                              Total debit operation - 5 times

         d) A Method to show individual bank credit operations.
                output : ICICI bank Credit Operation - 2
                         HDFC bank Credit Operation - 2
		                 SBI bank Credit Operation - 1
                         BOB bank Credit Operation - 4

         e) A Method to show individual bank debit operations.
                output : ICICI bank Debit Operation - 2
                         HDFC bank Debit Operation - 2
		                 SBI*/


public class BankOperations {
	
	int iBalance = 20000;
	int sBalance = 10000;
	int hBalance = 25000;
	int bBalance = 15000;
	int iDebitCount;
	int sDebitCount;
	int hDebitCount;
	int bDebitCount;
	int iCreditCount;
	int sCreditCount;
	int hCreditCount;
	int bCreditCount;
	
	
	static int totalCreditCount;
	static int totalDebitCount;
	
	void operations(String bank,String op, int amt) {
		switch(op) {
		case "debit":
			
			switch(bank) {
			case "ICICI":
				iBalance = iBalance - amt;
				iDebitCount++;
				totalDebitCount++;
				break;
				
			case "SBI":
				iBalance = sBalance - amt;
				sDebitCount++;
				totalDebitCount++;
				break;
				
			case "HDFC":
				iBalance = hBalance - amt;
				hDebitCount++;
				totalDebitCount++;
				break;
				
			case "BOB":
				iBalance = bBalance - amt;
				bDebitCount++;
				totalDebitCount++;
				break;
				default:
					System.out.println("Inavlid Bank");
			}
			break;
		case "credit":
			switch(bank) {
			case "ICICI":
				iBalance = iBalance + amt;
				iCreditCount++;
				totalCreditCount++;
				break;
				
			case "SBI":
				iBalance = sBalance + amt;
				sCreditCount++;
				totalCreditCount++;
				break;
				
			case "HDFC":
				iBalance = hBalance + amt;
				hCreditCount++;
				totalCreditCount++;
				break;
				
			case "BOB":
				iBalance = bBalance + amt;
				bCreditCount++;
				totalCreditCount++;
				break;
				default:
					System.out.println("Inavlid Bank");
			}
			break;
			default:
				System.out.println("Invalid Operation");
		}
		
	}
	
	void allBankTotalBal() {
		int totalBal = iBalance +sBalance +hBalance +bBalance;
		System.out.println("Total Balance is - "+totalBal);
	}
	
	void totalDebitCreditCount() {
		int totalDebitCount = iDebitCount + sDebitCount + hDebitCount+ bDebitCount;
		int totalCreditCount = iCreditCount + sCreditCount + hCreditCount + bCreditCount;
		
		System.out.println("Total Credit operation - "+totalCreditCount+" Times" );
		System.out.println("Total Debit operation - "+totalDebitCount+" Times");
	}
	
	void individualBankCreditOp() {
		System.out.println("ICICI bank Credit Operation - "+iCreditCount);
		System.out.println("SBI bank Credit Operation - "+sCreditCount);
		System.out.println("HDFC bank Credit Operation - "+hCreditCount);
		System.out.println("BOB bank Credit Operation - "+bCreditCount);
		
		System.out.println("ICICI bank Debit Operation - "+iDebitCount);
		System.out.println("SBI bank Debit Operation - "+sDebitCount);
		System.out.println("HDFC bank Debit Operation - "+hDebitCount);
		System.out.println("BOB bank Debit Operation - "+bDebitCount);
		
	}
	
	public static void main(String[] args) {
		BankOperations bankOperations = new BankOperations();
		bankOperations.operations("ICICI", "credit", 1500);
		bankOperations.operations("SBI", "credit", 1000);
		bankOperations.operations("HDFC", "credit", 1200);
		bankOperations.operations("BOB", "credit", 2500);
		
		
		bankOperations.operations("ICICI", "debit", 500);
		bankOperations.operations("SBI", "debit", 100);
		bankOperations.operations("HDFC", "debit", 200);
		bankOperations.operations("BOB", "debit", 250);
		
		bankOperations.allBankTotalBal();
		bankOperations.totalDebitCreditCount();
		bankOperations.individualBankCreditOp();
	}

}
