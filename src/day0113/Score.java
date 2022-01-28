package day0113;

public class Score {
	public int totalScore(int[][] arr) {
		int sum = 0;
		for (int[] arr1 : arr) {
			for (int n : arr1) {
				sum += n;
			}
		}
		return sum;
	}
	
	public double totalAverage(int[][] arr) {
		int total = totalScore(arr);
		
		return (double)total/(arr.length * arr[0].length);
		
	}
	
	public int totalJava(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++ ) {
			sum+=arr[i][0];
		}
		return sum;
	}
	public int totalOracle(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++ ) {
			sum+=arr[i][1];
		}
		return sum;
	}
	public int totalHtml(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++ ) {
			sum+=arr[i][2];
		}
		return sum;
	}
	public int bestJava(int[][] arr) {
		int temp = arr[0][0];
		
		for (int i = 1; i < arr.length; i++ ) {
			if (temp < arr[i][0]) {
				temp = arr[i][0];
			}
		}
		return temp;
	}
	public int numberOfBest(int[][] arr) {
		int totalScore = 0;
		int temp = 0;
		int number = 0;
		for (int i= 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				totalScore += arr[i][j];
				if (temp < totalScore) {
					temp = totalScore;
					number = i;
				}
			}
			totalScore = 0;
		}
		return number+1;
	}
	
	public String nameOfBest(int[][] arr, String[] names) {
		return names[numberOfBest(arr)-1];
	}

}
