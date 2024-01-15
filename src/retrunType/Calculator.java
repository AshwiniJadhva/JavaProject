package retrunType;

/*Assignment-10 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.*/

public class Calculator {
	
	int add(int num1, int num2) {
		return num1+num2;
		 
	}
	
	int subtraction(int num1, int num2) {
		return   num1-num2;
		
	}
	
	double division(int num1 , int num2) {
		return num1/num2;
	}
	
	int multiplication(int num1, int num2) {
		return num1*num2;
	}
	
	void printTotalAnswer(int add, int sub ,double div, int mul) {
		double totalAns = add+sub+div+mul;
		System.out.println(" Total answer  is - "+totalAns);
	}
	
	public static void main(String[] args) {
		Calculator calculator =  new Calculator();
		int add = calculator.add(89, 10);
		int sub = calculator.subtraction(78,45);
		double div = calculator.division(125, 5);
		int mul = calculator.multiplication(7,8);
		calculator.printTotalAnswer(add, sub, div, mul);
	}

}
