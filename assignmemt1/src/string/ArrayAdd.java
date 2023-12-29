package string;

import java.util.ArrayList;

public class ArrayAdd {
	public static void main(String[] args) {
//		int [] a=new int[5];
		
//	a[0]=51;
//	a[1]=4;
//	a[2]=50;
//	a[3]=40;
//	a[4]=50;
//	int sum=0;
//	for(int d:a)
//	{
//	if(d%2!=0)
//	{
//		 sum=sum+d;
//		System.out.println(sum);
//	      d++;
//	 
//	}
	
	
//publicstaticvoid main(String[] args) {
	String s = " This  is  String ";
	String rev="";
	// String s2=s.toUpperCase();
	String s2 =s.replace(" ", "");
	//System.out.println(s2);
	String s3=s2.toUpperCase();
	//System.out.println(s3);
	
	
	

	
	String[] Splitvalue = s3.split("");
	
	int size = Splitvalue.length-1;

	for(int i =size; i>=0; i--)
	{
		System.out.print(Splitvalue[i]+"");
		
   
	}	
	System.out.println("+++++++++++++++++++++");

 
	ArrayList<Object>	list  = new ArrayList<Object>();
	list.add(10);
	list.add("java");
	System.out.println("list are:"+list);
			
	
}
}
