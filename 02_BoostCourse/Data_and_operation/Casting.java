
public class Casting {
	public static void main(String[] args) {
		//����ȯ
		double a = 1.1;
		double b = 1;//�ڵ�����ȯ
		double b2 = (double) 1;//���������ȯ
		
		System.out.println(b);//double������ ��µ�
		
		int c = (int) 1.1;
		double d = 1.1;
		
		System.out.println(c);//�Ǽ����� ���������� casting�Ǹ� �ս��� �Ͼ
		
		//Integer.toString(): int to String
		String f = Integer.toString(1);
		//getClass: ������ ���� ������ Ÿ��
		System.out.println(f.getClass());
	}
}
