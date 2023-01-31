package vcanusTest3;

public class Test {
	public static void main(String[] args) {
			long result = factorial(1_000_000);
			System.out.println(result);
	}
	
	protected static long factorial(int number){
		//0! 는 1
		//매개변수로 1이 들어올 경우 재귀함수 호출 종료
		if(number == 0 || number == 1) {
			return 1;
		}
		//StackOverflowError가 발생할 경우에 대한 예외처리
		try {
			//재귀함수 호출
			return number * factorial(number -1);
		} catch (StackOverflowError e) {
			return 0;
		}
	}
}
