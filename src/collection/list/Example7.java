package collection.list;

public class Example7 {
	
	static String[] validatStringArray(String[] arr) {
		String[] output = new String[arr.length];
		for(int index = 0 ;index<arr.length; index++) {
			if(arr[index].contains("i"))
				output[index] = arr[index];
		}
		return output;
		
	}
	public static void main(String[] args) {
		String[] arr = {"Aashvi","Techno","maulik"};
		String [] output = Example7.validatStringArray(arr);
		for(int index = 0; index<output.length;index++) {
			if(output[index]!=null)
				System.out.println(output[index]);
		}
	}

}
