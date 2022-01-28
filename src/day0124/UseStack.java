package day0124;

import java.util.Stack;

/**
 * LIFO 자료구조의 특징을 구현한 클래스 - Stack
 * @author user
 *
 */
public class UseStack {
	
	public UseStack() {
		//1. Stack생성
		Stack<String> stk = new Stack<String>();
		
		//2.값 넣기
		stk.push("하세요? 1.");
		stk.push("안녕 2.");
		stk.push("오늘은 월요일 3");
		
		//3.값 얻기. 스택에 아이템이 존재할 때까지 얻기
		while(!stk.empty()) {//비었을 때 true, 비어있지 않으면 false
		System.out.println(stk.pop());
		}//while
		
		System.out.println(stk);//object에 존재하는 toString method를 오버라이딩 해서 주소가 아닌 값이 나옴
		
	}//UseStack

	public static void main(String[] args) {
		UseStack us = new UseStack();
	}//main

}//class
