package operator;

public class Conversion {

	public static void main(String[] args) {
		int a = 11;
		int b = 2;
		
		float c = 11.0F;
		float d = 2.0F;
		
	    System.out.println(a/b);//����� ����
	    System.out.println(c/d);//����� �Ǽ�
	    System.out.println(a/d);//������ ū ���·� �ڵ� ��ȯ, a�� 11.0�� �� ---> ����� �Ǽ�
	}

}
