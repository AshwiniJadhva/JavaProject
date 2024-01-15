package loopDemo;
/*
 * 2) print all the prime numbers given range.
   input : 40 to 100
   output : 
 */
public class PrimeNumInRange {
	
	void getPrimeNum(int startRange, int endRange) {
		int j = 0;
		int primeSum = 0;
		int nonPrimeSum = 0;
		for(int index = startRange; index<endRange; index++) {
			for(j = 2; j<endRange;j++) {
				if(index%j==0) {
					break;
				}
			}
			if(index == j) {
				//System.out.println(index+" is prime number");
				primeSum = primeSum+index;	
			}
				
			else {
				System.out.println(index+" is not prime ");
				nonPrimeSum = nonPrimeSum+index;
			}
		}
		System.out.println(" prime number sum is "+primeSum);
		System.out.println(" Not prime number sum is "+nonPrimeSum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrimeNumInRange().getPrimeNum(40, 100);

	}

}
