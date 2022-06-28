package startprogam;

final class Constructor {
	
	public Constructor()
	{
		this(500);
		System.out.println("zero argument constructor");
	}
	public Constructor(int i)
	{
		int j=20;
		int k=i+j;
		System.out.println("one argument   "  +k);
	}
	
	
	public static void main(String[] args) {
		 
		Constructor  s= new Constructor();
		Constructor s1= new Constructor();

		System.out.println("default constructor");
		Constructor2 v =new Constructor2();
				
		
	}

}
