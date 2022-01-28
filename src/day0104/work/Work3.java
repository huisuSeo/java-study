package day0104.work;

/**
 *초과요금 :

기본요금은 10km까지 유효하며, 10km를 초과하면 매 5km마다 추가요금이 100원씩 붙는다.
대중교통수단인 경우에는 아래와 같이 출력하세요.
⇒ 입력 교통수단 “XX” 이동거리 xxkm기본요금 xx원 초과요금 xx원
한달 20일 기준 교통비 xx원
대중교통수단 아닌 경우에는 “대중교통이 아닙니다”를 출력할 것.
 * 
 */
public class Work3 {
//대중교통수단의 기본 요금은 자주 변경되지 않는 기준 값의 형태를 가지므로 Constant로 설정
	public static final int TOWN_BUS = 800;//마을버스
	public static final int BUS = 1250;//버스
	public static final int SUBWAY = 1300;//지하철
	
	public static void main(String[] args) {
		
		
		if(args[0].equals("마을버스")||args[0].equals("버스")||args[0].equals("지하철")){//대중교통수단
			int distance = 0;//입력된 이동거리.
			int fare = 0;//요금
			int overFare = 0;//초과요금
			
			distance = Integer.parseInt(args[1]);

			if(args[0].equals("마을버스")) {
				fare = Work3.TOWN_BUS;
			}else if(args[0].equals("버스")) {
				fare = Work3.BUS;
			}else
				fare = Work3.SUBWAY;		
			
			if(distance > 10) {
				overFare = (((distance - 10) / 5) + 1)*100;
			}//end if
			//입력 교통수단 “XX” 이동거리 xxkm기본요금 xx원 초과요금 xx원
			//한달 20일 기준 교통비 xx원
			System.out.println("입력 교통수단 " + args[0] + " 이동거리 " + distance + "km, 기본요금 " + fare + "원, 총요금 " + (fare + overFare) + "원 한달 20일 기준 교통비" + (fare + overFare)*20 + "원");
			
			}else {//대중교통수단이 아닌경우
				System.out.println("입력하신 " + args[0] + "은(는) 대중교통수단이 아닙니다.");
			}//end else
			//초과요금
		
	}//main

}//class
