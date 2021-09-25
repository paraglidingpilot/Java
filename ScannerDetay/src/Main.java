
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int yas = scanner.nextInt();
        scanner.nextLine(); // Dummy 1.Veriyi verdikten sonra enter a basınca programı sonlandırmasın 2. veriyi de alsın diye yaptık
        String isim = scanner.nextLine();
        // Eğer isim değerini yaş değerinden önce alsaydık Dummy e gerek duymazdık.
        System.out.println("Yaş : " + yas);
        System.out.println("İsim : " + isim);
         */
        
        int yas1 = scanner.nextInt();
        int yas2 = scanner.nextInt();
        int yas3 = scanner.nextInt();
        System.out.println("Yaş 1: " + yas1);
        System.out.println("Yaş 2: " + yas2);
        System.out.println("Yaş 3: " + yas3);
    }
}
