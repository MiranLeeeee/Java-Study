package method;

public class Return {
	//void�� return���� ���� ��� ���
	//void��� return���� ������ Ÿ���� ����
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
		//���ϰ��� ������ Ÿ�԰� ��ġ�� ������ �����Ͽ� ����
		int result = sum(1,10);
		System.out.println(result);
	}

}
