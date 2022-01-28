package day1229;
class HomeWork1229{
	public static void main(String[] args){
	int upper = Integer.parseInt( args[0] );
		if(upper >= 65 && upper <= 90 ){
			System.out.println((char)upper);
		}//if

		int three = Integer.parseInt( args[1]);
		if(three % 3 == 0){
			System.out.println( "쫙");
		}//if2
		int letter = Integer.parseInt( args[2] );
		if(letter >= 65 || letter <= 90 || letter >= 97 || letter <= 122 || letter >= 48 || letter <= 57){
			System.out.println((char)letter);
		}//if3

		System.out.println(args[3]);
		if( args[3].equals("버스") || args[3].equals("지하철") || args[3].equals("마을버스") || args[3].equals("택시")){
			System.out.println("대중교통");
		}//if4


	}//main
}//class
