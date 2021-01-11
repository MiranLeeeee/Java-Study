package operator;

public class LogicalOperator {

	public static void main(String[] args) {
		//&&(AND): 두 항 모두 다 true여야 true, 나머지는 false
		if (true && true) {
			System.out.println("둘 다 true일 경우");
		}
		if(true && false) {
			System.out.println("하나만 true일 경우");
		}
		
		//||(OR): 한 항만 true여도 true
		if (true || true) {
			System.out.println("둘 다 true일 경우");
		}
		if(true || false) {
			System.out.println("하나만 true일 경우");
		}		
		//!(NOT): boolean값을 반대로 만들어줌
		if(!true) {
			System.out.println("!true");
		}
		if(!false) {//조건문이 true이므로 실행됨
			System.out.println("!false");
		}
	}

}
