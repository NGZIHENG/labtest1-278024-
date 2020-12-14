package labtest1;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double sales=0.00;
		int hours;
		double commission=0.00;
		
		System.out.print("Enter Sales: RM");
		sales=scan.nextDouble();
		System.out.print("Enter hours worked: ");
		hours=scan.nextInt();
		
		if (sales>=150.00 && sales <=300.00) {
			commission = sales * 5/100;
		}
		else if (sales>=301.00 && sales <=500.00) {
			commission = sales * 10/100;
		}
		else if (sales>500.00) {
			commission = sales * 15/100;
		}
		
		System.out.println("Commission :RM" + commission);
		
		double hourlywages = hours * 5;
		double dailywages = commission + hourlywages;
		
		System.out.println("Daily Wages :RM" + dailywages);
		
		
		
	

	}

}
