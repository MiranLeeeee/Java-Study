package loop;

public class BreakContinue {

	public static void main(String[] args) {
		System.out.println("break��");
		for (int i = 0; i < 10; i++) {
			if(i==5) {//i�� 5�̸� �ݺ����� ����
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("continue��");
		for (int i = 0; i < 10; i++) {
			if(i==5) {//i�� 5�̸� ���� ���� �κ��� ����ǰ� �ݺ��� ������ �̵�
				continue;
			}
			System.out.println(i);
		}
	}

}
