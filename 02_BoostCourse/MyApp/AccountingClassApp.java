//Ŭ���� ���� (����)
class Accounting {
	public static double valueOfSupply = 10000.0; //���ް�
	public static double vatRate = 0.1;//�ΰ���
	public static double expenseRate = 0.3;//������
	
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

public class AccountingClassApp {
	
	
	public static void main(String[] args) {
	
		//�޼ҵ�: �Է� ���� �ְų� ���������� �����Ͽ� ����
		double vat = Accounting.getVAT();
		double total = Accounting.getTotal();
		double expense = Accounting.getExpense();
		double income = Accounting.getIncome();
		
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		System.out.println("Value of supply : "+ Accounting.valueOfSupply); //���ް�
		System.out.println("VAT : "+ vat); //�ΰ���
		System.out.println("Total : "+ total);//�Һ��ڰ�
			
		
		System.out.println("Expense : " + expense);//���
		System.out.println("Income : " + income);//�����Ծ�
		
		System.out.println("Dividend 1 : " + dividend1);//ù��° ����
		System.out.println("Dividend 2 : " + dividend2);//�ι�° ����
		System.out.println("Dividend 3 : " + dividend3);//����° ����
		
		//another Variable, method
	}
	
	
}
