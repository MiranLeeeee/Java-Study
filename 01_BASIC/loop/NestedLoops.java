package loop;

public class NestedLoops {

	public static void main(String[] args) {
		//반복문 중첩: 구구단
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
	}

}
