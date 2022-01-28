package day0118;

/**
 * Test A B 를 상속받음
 * @author user
 *
 */
public interface TestC extends TestA, TestB {
	public abstract void testC();
	//부모인터페이스의 추상method는 자식인터페이스에서 구현(Override)할 필요가 없다.
//	@Override
//	public abstract void testA();
	
}//interface