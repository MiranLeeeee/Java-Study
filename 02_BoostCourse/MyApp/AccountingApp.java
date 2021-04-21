
public class AccountingApp {
	public static void main(String[] args) {
		
		System.out.println("Value of supply : "+ 10000.0); //공급가
		System.out.println("VAT : "+ (10000.0*0.1)); //부가세
		System.out.println("Total : "+ (10000.0 + 10000.0*0.1));//소비자가
		
		System.out.println("Expense : " + (10000.0*0.3));//비용
		System.out.println("Income : " + (10000.0-10000.0*0.3));//순수입액
		
		System.out.println("Dividend 1 : " + (10000.0-10000.0*0.3)*0.5);//첫번째 배당액
		System.out.println("Dividend 2 : " + (10000.0-10000.0*0.3)*0.3);//두번째 배당액
		System.out.println("Dividend 3 : " + (10000.0-10000.0*0.3)*0.2);
	}
}
