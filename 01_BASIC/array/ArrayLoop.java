package array;

public class ArrayLoop {

	public static void main(String[] args) {
		String[] names = {"강가가","김나나","유다다"};
		System.out.println("배열 for문");
		//인덱스를 통해 반복문을 사용하여 배열의 원소(값)을 출력
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			System.out.println(name + "님 반갑습니다.");
		}
		
		System.out.println("배열 for each문");
		//for를 사용하면 초기화와 배열의 크기등을 지정해줘야하지만 for each는 이를 간략화
		for (String e: names) {
			System.out.println(e + "님 반갑습니다.");
		}
	}

}
