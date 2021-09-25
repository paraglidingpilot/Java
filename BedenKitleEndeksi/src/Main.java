
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Beden kitle indeksi : Kilo / Boy(m) * Boy(m)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz = ");
        int kilo = scanner.nextInt();
        System.out.print("Boyunu giriniz (Örnek: 1,72) = ");
        double boy = scanner.nextDouble();
        
        double endeks = kilo / (boy * boy);
        System.out.println("Beden kitle endeksiniz = " +endeks);
        
        
    }
}
