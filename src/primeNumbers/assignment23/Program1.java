package primeNumbers.assignment23;
/*
2) print all the prime numbers given range.
input : upto 100
output : */

public class Program1 {
	
	void validatePrimeNumber(int range) {
		
		for(int number = 2; number<=range; number++) {
			boolean flag = true;
			for(int num = 2 ; num<=number; num++) {
				if(number%num==0) {
					flag = false ;
				//System.out.println(number+" is not prime");
					break;
				}
			}
			if(flag==true)
				System.out.println(range+" is prime");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Program1 program1 = new Program1();
		//program1.validateAllPrimeNum(100);
		program1.validatePrimeNumber(100);
	}

}
