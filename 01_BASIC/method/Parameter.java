package method;

public class Parameter {
	//메소드의 입력 값은 데이터 타입과 이름을 지정
	//메소드의 입력 값은 매개변수(Parameter)라고 함 
	public static void ShowString(int start, int end) {
		int i = start;
		while(i<end) {
			System.out.println((i+1)+": hello world");
			i++;
		}
	}
	public static void main(String[] args) {
		//함수실행시 넘겨주는 입력 값은 인자(Argument)라고 함
		ShowString(0, 5);
	}

}
