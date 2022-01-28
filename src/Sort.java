import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int temp[] = {89, 77, 75, 100, 96};
		Arrays.sort(temp);
		
		for(int i : temp) {
			System.out.printf("%-3d",i);
		}//for
		

	}//main

}//class
