package loopDemo;
/*
 * 4) sum of all the prime numbers given range.
   input : 2 to 100
   output : 
5) Average of all the prime numbers given range.
   input : 2 to 100
   output
   
 */
public class PrimeNumCount {
	void printprime(int startRange,int endRange) {
		int sum = 0;
		int count = 0;
		
		int j = 0;
		for(int index = startRange; index< endRange; index++) {
			for(j = 2; j<endRange;j++) {
				if(index%j==0)
					break;
			}
			if(index==j) {
				count++;
				sum = sum+index;
				System.out.println("prime no. "+index);
			}
		}
		System.out.println("count is "+count);
		System.out.println("sum is :"+sum);
		System.out.println(" avg is :"+(sum/count));
		
	}

	public static void main(String[] args) {
		new PrimeNumCount().printprime(2, 20);
	}
}
