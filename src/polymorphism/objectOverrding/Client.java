package polymorphism.objectOverrding;

public class Client extends Employee{
	 
	public static void main(String[] args)  {
		Client c = new Client();
		c.setData("Ajadhav", "IT", "jadhav", 0213);
		
		
		c.setEmpName("ashwini");
		c.setDeptName("IT");
		c.setEmpManager("savita raskar");
		c.setEmpId(66567);
		String output = c.toString();
		System.out.println(output);
		 
		 
		System.out.println(c);
	}

}
