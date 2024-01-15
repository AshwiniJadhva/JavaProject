package loopDemo;

public class PrimeNumber2 {
	
	void validateNumIsPrime(int targetNum) {
		int num = 2;
		for(; num <= targetNum/2 ;num++) {
			if(targetNum%num == 0) {
				System.out.println(targetNum+" number is not prime");
				break;
			}
		}
		if(targetNum/2+1 == num )
			System.out.println(targetNum+ " number is prime");
	}
	 
	public static void main(String[] args) {
		PrimeNumber2 primeNumber2 = new PrimeNumber2();
		primeNumber2.validateNumIsPrime(17);
		primeNumber2.validateNumIsPrime(9);
	}

}

