package arrayReturnType;

//return all +ve no from given array. return 1st 3 +ve no. from given array.return all name having length>5.
public class Example2 {
	
	int outputIndexstr = 0;
	int outPutIndexint = 0;
	int[] getAllPositiveNumbers(int[] num) {
		int[] output = new int[num.length];
		for(int index=0;index<output.length;index++) {
			if(num[index] > 0) {
				output[outPutIndexint] = num[index];
				outPutIndexint++;
					
			}
		}
		return output;
	}
	
	int[] getFirstThreePositiveNumbers(int[] num) {
		int[] output = new int[num.length];
		for(int index=0;index<output.length;index++) {
			if(num[index] > 0) {
				output[outPutIndexint] = num[index];
				outPutIndexint++;
				if(outPutIndexint==3)
					break;
			}
		}
		return output;
	}
	
	String[] getNames(String[] name) {
		String[] output = new String[name.length];
		//int outputIndex = 0;
		for(int index=0;index<name.length;index++) {
			if(name[index].length() > 5) {
				output[outputIndexstr] = name[index];
				outputIndexstr++;		
			}
		}
		return output; 
	}
	
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		
		int arr[] = {1,2,21,-3,-23,4,5,8,-6};
		
		String[] str = {"ashu", "ajinkya", "agstya", "balkrishna"};
		String[] outputstr = example2.getNames(str);
		for(int index = 0; index<example2.outputIndexstr;index++) {
			System.out.println(outputstr[index]);
		}
		
		int outputInt[] = example2.getAllPositiveNumbers(arr);
		for(int index = 0; index<example2.outPutIndexint; index++) {
			System.out.println(outputInt[index]);
		}
	}

}
