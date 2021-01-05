package numberstring;

public class CharString {
	
	public static void main(String[] args) {
		System.out.println("자바스터디");
		//문자열이 작은따옴표로 묶을 경우 에러를 발생
		//System.out.println('자바스터디'); ---> X
		//하지만 문자나 문자열 모두 큰 따옴표로 묶으면 에러가 발생하지 않음
		//System.out.println("자"); ---> O
			
		//문자열 합치기는 +연산자로 가능
		System.out.println("자바"+"스터디");//자바스터디 출력
		System.out.println("1"+"2");//문자열이므로 3이 아니라 12가 출력
		
		//이스케이프: 역슬래쉬를 활용
		System.out.println("JAVA study \"hello world\"");
		//\n은 줄바꿈
		System.out.println("JAVA study \n\"hello world\"");
	}	
	
}
