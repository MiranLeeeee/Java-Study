
public class Casting {
	public static void main(String[] args) {
		//형변환
		double a = 1.1;
		double b = 1;//자동형변환
		double b2 = (double) 1;//명시적형변환
		
		System.out.println(b);//double형으로 출력됨
		
		int c = (int) 1.1;
		double d = 1.1;
		
		System.out.println(c);//실수형을 정수형으로 casting되면 손실이 일어남
		
		//Integer.toString(): int to String
		String f = Integer.toString(1);
		//getClass: 변수의 값의 데이터 타입
		System.out.println(f.getClass());
	}
}
