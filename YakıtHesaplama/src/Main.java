
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aracınızın kilometre'de kaç kuruş yaktığını yazınız (Örnek: 0,32) =");
        double kurus = scanner.nextDouble();

        System.out.print("Aracınız ile kaç kilometre gittiniz = ");
        int km = scanner.nextInt();

        System.out.println("Toplam ödemeniz gereken tutar = " + (kurus * km) + " tl dir. ");

    }
}
