package object;

//classŰ����� Ŭ���� ����
//��ü�� �ϳ��� ���α׷��� ����
class Calc{
	
	int v1, v2;
	
	public void setValues(int v1, int v2) {
		//�ν��Ͻ��� ���� = setValues�� �Ķ����
		this.v1 = v1;
		this.v2 = v2;
	}
	
	public void sum() {
		System.out.println(this.v1+this.v2);
	}
	
	public void sub() {
		System.out.println(this.v1-this.v2);
	}
	
	public void mul() {
		System.out.println(this.v1*this.v2);
	}
	
	public void div() {
		System.out.println(this.v1/this.v2);
	}
	
}

public class Object {
	
	public static void main(String[] args) {
		//Ŭ����(����)�� �ν��Ͻ�(��ǰ)
		//Ŭ���� �ϳ��� �ν��Ͻ��� ���� ���� ���� �� ����
		//��ü�� ����(����, ������)�� ����(�޼ҵ�)�� ����
		Calc c1 = new Calc(); //��ü ���� ---> �ν��Ͻ�
		c1.setValues(1, 2);
		c1.sum();
		c1.sub();
		
		Calc c2 = new Calc(); //��ü ���� ---> �ν��Ͻ�
		c2.setValues(100, 50);
		c2.mul();
		c2.div();
		
	}

}
