package day0113;

public class Work0113 {
	private String name;
	private int java;
	private int oracle;
	private int html;
	
	private int total;
	private double avg;
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public Work0113(String name, int java, int oracle, int html) {
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.total = java + oracle + html;
		this.avg = total/3;
		
	}//Work0113

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

}//class
