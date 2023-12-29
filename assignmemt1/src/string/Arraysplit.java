package string;

public class Arraysplit {
	
	public static void main(String[] args) {
		
		String s26 = "This is a String";
		//String s25 = s26.toUpperCase();
		String s27 = s26.replace(" ","");
		String s25 = s27.toUpperCase();
																																																																																																																													

		 String[] String = s25.split(" ");

	String reverse = "";
	 int arlength = String.length;

	 for(int r = (arlength-1); r>=0; r--)
	 {
		 reverse = reverse+" " +String[r];

	 }

	 System.out.println(reverse);

	}
}
