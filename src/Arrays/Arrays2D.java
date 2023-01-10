package Arrays;

public class Arrays2D {
	public static void main(String[] args) {
		int[][] Array = new int[2][3];
		/*
		 * myArray[0][0] = 1; myArray[0][1] = 2; myArray[0][2] = 3; myArray[1][0] = 4;
		 * myArray[1][1] = 5; myArray[1][2] = 6;
		 */
		
		
		for(int i = 0; i<Array.length ;i++) {
			for(int j=0; j<Array[i].length; j++) {
				Array[i][j] = (int)(Math.random()*1000);
				System.out.println(Array[i][j]);
				
				//int  z = myArray[i][j];
				
			}
			
			
			System.out.println();
			
		}
		for(int[] r:Array) {
			System.out.println(r);
			}
		
	}

}
