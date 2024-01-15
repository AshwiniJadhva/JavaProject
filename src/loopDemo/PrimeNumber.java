package loopDemo;

public class PrimeNumber {
	
	void validateNumIsPrime(int targetNum) {
		int num = 2;
		for(; num < targetNum ;num++) {
			if(targetNum%num == 0) {
				System.out.println("number is not prime");
				break;
			}
		}
		if(targetNum == num )
			System.out.println("number is prime");
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.validateNumIsPrime(9);
	}

}

