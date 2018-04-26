
public class Github{

	import java.util.Scanner;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte gib zwei Zahlen ein, die addiert werden sollen");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		//Fehler, der ueber git korrigiert werden soll
		System.out.printf("Das Ergebnis der Addition ist: %s",(num-num2));
		}
	
	}
