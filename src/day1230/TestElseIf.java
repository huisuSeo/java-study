package day1230;
/**
���� if.(else~if)
������ ���� ������ ���� �� ���
*/
public class  TestElseIf{
	public static void main(String[] args) {

	//������ �Է¹޾� 0������ �۾��� ���� ���и޽����� 100������ ���� �� ���и޽�����
	//�������� �� �޽����� ���

	
	int score = Integer.parseInt(args[0]);
	//int score = 0;

	System.out.print( score + "����");

	if(score < 0){//0���� ���� ���
		System.out.println(" 0�� ���� ���� �� �����ϴ�.");
	}else if(score > 100){//100���� ū ���
		System.out.println(" 100���� Ŭ �� �����ϴ�.");
	}else{//�׷��� ���� ���
		System.out.println(" �Է¼���");
	}//end else

//���� �Է¹޾� 0~39 ������ " ����" 40 ~59������ "�ٸ� ���� ����",
//60~100������ "�հ�" -else�� �����ϴ� �ڵ� �ۼ�.
	System.out.print(score + "��");
	if(score >= 0 && score <= 39 ){//0~39
		System.out.println(" ����");
	}else if(score >=40 && score <=59){//40~59
		System.out.println(" �ٸ� ���� ����");
	}else if(score >= 60 && score <=100){//60~100
		System.out.println(" �հ�!!!");
	}//end if

	
	}//main
}//class
