package primeNumbers;
//check weather the given nu is prime o rnot.
public class Example1 {
	
	void validateNumberIsPrime(int num) {
		boolean flag = true;
		for(int index = 2; index<num; index++) {
			if(num%index==0) {
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println(num+" is  prime");
		else System.out.println(num+" is not prime");
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.validateNumberIsPrime(17);
		example1.validateNumberIsPrime(9);
	}
}
