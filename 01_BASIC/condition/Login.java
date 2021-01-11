package condition;

public class Login {

	public static void main(String[] args) {
		/*입력 값 설정 방식
		1. Run Configurations
		2. new launch configuration
		3. name 수정
		4. Arguments 탭에서 program arguments 지정
		5. argument가 여러 개일경우 공백으로 구분
		*/
		
		String id = args[0];//입력 값
		String password = args[1];
		
		if(id.equals("miran")) {
			if(password.equals("1234")) {//조건문을 중첩
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");
			}
		}else {
			System.out.println("로그인 실패");
		}
	}

}
