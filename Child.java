package Practice;

public class parent {
	     void Parent(int a, int b)
	     {
	         System.out.println(" the super class constructor");
	          int z = a + b;
	         System.out.println("the super class method ");
	         System.out.println("the sum is "+z);
	     }
	 }
	public class Child extends parent
	{
	    Child(int x)
	    {
	        super();
	        System.out.println("the sub class constructor ");
	        System.out.println(x);
	    }
	    public static void main(String ... a)
	     {
	        Child obj = new Child(10);
	     }

}
