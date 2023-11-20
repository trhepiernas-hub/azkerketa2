import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double batezbestekoa = 0;
		int kount = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Sartu zenbaki bat batezbesko kalkulatzeko 0 sartzean egingo du kalkuloa");
			int temp = sc.nextInt();
			
			if (temp == 0) {
				
				System.out.println(" Baztesbekoa:" + batezbestekoa/kount);
				break;
				
			} else {
				
			batezbestekoa += temp;
			kount++;

			}
			
		}
		
		sc.close();
	}
}
