package condition;

public class Login {

	public static void main(String[] args) {
		/*�Է� �� ���� ���
		1. Run Configurations
		2. new launch configuration
		3. name ����
		4. Arguments �ǿ��� program arguments ����
		5. argument�� ���� ���ϰ�� �������� ����
		*/
		
		String id = args[0];//�Է� ��
		String password = args[1];
		
		if(id.equals("miran")) {
			if(password.equals("1234")) {//���ǹ��� ��ø
				System.out.println("�α��� ����");
			}else {
				System.out.println("�α��� ����");
			}
		}else {
			System.out.println("�α��� ����");
		}
	}

}
