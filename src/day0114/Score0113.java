package day0114;

//1
public class Score0113 {
	private String name;
	private int javaScore;
	private int oracleScore;
	private int htmlScore;
	private int sumScore;
	private double avgScore;
	
	public Score0113(String name, int javaScore, int oracleScore, int htmlScore) {
		this.name = name;
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
		this.htmlScore = htmlScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
	public int getOracleScore() {
		return oracleScore;
	}
	public void setOracleScore(int oracleScore) {
		this.oracleScore = oracleScore;
	}
	public int getHtmlScore() {
		return htmlScore;
	}
	public void setHtmlScore(int htmlScore) {
		this.htmlScore = htmlScore;
	}
	public int getSumScore() {
		return sumScore;
	}
	public void setSumScore(int sumScore) {
		this.sumScore = sumScore;
	}
	public double getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(double d) {
		this.avgScore = d;
	}
	
	

}
