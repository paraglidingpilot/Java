
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        if(koşul){
        Koşul sağlanınca(true) bu blok çalışır.
        }
        else{
         Bu bloğun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışır.
        }
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz = ");
        /*
        int yas = scanner.nextInt();
        if (yas <18) {
            System.out.println("!!! 18 yaşından küçükler bu mekana giremez !!! ");
        } else {
            System.out.println("Hoşgeldiniz.");
        }
         */
        int sayi = scanner.nextInt();
        if (sayi < 0) {
            System.out.println("Sayı negatif");
        }
        else if (sayi == 0) {
            System.out.println("Sayı 0");
        } else {
            System.out.println("Sayı pozitif");
        }

    }
}
