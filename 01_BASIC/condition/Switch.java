package condition;

public class Switch {

	public static void main(String[] args) {
		//switch���� ���� ��ġ�ϴ� case�� ã�Ƽ� �� �������� ������ ����
		switch(1) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		}
		//1, 2, 3 ��µ�
		
		//�ش� case�� �����ϰ� ������ case ���� �ȿ� break;�� �־����
		//���� �ش��ϴ� case�� ���� ��� default���� ����
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
