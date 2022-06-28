package startprogam;

public class NewAss1 {
	public static void m1()
	{
	
		System.out.println("static method calling");
	
	}
	public static void m2(int a,int c )
	{
	System.out.println(" static with argument");
	int b=a+c;
	System.out.println(b);
	}
	
	public void m3()
	{
		
		System.out.println("return type  with argument");
	}
	
	public static void main(String[] args) {
		
		
		m1();
		m2(20,30);
		
		
	}
	
}
