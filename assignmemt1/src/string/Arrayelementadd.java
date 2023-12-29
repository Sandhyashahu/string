package string;

public class Arrayelementadd {
	
	public static void main(String[] args) {
		String s= " SHAHU SHAHU";
		int num=0;
	              char[] chars = s.toCharArray();
	      
	                 System.out.println("Duplicate characters are:");
	      
	                     for (int i=0; i<s.length();i++) 
	                          {
	                             for(int j=i+1; j<s.length();j++) 
	                             {
	                                 if (chars[i] == chars[j]) 
	                               {
	                                 System.out.println(chars[j]);
	                                    num++;
	                                      break;
	                                      }
	                                      }
	                                    
		
		
		int [] a=new int[5];
		a[0]=40;
 	a[1]=50;
 	a[2]=70;
	int K;
	int sum=0;
		for(K=0;K<5;K++)
		{
		sum=sum+a[K];
	}
		System.out.println(sum);	
	    }
	}
}


