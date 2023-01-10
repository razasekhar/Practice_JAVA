package Arrays;

public class Array1D {
	public static void main(String[] args) {
		int[] Array = new int[10];
		//String[] myArray = new String[30]; 
		/*
		 * System.out.println(myArray.length); //Array[2] = 20;
		 * 
		 * System.out.println(Array.length);
		 */
		for (int index=0; index<Array.length;index++) {
			
			Array[index] = (int)(Math.random()*2000);
			//System.out.println(Array[index]);
		}
		for(int var:Array) {
			System.out.println(var);
		}
		System.out.println("------Printing reverse order-----");
		
		for (int index=Array.length-1;index>=0;index--) {
			System.out.println(Array[index]);
		}
	}

}
