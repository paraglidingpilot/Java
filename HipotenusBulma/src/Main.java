
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Birinci kenar = ");
        a = scanner.nextInt();
        System.out.print("İkinci kenar = ");
        b = scanner.nextInt();

        double h = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenüs = " + h);

    }
}
