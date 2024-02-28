package codingPractice;

public class SumOfSeries {
	
	void sum(int n) {
		int sum = 0;
		for(int index = 1;index<=n;index++){
            sum = n*(n+1)/2;
        }
		
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		new SumOfSeries().sum(4407895);
	}

}
