package method;

public class Parameter {
	//�޼ҵ��� �Է� ���� ������ Ÿ�԰� �̸��� ����
	//�޼ҵ��� �Է� ���� �Ű�����(Parameter)��� �� 
	public static void ShowString(int start, int end) {
		int i = start;
		while(i<end) {
			System.out.println((i+1)+": hello world");
			i++;
		}
	}
	public static void main(String[] args) {
		//�Լ������ �Ѱ��ִ� �Է� ���� ����(Argument)��� ��
		ShowString(0, 5);
	}

}
