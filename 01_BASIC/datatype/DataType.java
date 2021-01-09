package datatype;

public class DataType {

	public static void main(String[] args) {
		byte a;
		a = 127;
		//a = 128; ---> byte가 가질 수 있는 크기를 넘음
		//데이터 타입에 따라 프로그램 동작 시 메모리를 사용하는 크기가 달라짐
		short b;
		b = 128;
		
		//실수는 float, double 사용
		//문자는 char 사용
		char c = 'a';//2바이트
	}

}
