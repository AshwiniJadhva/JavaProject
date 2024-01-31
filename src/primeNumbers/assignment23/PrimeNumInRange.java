package primeNumbers.assignment23;

/*2) print all the prime numbers given range.
input : 40 to 100
output : */

public class PrimeNumInRange {

	void getAllPrimeNum(int startNum, int endRange) {
		for(int num = startNum; num<=endRange; num++) {
			boolean isPrime = true;
			for(int index = 2; index<=num; index++) {
				if(num%index == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime == true)
				System.out.println(startNum+" is prime");
			//else System.out.println(startNum+" is not prime");
		}
	}
	
	public static void main(String[] args) {
		PrimeNumInRange primeNumInRange = new PrimeNumInRange();
		primeNumInRange.getAllPrimeNum(40, 100);
	}
}
