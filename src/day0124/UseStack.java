package day0124;

import java.util.Stack;

/**
 * LIFO �ڷᱸ���� Ư¡�� ������ Ŭ���� - Stack
 * @author user
 *
 */
public class UseStack {
	
	public UseStack() {
		//1. Stack����
		Stack<String> stk = new Stack<String>();
		
		//2.�� �ֱ�
		stk.push("�ϼ���? 1.");
		stk.push("�ȳ� 2.");
		stk.push("������ ������ 3");
		
		//3.�� ���. ���ÿ� �������� ������ ������ ���
		while(!stk.empty()) {//����� �� true, ������� ������ false
		System.out.println(stk.pop());
		}//while
		
		System.out.println(stk);//object�� �����ϴ� toString method�� �������̵� �ؼ� �ּҰ� �ƴ� ���� ����
		
	}//UseStack

	public static void main(String[] args) {
		UseStack us = new UseStack();
	}//main

}//class
