import java.util.Scanner;

public class Q_4_23_Darpino {

	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.print("Enter Employee's name:");
		String name = input.next();
		
		System.out.print("Enter number of hours worked:");
		double hoursWorked = input.nextDouble();
		
		System.out.print("Enter hourly pay rate:");
		double hourlyRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate:");
		double fedTaxWithholdingRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate:");
		double stateTaxWithholdingRate = input.nextDouble();
		
		
		//Calculations
		double grossPay = hourlyRate * hoursWorked; // calculate gross pay
		
		double fedWithholding = grossPay * fedTaxWithholdingRate; // calculate federal tax withholding 
		
		double stateWithholding = grossPay * stateTaxWithholdingRate; // calculate state tax withholding rates
		
		double totalDeduction = fedWithholding + stateWithholding; // calculate the total deduction
		
		double netPay = grossPay - totalDeduction; // calculate net pay
		
		//Display results 
		System.out.println("Employee name: " + name);
		
		System.out.println("Hours Worked: " + hoursWorked);
		
		System.out.println("Pay Rate: $" + hourlyRate);
		
		System.out.println("Gross pay: $" + grossPay);
		
		System.out.println("Deductions: ");
		
		System.out.println("\tFed Withholding (" + fedTaxWithholdingRate*100 + "%): " + fedWithholding);
		
		System.out.println("\tState Withholding (" + stateTaxWithholdingRate*100 + "%): " + stateWithholding);
		
		System.out.println("\tTotal Deduction: $" + totalDeduction);
		
		System.out.println("Net Pay: $" + netPay);

	}

}
