package string;


public class Stringrevers {
	public static void main(String[] args) {
		
		String orgString = "mam";//for int i=
		String revString = "";

		for (int i =orgString.length() - 1; i>= 0; i--) {
			revString = revString + orgString.charAt(i);//0=0+j
		}
		
		if (orgString.equals(revString))
		{
			System.out.println("String paildrom"+revString);	 
			 
		}
		else {
			
			System.out.println("String  not paildrom"+revString);	 

		}
//		System.out.println("original string is " + org);
//		System.out.println("reverse string is  " + rev);

		String S5="sandhya";
		char IndexNo=S5.charAt(1);
		System.out.println(IndexNo);
		
		String s5="aaa";
		String s6="HCD";
		String sum= s5+s6;
		System.out.println(sum);
		
		
		String s9="shahu ";
		//String s10=s9+ss;
		
	   String s10=s9.concat("Sandhya");
              
		System.out.println(s10);
		
		
		

		
		 String sp1="shahu";
		 String rev= " ";
		 for(int j=sp1.length()-1;j>=0;j--)
		 {
			 rev=rev+sp1.charAt(j);
		 }
			System.out.println(rev);

		 
}	
}	

