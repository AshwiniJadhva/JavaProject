package practice;

public class InstanceVariable {
	
	static int staticVar = 10;
    int instanceVar = 20;

    public static void main(String[] args) {
       
    	InstanceVariable obj = new InstanceVariable();

        obj.staticVar++;
        obj.instanceVar++;

        InstanceVariable obj2 = new InstanceVariable();

        System.out.println(obj.staticVar + ", " + obj.instanceVar + ", " + obj2.staticVar + ", " + obj2.instanceVar);
    }

}
