package method;

public class ShowString {
	//메소드는 재활용이 가능하고 코드의 길이도 줄일 수 있어 유지보수에 용이
	public static void ShowString() {
		int i = 0;
		while(i<10) {
			System.out.println((i+1)+": hello world");
			i++;
		}
	}
	public static void main(String[] args) {
		ShowString();//함수를 실행
		ShowString();
	}

}
