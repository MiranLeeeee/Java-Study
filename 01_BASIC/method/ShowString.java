package method;

public class ShowString {
	//�޼ҵ�� ��Ȱ���� �����ϰ� �ڵ��� ���̵� ���� �� �־� ���������� ����
	public static void ShowString() {
		int i = 0;
		while(i<10) {
			System.out.println((i+1)+": hello world");
			i++;
		}
	}
	public static void main(String[] args) {
		ShowString();//�Լ��� ����
		ShowString();
	}

}
