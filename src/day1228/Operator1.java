package day1228;
/**
단항 연산자<br>
연산자 대상체.
~, !, +, -, ++, --
*/
public class Operator1 {
	public static final int MAX = 100;
	public static void main(String[] args) {
		int i = 12;
		int j = -19;
		System.out.println("~" + i + " = " + ~i);//~양수 : 부호변경 1증가 ~12 => -13
		System.out.println("~" + j + " = " + ~j);//~음수 : 부호변경 1감소 ~-19 => 18

		i = 12;
		j = 28;

		System.out.println(i + " > " + j + " = " + !(i > j));

		boolean flag1 = true, flag2 = false;
		//!을 boolean형 앞에 사용.
		System.out.println("!" + flag1 + " = " + !flag1);
		System.out.println("!" + flag2 + " = " + !flag2);

		i = 12;
		j = -37;
		//+연산자는 아무런 일도 하지 않는다.(형식적인 제공)
		System.out.println("+" + i + " = " + i );
		System.out.println("+" + j + " = " + j);

		//-연산자는 값은 그대로 두고 부호만 변경
		System.out.println("+" + i + " = " + -i );//-12
		System.out.println("+" + j + " = " + -j);//37

		//증가연산, 감소연산
		i = 10;
		j = 12;
		System.out.println( "i : " + i + ",j : " + j);
		//증가연산
		++i;//전위연산 10 -> 11
		i++;//후위연산 11 -> 12

		//감소연산
		--j;//전위연산 12 -> 11
		j--;//후위연산 11 -> 10
		System.out.println("증가 연산 후 i : " + i);
		System.out.println("감소 연산 후 j : " + j);

		int result = 0;
		//전위연산 : 연산 후 대입
		result = ++i;
		System.out.println("전위연산 후 i = " + i + ", result : " + result);//i = 13, result = 13
		result = 0;
		//후위연산 : 대입 후 연산.
		result = i++;
		System.out.println("후위연산 후 i = " + i + ", result : " + result);//i = 14 , result = 13

		System.out.println("전위 :"+  ++i);//i를 증가한 후 method에 할당 15가 출력
		System.out.println(i);//15

		System.out.println("전위 :"+  i++);//i를 method에 할당 i를 증가 15가 출력
		System.out.println(i);//16

		i = 10;
		j = 20;
		System.out.println(i++ + --j);//i는 후위, j는 전위 19 연산

	//i = 20++;//상수에는 증가, 감소 연산자를 사용할 수 없다.
	//i = --MAX;//Constant에는 증가, 감소 연산자를 사용할 수 없다.
	}//main
}//class
