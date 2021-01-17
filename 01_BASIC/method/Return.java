package method;

public class Return {
	//void는 return값이 없을 경우 사용
	//void대신 return값의 데이터 타입을 지정
	public static int sum(int start, int end) {
		int i = start;
		int sum = 0;
		
		while(i<end) {
			sum += i;
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		//리턴값의 데이터 타입과 일치한 변수를 지정하여 대입
		int result = sum(1,10);
		System.out.println(result);
	}

}
