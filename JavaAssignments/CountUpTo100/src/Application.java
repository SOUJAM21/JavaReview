import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("Please Enter a # less than 100: ");

		Scanner s1 = new Scanner(System.in);
		int Start = s1.nextInt();

		for (int i = Start; i <= 100; i = i + 10) {
			System.out.println(i);
		}

	}
}
