package switchCases;



public class Vowels {
	
	void getVowels(char ch) {
		switch(ch) {
		case 'A':
		case 'a':
			System.out.println(ch+" is vowel");
			break;
			
		case 'E':
		case 'e':
			System.out.println(ch+" is vowel");
			break;
			
		case 'I':
		case 'i':
			System.out.println(ch+" is woel");
			break;
			
		case 'O':
		case 'o':
			System.out.println(ch+" is vowel");
			break;
			
		case 'U':
		case 'u':
			System.out.println(ch+" is vowel");
			break;
			
			default:
				System.out.println("Invalid character");
			
		}
	}
	
	public static void main(String[] args) {
		new Vowels().getVowels('i');
	}

}
