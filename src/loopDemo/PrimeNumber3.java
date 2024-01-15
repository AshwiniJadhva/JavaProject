package loopDemo;

public class PrimeNumber3 {
	
	void validateNumIsPrime(int targetNum) {
		int count = 1;
		for(int num = 2; num <= targetNum/2;num++) {
			if(targetNum%num == 0) {
				count = 0;
				System.out.println("number is not prime");
				break;
			}
		}
		if(count == 1 )
			System.out.println("number is prime");
	}
	
	void checkNumisprime(int targetNum) {
		boolean numIsPrime = true ;
		for(int num  = 2 ; num<= targetNum/2 ; num++) {
			if(targetNum%num==0) { 
 				numIsPrime = false;
				System.out.println(targetNum+" Number is not prime");
			}
		}
		if(numIsPrime)
			System.out.println(targetNum+" number is prime");
		
	}
	
	public static void main(String[] args) {
		PrimeNumber3 primeNumber3 = new PrimeNumber3();
		primeNumber3.validateNumIsPrime(9);
		primeNumber3.checkNumisprime(17);
	}

}

