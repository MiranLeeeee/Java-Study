package datatype;

public class Boolean {

	public static void main(String[] args) {
		//boolean은 true와 false 두 가지 값을 갖는 데이터타입
		//비교연산자
		
		//=은 대입연산자, ==비교연산자(같은지 여부를 확인)
		//!=은 not을 의미(같지 않는지 여부를 확인)
		System.out.println(1==1);//true
		System.out.println(1==2);//false
		System.out.println(1!=2);//true
		System.out.println("java"=="ja");//false
		System.out.println("java"=="java");//true
		
		//A>B는 A가 B보다 큰지, A>=B는 A가 B보다 크거나 같은지 비교   
		System.out.println(1>1);//false
		System.out.println(1>=1);//true
		
		//문자열 비교는 .equals()로 활용
		String string1 = "hello";
		String string2 = new String("hello");
		System.out.println(string1==string2);//false ---> 문자열은 ==연산자 사용X
		System.out.println(string1.equals(string2));//true		
		
	}

}
