package operator;

public class Conversion {

	public static void main(String[] args) {
		int a = 11;
		int b = 2;
		
		float c = 11.0F;
		float d = 2.0F;
		
	    System.out.println(a/b);//결과가 정수
	    System.out.println(c/d);//결과가 실수
	    System.out.println(a/d);//범위가 큰 형태로 자동 변환, a가 11.0이 됨 ---> 결과가 실수
	}

}
