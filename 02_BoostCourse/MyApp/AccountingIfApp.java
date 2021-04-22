
//공급가가 10000원보다 큰 경우 실행: 분배하여 비율에 맞게 배당하기

public class AccountingIfApp {
	public static void main(String[] args) {
		
		double valueOfSupply = 9000.0; //공급가
		double vatRate = 0.1;//부가세
		double expenseRate = 0.3;//비용비율
		
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply-expense;
		
		double dividend1;
		double dividend2;
		double dividend3; 
		
		if(income > 10000.0) {//10000원보다 클 경우 
			dividend1 = income*0.5;
			dividend2 = income*0.3;
			dividend3 = income*0.2;
		}else {
			dividend1 = income*1.0;
			dividend2 = income*0;
			dividend3 = income*0;
		}
		
		System.out.println("Value of supply : "+ valueOfSupply); //공급가
		System.out.println("VAT : "+ vat); //부가세
		System.out.println("Total : "+ total);//소비자가
			
		
		System.out.println("Expense : " + expense);//비용
		System.out.println("Income : " + income);//순수입액
		
		System.out.println("Dividend 1 : " + dividend1);//첫번째 배당액
		System.out.println("Dividend 2 : " + dividend2);//두번째 배당액
		System.out.println("Dividend 3 : " + dividend3);//세번째 배당액
	}
}
