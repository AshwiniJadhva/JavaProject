package primeNumbers.assignment23;

public class PrimeNumber2 {
	

	int count = 0;
	
	void validateNumberIsPrime(int range1, int range2) {
		//int[] allPrimeNum = new int[range];
		
		for(int targetNum = range1; targetNum <= range2; targetNum++) {
			
			boolean isPrimeflag = true;
			for(int num=2;num<=targetNum/2;num++) {
				if(targetNum % num == 0) {
					isPrimeflag = false;
					break;
				}
			}
			if(isPrimeflag == true) {
				System.out.println("Given number " + targetNum + " is prime");
				
				//allPrimeNum[count] = targetNum;
				count++;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		PrimeNumber2 primeNumber = new PrimeNumber2();
		primeNumber.validateNumberIsPrime(40,100);
		
	}

}
