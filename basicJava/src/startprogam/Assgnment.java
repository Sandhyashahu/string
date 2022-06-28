
package startprogam;

public class Assgnment {
	

	  String Name="sandhya";
	  static String CogllName="pdpc";
	  static String city="pune";
	  
       public void m1()
       {
      int math=60;
	   int sci=70;
	   int histy=80;
	   int eng=60;
       float Sum=math+sci+histy+eng;
      float per=Sum/4;
       }
	
	
	public static void main(String[] args) {
		
		Assgnment S1 = new Assgnment();
		S1.Name="sandhya";
		
		System.out.println("per");
		System.out.println(S1.Name);
		System.out.println("school Name" +CogllName);
		System.out.println("city name" +city);

	       int math=80;
		   int sci=90;
		   int histy=70;
		   
		 int eng=70;
      float Sum=math+sci+histy+eng;
      float per1=Sum/4;
		Assgnment S2 = new Assgnment();
		S2.Name="piu";
		System.out.println(per1);

		System.out.println(S2.Name);
		System.out.println("school Name" +CogllName);
		System.out.println("city name" +city);
        
		
		
		
		
	

		




}
}
