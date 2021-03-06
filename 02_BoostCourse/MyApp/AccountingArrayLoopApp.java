
public class AccountingArrayLoopApp {
	public static void main(String[] args) {
		
		double valueOfSupply = 10000.0; //공급가
		double vatRate = 0.1;//부가세
		double expenseRate = 0.3;//비용비율
		
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply-expense;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income*dividendRates[0];
		double dividend2 = income*dividendRates[1];
		double dividend3 = income*dividendRates[2];
		
		System.out.println("Value of supply : "+ valueOfSupply); //공급가
		System.out.println("VAT : "+ vat); //부가세
		System.out.println("Total : "+ total);//소비자가
			
		
		System.out.println("Expense : " + expense);//비용
		System.out.println("Income : " + income);//순수입액
		
		int i = 0;
		while(i<dividendRates.length) {
			System.out.println("Dividend "+(i+1)+":"+ (dividendRates[i]*income));
			i = i+1;
		}
	}
}
