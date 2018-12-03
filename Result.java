//create separate package MethodOverRiding
package MethodOverRiding;

//create class Result
public class Result {
	
//main method
	public static void main(String[] args) {
		//create object for Bank class
		Bank Acc = new BankAccount();
		System.out.println(Acc.getInterestRate());
	}
}
