package array;

public class BasicArray {

	public static void main(String[] args) {
		//배열은 연관된 여러 데이터를 묶어 놓은 데이터타입을 의미함
		//연관된 데이터의 데이터타입[] 배열명으로 정의
		String[] names1 = {"김나나","손보라","이뚜비","이미란"};
		
		//index를 통해 배열 주소의 값을 가져옴
		//index는 0부터 시작함
		System.out.println(names1[3]);//이미란
		
		//배열의 길이 (원소의 개수)
		System.out.println(names1.length);//4
		
		//배열을 정의하고 각 원소를 정의하는 경우
		String[] names2 = new String[4];//4개의 원소를 가지는 배열정의
		names2[0] = "이유빈";
		names2[1] = "이예은";
		names2[2] = "이준혁";
		names2[3] = "이서은";
		//names2[4]값을 넣을 경우 에러 발생
		
		System.out.println(names2[1]);//이예은
	}

}
