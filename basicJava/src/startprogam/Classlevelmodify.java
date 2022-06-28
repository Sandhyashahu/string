package startprogam;


public class Classlevelmodify {
   public	int s=10; //public  variable accesiable  to all the  packages 
   
   int t=20; //default variable acccesiable to within packages
   private int  p=60; //private variable defined in same class as defined in class
   
   protected int d=20;
   
   
    int e=10;
     public static void m()
     {
    	 System.out.println("class level ");
     }
      void m6()
     {
    	 System.out.println("class level 1 ");
     }
      static void m2()
     {
    	 System.out.println("class level 2 ");
     }
     public void m3()
     {
    	 System.out.println("class level 3 ");
     }
     public static void main(String[] args) {
    	 Classlevelmodify T=new Classlevelmodify();
		T.m();
		T.m2();
		T.m3();
		T.m6();
    	 
	}
   
}
