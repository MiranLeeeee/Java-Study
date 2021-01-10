package constant;

public class Constant {

	public static void main(String[] args) {
		//float a = 1.1; 1.1은 double 데이터 타입인데 float으로 선언하므로 에러남
		float a = 2.2F;//F를 넣어 2.2가 float타입임을 명시하면 에러 안남
		
		
		//정수는 뒤에 데이터타입을 명시하지 않으면 default로 int형을 가짐
		//int b = 12345678912; default가 int형이어도 int형의 데이터 크기를 벗어나면 에러남
		long b = 12345678912L; 

	}

}
