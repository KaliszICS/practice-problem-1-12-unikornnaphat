import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = scanner.nextInt();
        int result = num + 3;
        System.out.println(result);
        scanner.close();
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        String numStr = scanner.next();
        String concatenated = numStr + "4";
        double num = Double.parseDouble(concatenated);
        double result = num + 2;
        System.out.println(result);
        scanner.close();
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a radius: ");
        double radius = scanner.nextDouble();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println(area);
        scanner.close();
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num = scanner.nextDouble();
        double multiplied = num * 12;
        long result = (long) Math.floor(multiplied);
        System.out.println(result);
        scanner.close();
	}

}
