package loopDemo;

public class PrimeNumber4 {
	
	
	
	void checkNumisprime(int targetNum) {
		boolean numIsPrime = true ;
		for(int num  = 2 ; num<= targetNum/2 ; num++) {
			if(targetNum%num==0) {
				numIsPrime = false;
				System.out.println(targetNum+" Number is not prime");
				break;
			} 
		}
		if(numIsPrime)
			System.out.println(targetNum+" number is prime");
		
	}
	
	void checkAllPrimeNum(int targetNum) {
		for(int num = 2;num<=targetNum;num++) {
			checkNumisprime(num);
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber4 primeNumber4 = new PrimeNumber4();
		//primeNumber4.checkNumisprime(17);
		primeNumber4.checkAllPrimeNum(8);
	}

}

