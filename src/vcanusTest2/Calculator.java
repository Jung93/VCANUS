package vcanusTest2;

public class Calculator {
	private int result;
	//add 메소드 선언
	public Calculator add(int number) {
		result += number;
		return this;
	}
	//subtract 메소드 선언
	public Calculator subtract(int number) {
		result -= number;
		return this;
	}
	//out 메소드 선언
	public int out() {
		return result;
	}
}
