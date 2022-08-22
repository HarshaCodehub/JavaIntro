import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Harsha","Supriya","neighbour1","neighbour2","Daddy"};
		int[] har = {10,20,25,35,50}; // 10,20,50
		for(int i=0; i<har.length;i++)
		{
			if(har[i] % 2 == 0)//checking the multiple of 2
			{
				System.out.print(name[i]);
				System.out.println(" "+har[i]+" Passed");
				break;
			}
			else
			{
				System.out.print(name[i]);
				System.out.println(" "+"Rejected");
			}
			
		}	
			
			//using dynamic arrays
			ArrayList<String> a = new ArrayList<String>();
			a.add("Miriyala");
			a.add("Family");
			a.add("Members");
			System.out.println(a.get(1));
			
			
		
		
		
		

	}

}
