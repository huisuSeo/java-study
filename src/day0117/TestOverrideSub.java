package day0117;

/**
 * �ڽ�Ŭ����.(��ӹ���(����� Ȯ����) Ŭ������ ����Ѵ�)<br>
 * �������̵��� ���� :
 * �θ�Ŭ������ �����ϴ� ����� �ڽ�Ŭ�������� ���� ������ �ڽ�Ŭ������ �ʿ��� ����� �������ϴ� ��.<br>
 * ��Ģ:
 * ���������ڴ� �޶� �ǰ�, ��ȯ��, method��, �Ű������� �ݵ�� ���ƾ��Ѵ�.
 * @author user
 *
 */
public class TestOverrideSub extends TestOverrideSuper{
	
//temp method�� Override
	@Override
	public void temp() {
		System.out.println("�ڽ�Ŭ������ Override�� temp method");
		super.temp();//�θ�Ŭ������ ���� temp() ȣ��

	}//temp
	
	public void sub() {
		System.out.println("�ڽ�Ŭ������ ���� method");
	}//sub
}//class
