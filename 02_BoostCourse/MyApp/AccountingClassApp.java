//클래스 생성 (연관)
class Accounting {
	public double valueOfSupply;//공급가
	public double vatRate;//부가세
	public double expenseRate;//비용비율
	
	public void print() {
		System.out.println("Value of supply : "+ valueOfSupply); //공급가
		System.out.println("VAT : "+ getVAT()); //부가세
		System.out.println("Total : "+ getTotal());//소비자가		
		System.out.println("Expense : " + getExpense());//비용
		System.out.println("Income : " + getIncome());//순수입액		
		System.out.println("Dividend 1 : " + getDividend1());//첫번째 배당액
		System.out.println("Dividend 2 : " + getDividend2());//두번째 배당액
		System.out.println("Dividend 3 : " + getDividend3());//세번째 배당액
	}
	
	public double getDividend1 () {
		return getIncome() * 0.5;
	}
	
	public double getDividend2 () {
		return getIncome() * 0.3;
	}
	
	public double getDividend3 () {
		return getIncome() * 0.2;
	}
	
	public double getIncome() {
		return valueOfSupply - getExpense();
	}
	
	public double getExpense() {
		return valueOfSupply * expenseRate;
	}
	
	public double getTotal () {
		return valueOfSupply * getVAT();
	}
	
	public double getVAT () {
		return valueOfSupply * vatRate;
	}
	

	
}

public class AccountingClassApp {
	public static void main(String[] args) {
		
		/*인스턴스 생성 안 할 경우
		 * 클래스를 여러개 만들어야함
		Accounting.valueOfSupply = 10000.0;
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;				
		Accounting.print();
		
		Accounting.valueOfSupply = 20000.0;
		Accounting.vatRate = 0.05;
		Accounting.expenseRate = 0.3;
		Accounting.print();
		*/
		
		//인스턴스생성: new 키워드
		//static 사용하면 안됨
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;	
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.3;	
		a2.print();
		
	}
}
