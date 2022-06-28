package startprogam;

public class Assignper {
	
    static String collgname ="pdpc";
    static String principlename="ABC";
    static String collageid="24022";
	
	public void persent()
	{

    int	math=80;
	int sci=70;
	int eng=75;
	int histy=88;
	float sum=math+sci+eng+histy;
	float per=sum/4;
	System.out.println(" the percentage of NILAM:" +per);

	}
	public void persent2()
	{

    int	math=70;
	int sci=50;
	int eng=75;
	int histy=78;
	float sum=math+sci+eng+histy;
	float percentage1=sum/4;

	
	System.out.println(" the percentage of sandhya:"+percentage1);

	}
	public static void main(String[] args) {
		System.out.println("COLLAGE NAME:"+collgname);
		System.out.println("principple name:"+principlename);
		System.out.println("COLLAGE_id:"+collageid);

	
         Assignper s1=new Assignper();
		  s1.persent();
		  Assignper s2=new Assignper();
		  s2.persent2();


	}

}
