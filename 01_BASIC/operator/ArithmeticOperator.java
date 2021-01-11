package operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		//덧셈 연산자는 숫자 뿐만 아니라 문자(열)결합 가능
		int result = 6 + 10;
		System.out.println(result);
		
		result = result - 2;
		System.out.println(result);
		
		result = result * 2;
		System.out.println(result);
		
		result = result / 2;
		System.out.println(result);
		
		System.out.println(0%result);//0을 출력
		result = result % 2;
		System.out.println(result);
		
		
		

	}

}
