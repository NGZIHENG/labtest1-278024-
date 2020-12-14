package labtest1;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		/*Qustion 1*/
		double total=0.00;
		double discount=0.00;
		
		int numofitems;
		System.out.print("Enter the number of items: ");
		numofitems = scan.nextInt();
		
		if (numofitems<=1) {
			System.out.print("Enter price of first item: RM");
			double price1=scan.nextDouble();
			System.out.print("Enter quantity of first item: ");
			int quantity1=scan.nextInt();
			System.out.println(" ");
			double sum1= price1 * quantity1;
			total= sum1;
		}
		
		else if(numofitems<=2) {
			System.out.print("Enter price of first item: RM");
			double price1=scan.nextDouble();
			System.out.print("Enter quantity of first item: ");
			int quantity1=scan.nextInt();
			System.out.println(" ");
			System.out.print("Enter price of second item: RM");
			double price2=scan.nextDouble();
			System.out.print("Enter quantity of second item: ");
			int quantity2=scan.nextInt();
			System.out.println(" ");
			double sum1= price1 * quantity1;
			double sum2= price2 * quantity2;
			total= sum1+sum2;
		}
		
		else if(numofitems<=3) {
			System.out.print("Enter price of first item: RM");
			double price1=scan.nextDouble();
			System.out.print("Enter quantity of first item: RM");
			int quantity1=scan.nextInt();
			System.out.println(" ");
			System.out.print("Enter price of second item: RM");
			double price2=scan.nextDouble();
			System.out.print("Enter quantity of second item: ");
			int quantity2=scan.nextInt();
			System.out.println(" ");
			System.out.print("Enter price of third item: RM");
			double price3=scan.nextDouble();
			System.out.print("Enter quantity of third item: ");
			int quantity3=scan.nextInt();
			System.out.println(" ");
			double sum1= price1 * quantity1;
			double sum2= price2 * quantity2;
			double sum3= price3 * quantity3;
			total=sum1+sum2+sum3;
		}
		
		System.out.println("Total Price: RM" + total);
		
		if (total<100) {
			discount = total * 10/100;
		}
		
		else if (total>100) {
			discount = total * 20/100;
		}
		
		System.out.println("Discount Received: RM" + discount);
		double pricetopaid= total - discount;
		System.out.println("Price to be paid: RM" + pricetopaid);
		

	}

}
