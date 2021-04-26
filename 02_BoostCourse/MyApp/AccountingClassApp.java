//클래스 생성 (연관)
class Accounting {
	public static double valueOfSupply = 10000.0; //공급가
	public static double vatRate = 0.1;//부가세
	public static double expenseRate = 0.3;//비용비율
	
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
	
		//메소드: 입력 값을 넣거나 전역변수로 지정하여 실행
		double vat = Accounting.getVAT();
		double total = Accounting.getTotal();
		double expense = Accounting.getExpense();
		double income = Accounting.getIncome();
		
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		System.out.println("Value of supply : "+ Accounting.valueOfSupply); //공급가
		System.out.println("VAT : "+ vat); //부가세
		System.out.println("Total : "+ total);//소비자가
			
		
		System.out.println("Expense : " + expense);//비용
		System.out.println("Income : " + income);//순수입액
		
		System.out.println("Dividend 1 : " + dividend1);//첫번째 배당액
		System.out.println("Dividend 2 : " + dividend2);//두번째 배당액
		System.out.println("Dividend 3 : " + dividend3);//세번째 배당액
		
		//another Variable, method
	}
	
	
}
