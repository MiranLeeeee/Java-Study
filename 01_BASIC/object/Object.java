package object;

//class키워드로 클래스 정의
//객체는 하나의 프로그램과 같음
class Calc{
	
	int v1, v2;
	
	public void setValues(int v1, int v2) {
		//인스턴스의 변수 = setValues의 파라미터
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
		//클래스(설계)와 인스턴스(부품)
		//클래스 하나에 인스턴스가 여러 개가 나올 수 있음
		//객체는 상태(변수, 데이터)와 행위(메소드)의 집합
		Calc c1 = new Calc(); //객체 생성 ---> 인스턴스
		c1.setValues(1, 2);
		c1.sum();
		c1.sub();
		
		Calc c2 = new Calc(); //객체 생성 ---> 인스턴스
		c2.setValues(100, 50);
		c2.mul();
		c2.div();
		
	}

}
