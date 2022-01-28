package day0114;

public class ScoreApplication {

	public static void main(String[] args) {
		//2
		Score0113[] arr = new Score0113[4];
		arr[0] = new Score0113("±èÁø¿µ",89,88,91);
		arr[1] = new Score0113("Á¤½ÃÇå",90,76,82);
		arr[2] = new Score0113("±èÇö¿ì",77,77,76);
		arr[3] = new Score0113("È²¼ºÁØ",100,94,97);
		
		//3
		for (Score0113 a: arr) {
			a.setSumScore(a.getJavaScore()+a.getHtmlScore()+a.getOracleScore());
			a.setAvgScore((double)a.getSumScore()/3);
		}
		
		//4
		for (Score0113 a: arr) {
			System.out.printf("%s | javaScore : %d, oracleScore : %d,"
					+ " htmlScore : %d, sum : %d, avg : %.1f\n",
					a.getName(),a.getJavaScore(),a.getOracleScore(),
					a.getHtmlScore(),a.getSumScore(),a.getAvgScore());
		}
		
		//5
		int sum = 0;
		int cnt = 0;
		for (Score0113 a : arr) {
			if (a.getName().startsWith("±è")) {
				sum += a.getJavaScore();
				cnt++;
			}
		}
		System.out.println("±è¾¾ ÀÚ¹ÙÇÕ = " + sum);
		System.out.printf("±è¾¾ Æò±Õ = %.1f",(double)sum/cnt);

	}

}
