//클래스 생성 (연관)
class Accounting {
	public static double valueOfSupply;//공급가
	public static double vatRate;//부가세
	public static double expenseRate;//비용비율
	
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
	
	public static double getDividend1 () {
		return getIncome() * 0.5;
	}
	
	public static double getDividend2 () {
		return getIncome() * 0.3;
	}
	
	public static double getDividend3 () {
		return getIncome() * 0.2;
	}
	
	public static void print() {
		System.out.println("Value of supply : "+ valueOfSupply); //공급가
		System.out.println("VAT : "+ getVAT()); //부가세
		System.out.println("Total : "+ getTotal());//소비자가		
		System.out.println("Expense : " + getExpense());//비용
		System.out.println("Income : " + getIncome());//순수입액		
		System.out.println("Dividend 1 : " + getDividend1());//첫번째 배당액
		System.out.println("Dividend 2 : " + getDividend2());//두번째 배당액
		System.out.println("Dividend 3 : " + getDividend3());//세번째 배당액
	}
}

public class AccountingClassApp {
	public static void main(String[] args) {
		Accounting.valueOfSupply = 10000.0;
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
				
		Accounting.print();
		
		//another Variable, method......
	}
}
