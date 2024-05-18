import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total = 50.0;
		int minutes = sc.nextInt();
			
		if (minutes > 100) {
			total += (minutes - 100) * 2.0;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", total);		
		
		sc.close();
	}
}
