package vcanusTest2;

public class Test {
	public static void main(String[] args) {
		//Calculator 객체화
		Calculator calculator = new Calculator();
		
		int result = calculator.add(3).add(30).subtract(20).out();
		System.out.println(result);
	}
}
