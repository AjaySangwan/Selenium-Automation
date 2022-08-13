
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		// ---- variables and data types
		
		int myNum = 5;
		String website = "google";
		char letter = 'a';
		double price = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum + " is the value in the myNum variable");
		System.out.println(website);
		
		// Arrays ---------
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5,7,8,9,10,122};
		System.out.println(arr2[3]);
		
		// for loop---------------
		for (int i = 0; i < arr.length; i++)
		{
			
			System.out.println(arr[i]);
	}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		String[] name = {"Ajay", "Sangwan", "selenium"};
		 
			for(int i=0; i< name.length; i++) {
				System.out.println(name[i]);
			}
			
			//enhanced for loop------
			for(String s : name)
			{
				System.out.println(s);
			}
}
}
