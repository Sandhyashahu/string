package startprogam;

public class Nonstaticreturn {
	//method with no argument and no return  type
	public static void methodcalling()
	{
		System.out.println(" method with no return type or no argument");
	}
	
	//method with argument nd  no return type
      public static void methodcalling2(int a,int e)
      {
    	  System.out.println(" two argument method");
    	  int f=a+e;
    	  System.out.println("value of f is"+f);
    	  
      }
    //method with return type no argument 
      public static int methodcalling3()
      {
    	 System.out.println("with return type nd no agrument");
    	 
        int a=50;
        return a;
    	}
      public static int m4(int b,int c)
      {
    	  System.out.println("method with return type or argument");
    	  int s=b+c;
    	  System.out.println("value"+s);
		  return b;
      
      }
      
      public static void main(String[] args) {
       methodcalling();
       methodcalling2(50,50);
     int  z= methodcalling3();
       int y=z+100;
      System.out.println("value of y"+y);
      m4(20,50);
		
    	  
	}
      
      
}
