package condition;

public class If {

	public static void main(String[] args) {
		if(true) {//if의 조건절이 true이면 if문의 block(then 절)이 실행됨
			System.out.println("true");
		}
		System.out.println("마지막 문장");//if절이 false면 이 문장만 실행됨
	}

}
