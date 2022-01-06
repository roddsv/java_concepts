package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = scan.nextInt();
				
		for (int i = 0; i < n; i++) {
			String value = scan.next();
			ps.addValue(value);
		}
		
		ps.print();
		String x = ps.first();
		System.out.println("First: " + ps.first());
		
		scan.close();

	}

}
