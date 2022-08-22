
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo h = new MethodsDemo();
		//String name =h.getData();
		String name =getData();//calling without object
		System.out.println(name);
		MethodsDemo2 h1 = new MethodsDemo2();
		String user = h1.getUserData();
		System.out.println(user);
		
	}

	//public String getData()
	//{
		//System.out.println("hey world");
		//return "Harsha World";
	//}
	//how to get method without object
	public static String getData()
	{
		System.out.println("hey world");
		return "Harsha World";
	}
	
	
	
}
