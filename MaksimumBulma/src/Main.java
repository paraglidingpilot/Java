
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kullanıcıdan alınan 3 sayıdan En büyük sayıyı bulma;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayı : ");
        int a = scanner.nextInt();
        System.out.print("İkinci Sayı : ");
        int b = scanner.nextInt();
        System.out.print("Üçüncü Sayı : ");
        int c = scanner.nextInt();

        int maks = -1; // -1 in bir anlamı yok
        if (a >= b && a >= c) {
            maks = a;
        } else if (b >= a && b >= c) {
            maks = b;
        } else {
            maks = c;
        }
        System.out.println("Maksimum sayı = " + maks);
        
    }
}
