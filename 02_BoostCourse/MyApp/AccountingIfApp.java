
//���ް��� 10000������ ū ��� ����: �й��Ͽ� ������ �°� ����ϱ�

public class AccountingIfApp {
	public static void main(String[] args) {
		
		double valueOfSupply = 9000.0; //���ް�
		double vatRate = 0.1;//�ΰ���
		double expenseRate = 0.3;//������
		
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply-expense;
		
		double dividend1;
		double dividend2;
		double dividend3; 
		
		if(income > 10000.0) {//10000������ Ŭ ��� 
			dividend1 = income*0.5;
			dividend2 = income*0.3;
			dividend3 = income*0.2;
		}else {
			dividend1 = income*1.0;
			dividend2 = income*0;
			dividend3 = income*0;
		}
		
		System.out.println("Value of supply : "+ valueOfSupply); //���ް�
		System.out.println("VAT : "+ vat); //�ΰ���
		System.out.println("Total : "+ total);//�Һ��ڰ�
			
		
		System.out.println("Expense : " + expense);//���
		System.out.println("Income : " + income);//�����Ծ�
		
		System.out.println("Dividend 1 : " + dividend1);//ù��° ����
		System.out.println("Dividend 2 : " + dividend2);//�ι�° ����
		System.out.println("Dividend 3 : " + dividend3);//����° ����
	}
}
