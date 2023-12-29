package string;

import java.util.HashMap;

public class Stringbuffer {
	
	public static void main (String arg[])
	{

	/* String S1="sandhya";
	String S2=new String("sandhya");
		System.out.println(S1);
		System.out.println(S2);
		
		*/
		String s1="abc";
		String s2=s1.concat("jj");
		System.out.println(s2);

		
		//String s4=s1+s3;
		//
		String S8=new String("sandhya");
 
		S8.concat("def");
		System.out.println(S8);
		
		
	System.out.println("******************************************");	
		StringBuffer S3= new StringBuffer("abc");
		S3.append("def");
		
		System.out.println(S3);
		
		String s11 = "   abcdefabcdefghi    ";

		String s12 = s11.trim();

		System.out.println(s12);

		
		
		
		
		
		//HashMap<Integer,String> a=new HashMap<Integer, String>();
	/*	HashMap<Integer, String>hm = new HashMap<Integer, String>();
		//hm.add(100,"abc");
		hm.put(111, "abc");
		hm.put(222, "abc");
		hm.put(111, "ghi");
		hm.put(444, "jkl");
		
		System.out.println(hm);
	*/	
		 
}
}
