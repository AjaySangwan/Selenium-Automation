import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
		// if else statement--------------
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
		
		//check multiple of 2-------------
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
			System.out.println(arr2[i]);
			break;
			
		}
		else {
			System.out.println(arr2[i] + " is not multiple of 2");
			
		}
		}
		// create object of the class ArrayList
		// object.method
		ArrayList<String> a = new ArrayList<String>();
		a.add("abb");
		a.add("ajj");
		a.add("selenium");
		a.add("Java");
		a.remove(1);
		System.out.println(a.get(2));
		

	}

}
