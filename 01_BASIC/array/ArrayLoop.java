package array;

public class ArrayLoop {

	public static void main(String[] args) {
		String[] names = {"������","�質��","���ٴ�"};
		System.out.println("�迭 for��");
		//�ε����� ���� �ݺ����� ����Ͽ� �迭�� ����(��)�� ���
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			System.out.println(name + "�� �ݰ����ϴ�.");
		}
		
		System.out.println("�迭 for each��");
		//for�� ����ϸ� �ʱ�ȭ�� �迭�� ũ����� ��������������� for each�� �̸� ����ȭ
		for (String e: names) {
			System.out.println(e + "�� �ݰ����ϴ�.");
		}
	}

}
