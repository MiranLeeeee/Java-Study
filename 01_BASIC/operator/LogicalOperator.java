package operator;

public class LogicalOperator {

	public static void main(String[] args) {
		//&&(AND): �� �� ��� �� true���� true, �������� false
		if (true && true) {
			System.out.println("�� �� true�� ���");
		}
		if(true && false) {
			System.out.println("�ϳ��� true�� ���");
		}
		
		//||(OR): �� �׸� true���� true
		if (true || true) {
			System.out.println("�� �� true�� ���");
		}
		if(true || false) {
			System.out.println("�ϳ��� true�� ���");
		}		
		//!(NOT): boolean���� �ݴ�� �������
		if(!true) {
			System.out.println("!true");
		}
		if(!false) {//���ǹ��� true�̹Ƿ� �����
			System.out.println("!false");
		}
	}

}
