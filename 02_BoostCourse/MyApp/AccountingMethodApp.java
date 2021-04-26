
public class AccountingMethodApp {
	//��������
	public static double valueOfSupply = 10000.0; //���ް�
	public static double vatRate = 0.1;//�ΰ���
	public static double expenseRate;//������
	
	public static void main(String[] args) {
				
		expenseRate = 0.3;
		//�޼ҵ�: �Է� ���� �ְų� ���������� �����Ͽ� ����
		double vat = getVAT();
		double total = getTotal();
		double expense = getExpense();
		double income = getIncome();
		
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		System.out.println("Value of supply : "+ valueOfSupply); //���ް�
		System.out.println("VAT : "+ vat); //�ΰ���
		System.out.println("Total : "+ total);//�Һ��ڰ�
			
		
		System.out.println("Expense : " + expense);//���
		System.out.println("Income : " + income);//�����Ծ�
		
		System.out.println("Dividend 1 : " + dividend1);//ù��° ����
		System.out.println("Dividend 2 : " + dividend2);//�ι�° ����
		System.out.println("Dividend 3 : " + dividend3);//����° ����
	}
	
	public static double getIncome() {
		return valueOfSupply * getExpense();
	}
	
	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}
	
	public static double getTotal () {
		return valueOfSupply * getVAT();
	}
	
	public static double getVAT () {
		return valueOfSupply * vatRate;
	}
}
