public class Datatype {
	public static void main(String[] args) {
		System.out.println(6); //Number
		System.out.println("six"); //String
		
		System.out.println("6"); //String
		System.out.println(6+6); //12 (덧셈연산)
		System.out.println("6"+"6"); //66 (결합연산자)
		
		//데이터 타입에 따라 사용할 수 있는 연산이 있음
		System.out.println(6*6); //36 (곱셈연산 -> string에서는 사용불가)
		System.out.println("1111".length()); //4 (문자열의 길이 -> Number에서는 사용불가)
	}	
}