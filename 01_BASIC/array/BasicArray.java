package array;

public class BasicArray {

	public static void main(String[] args) {
		//�迭�� ������ ���� �����͸� ���� ���� ������Ÿ���� �ǹ���
		//������ �������� ������Ÿ��[] �迭������ ����
		String[] names1 = {"�質��","�պ���","�̶Ѻ�","�̶̹�"};
		
		//index�� ���� �迭 �ּ��� ���� ������
		//index�� 0���� ������
		System.out.println(names1[3]);//�̶̹�
		
		//�迭�� ���� (������ ����)
		System.out.println(names1.length);//4
		
		//�迭�� �����ϰ� �� ���Ҹ� �����ϴ� ���
		String[] names2 = new String[4];//4���� ���Ҹ� ������ �迭����
		names2[0] = "������";
		names2[1] = "�̿���";
		names2[2] = "������";
		names2[3] = "�̼���";
		//names2[4]���� ���� ��� ���� �߻�
		
		System.out.println(names2[1]);//�̿���
	}

}
