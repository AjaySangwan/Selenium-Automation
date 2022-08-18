
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
		// String is an object
		// String literal
		//String s = "Selenium Java";
		String s1 = "Selenium Java";
		
		// new memory allocated-----------
		String s2 = new String("Hello");
		String s3 = new String("Hello");

		String s = "Sele nium Java";
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		for(int i = s.length()-1;i>=0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
