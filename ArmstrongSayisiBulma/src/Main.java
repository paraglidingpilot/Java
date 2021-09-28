
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
    Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için şu şartı
    sağlaması gerekmektedir;
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (buradaki 4 basamak sayısı)
        371 = 3^3 + 7^3 + 1^3 (buradaki 3 basamak sayısı)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz = ");
        int sayi = scanner.nextInt();
        System.out.print("Basamak sayısını giriniz = ");
        int basamak_sayisi = scanner.nextInt();

        int gecici = sayi;
        int toplam = 0;

        do {
            int basamak_degeri = gecici % 10;
            gecici /= 10;
            toplam += Math.pow(basamak_degeri, basamak_sayisi);
        } while (gecici > 0);
        
        if (sayi == toplam) {
            System.out.println("Bu bir armstrong sayısıdır.");
        } else{
            System.out.println("Bu bir armstrong sayısı değildir !");
        }

    }

}
