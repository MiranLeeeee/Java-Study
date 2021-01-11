package condition;

public class Switch {

	public static void main(String[] args) {
		//switch안의 값과 일치하는 case를 찾아서 그 구문부터 끝까지 실행
		switch(1) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		}
		//1, 2, 3 출력됨
		
		//해당 case만 실행하고 싶으면 case 구문 안에 break;를 넣어야함
		//값에 해당하는 case가 없을 경우 default문을 실행
		switch(4) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default: 
			System.out.println("default");
		}	
	}

}
