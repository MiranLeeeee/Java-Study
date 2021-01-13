package loop;

public class BreakContinue {

	public static void main(String[] args) {
		System.out.println("break문");
		for (int i = 0; i < 10; i++) {
			if(i==5) {//i가 5이면 반복문이 종료
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("continue문");
		for (int i = 0; i < 10; i++) {
			if(i==5) {//i가 5이면 실행 중인 부분은 종료되고 반복문 앞으로 이동
				continue;
			}
			System.out.println(i);
		}
	}

}
