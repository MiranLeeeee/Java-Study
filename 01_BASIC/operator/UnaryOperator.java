package operator;

public class UnaryOperator {

	public static void main(String[] args) {
		int i = 2;
		i++; //i = i+1 ---> 3
		
		System.out.println(i);//3
		System.out.println(++i);//4
		System.out.println(i++);//후위연산자는 연산 시 반환하지 않음 ---> 4
		System.out.println(i);//5
	}

}
