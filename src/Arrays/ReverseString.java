package Arrays;

public class ReverseString {
	public static void main(String[] args) {
	String stringinput = "Independent";

    // convert String to character array

    // by using toCharArray

    char[] resultarray = stringinput.toCharArray();

    //iteration

    for (int i = resultarray.length - 1; i >= 0; i--)

     // print reversed String

        System.out.print(resultarray[i]);

}

}
