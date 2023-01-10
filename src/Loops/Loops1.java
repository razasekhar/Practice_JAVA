package Loops;

public class Loops1 {
	public static void main(String[] args) {
		int i = 0;
		int c = 1;
		while(i<3) {
			for(int j=0; j<4;j++) {
				int k = 0;
				do {
					System.out.println(c++ +")" +" I-------"+i+" J------>"+j+" K------>"+k);
					k++;
				}while(k<5);
				//k++;
			}
			i++;
		}
	}

}
