package datatype;

public class Boolean {

	public static void main(String[] args) {
		//boolean�� true�� false �� ���� ���� ���� ������Ÿ��
		//�񱳿�����
		
		//=�� ���Կ�����, ==�񱳿�����(������ ���θ� Ȯ��)
		//!=�� not�� �ǹ�(���� �ʴ��� ���θ� Ȯ��)
		System.out.println(1==1);//true
		System.out.println(1==2);//false
		System.out.println(1!=2);//true
		System.out.println("java"=="ja");//false
		System.out.println("java"=="java");//true
		
		//A>B�� A�� B���� ū��, A>=B�� A�� B���� ũ�ų� ������ ��   
		System.out.println(1>1);//false
		System.out.println(1>=1);//true
		
		//���ڿ� �񱳴� .equals()�� Ȱ��
		String string1 = "hello";
		String string2 = new String("hello");
		System.out.println(string1==string2);//false ---> ���ڿ��� ==������ ���X
		System.out.println(string1.equals(string2));//true		
		
	}

}
