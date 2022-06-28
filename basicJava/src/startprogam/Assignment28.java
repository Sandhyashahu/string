package startprogam;

public class Assignment28 {

    static String collgname ="pdpc";
    static String principlename="ABC";
    static int collageid=2402;
	
    float math;
    float scn;
	float eng;
	float histy;
  
    float Sum=math+scn+histy+eng;
    float per=Sum/4;
 

	public static void main(String[] args) {
		
		
		
		Assignment28 s1= new Assignment28();
		s1.math=80;
		s1.scn=70;
		s1.eng=60;
		s1.histy=70;
	    s1.Sum =s1.math+s1.scn+s1.histy+s1.eng;
	    s1.per=s1.Sum/4;
        
        System.out.println("COLLAGE NAME:"+collgname);
		System.out.println("principple name:"+principlename);
		System.out.println("COLLAGE_id:"+collageid);
        System.out.println("THE PERCENTAGE OF SANDHYA"+s1.per);
	
        
		Assignment28 s2= new Assignment28();

		s2.math=90;
		s2.scn=70;
		s2.eng=90;
		s2.histy=60;
	    s2.Sum =s2.math+s2.scn+s2.histy+s2.eng;
	    s2.per=s2.Sum/4;
        System.out.println("THE PERCENTAGE OF NIKITA"+s2.per);
       
            
	}
	
	
	
	
	
	
	
}
