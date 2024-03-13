package codingPractice;

public class Revser {
	
	void reverse(String str) {
		String rev = "";
		for(int index = 0; index<str.length(); index++) {
			rev = str.charAt(index)+rev;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		new Revser().reverse("Techno");
	}

}
