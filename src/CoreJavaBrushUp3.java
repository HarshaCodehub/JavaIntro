
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an object
		//String literal // no duplicates
		String h = "Harsha starts coding";
		String h1 = "Harsha starts coding";
		//String new memory / accepts duplicates
		String h2 = new String("welcome");
		String h3 = new String("welcome");
		//How to split a string sentence
		String[] splittedString = h.split("starts");
		for(String s:splittedString)
		{
		System.out.println(s);
		}
		System.out.println(splittedString[1].trim());
		//How to split character by character
		for(int i=0;i<h.length();i++)
		{
			System.out.println(h.charAt(i));
		}
		//How to split in reverse
		for(int i=h.length()-1;i>=0;i--)
		{
			System.out.println(h.charAt(i));
		}
		
		
		
		
		
		
	}

}
