package condition;

public class IfElse {

	public static void main(String[] args) {
		//if가 true면 else는 false, if가 false면 else는 true
		if(true) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		//여러 조건이 필요한 경우 else if를 사용함
		if(false) {
			System.out.println("첫번째 문장");
		}else if(true) {
			System.out.println("두번째 문장");
		}else {
			System.out.println("세번째 문장");
		}
		
	}

}
