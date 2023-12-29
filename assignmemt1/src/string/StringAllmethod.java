package string;

import java.lang.invoke.StringConcatFactory;

public class StringAllmethod {
	
	public static void main(String[] args) {
		
		String S1="sandhya";

		
		
		String S2="sandhya";
		boolean isidentical=S1.equals(S2);
		System.out.println(isidentical);
		
		
		String S3="sandhya";
		String S4="Sandhya";
		boolean issame=S4.equalsIgnoreCase(S3);
		System.out.println(issame);
		
		String S5="sandhya is jadhav";
          char IndexNo=S5.charAt(0);
		System.out.println(IndexNo);
		
		
		String S6="sandhya";
        int length=S6.length();
		System.out.println(length);
		
		String S7="sandhya";
        String substring=S7.substring(2,6);
        String subString2=S7.toUpperCase();
        String  sum;
        sum=substring+subString2;
        
		System.out.println(sum);
		
		String S8="sandhya";
        String replce=S8.replace("an","dd");
		System.out.println(replce);
		System.out.println("*********************************");
		
		String S9="sandhya";
        boolean ispresent =S9.contains("d");
		System.out.println(ispresent);
		
		String ss1="sandhya"	;	
		String ss2=""	;	
	System.out.println(ss2.isEmpty());
		
	
		String S10="  velocity";
        String space =S10.trim();
		System.out.println(space);
 		

		String S11="  velo    city   ";
       String replce1 =S11.replace(" ", "");
		System.out.println(replce1);
		
		
		
		String S12=  "velocity is class";
	       int indexvalue=S12.indexOf('i');
			System.out.println(indexvalue);
			
			

			String S13=  "Velocity";
		       String case1=S13.toUpperCase();
				System.out.println(case1);
				
				
				String case2=S13.toLowerCase();
				System.out.println(case2);
				
				String S14=  "Velocity";
			       boolean START=S14.startsWith("Vel");
					System.out.println(START);
			
					String S15=  "Velocity";
				       boolean END=S15.endsWith("city");
						System.out.println(END);
			
                System.out.println("byyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");	
						
						
				//	string to invalue
                
                 String S18= "sandhyS";
                // int s12 =Integer.parseInt(S18);
               // int s13=s12+2;
                System.out.println(S18 );
						
				
               
                String  S19 = "false";
                boolean s15=Boolean.parseBoolean(S19);
               System.out.println(s15);
               
              
               String  S20 = "56.56";
               //double s16=Double.parseDouble(S20);
               System.out.println(S20);
               
               

               String  S21 = "10";
            	int value= Integer.parseInt(S21);	
            	int valueadd=value+2;
            	System.out.println(valueadd);	   
               
		
            	
            	int i=10;
            	String stringvalue =String.valueOf(i);
            	String stringadd=stringvalue+20;
            		System.out.println(stringadd);	
            			
		    double d=85.85;
		    String dhiraj =String.valueOf(d);
		    System.out.println(dhiraj);
		    
		    
		
	}
	

}
