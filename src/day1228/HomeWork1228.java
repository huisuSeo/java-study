package day1228;
class  HomeWork1228{
	public static void main(String[] args) {
		int i = 12;
		System.out.println(~i + 1);

		i = 10;
		int j = -10;
		System.out.println( i++ - --j);//20 나올 것 같음  21이 나옵니다.(전위와 후위를 생각해 보세요)

		i = Integer.MAX_VALUE;
		System.out.println(i + " >> 27 = " + (i >> 27));
	//잘하셨어요

	}
}
