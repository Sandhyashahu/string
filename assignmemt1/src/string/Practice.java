package string;


public class Practice {
	
	  public static void main (String [] args)
	  {
		  
	 
//	 String s1 = " sadguru is mine";
//	 String s3= s1.replace("", " ");
//	 
//   //  String s3= "";
//     
//     
//     String [] value = s3.split("");
//     int size=value.length-1;
//     for(int i =size;i>=0;i--)
// 
//    	 System.out.println(value[i]+ " ");
//     }
     
     
     String s5 = " sadguru is mine";
     String s6=s5.toUpperCase();
     String s7=s6.replace("", "");
     System.out.println(s7);
	 String rev= "";
	  
	 for(int i = s7.length()-1;i>=0;i--)
	 {
		 
		 rev=rev+s5.charAt(i);
	 }
		 System.out.println(rev);
	 
     
}
}