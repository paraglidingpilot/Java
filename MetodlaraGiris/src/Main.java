
import java.util.Scanner;


public class Main {
    public static void selamlama(){
        System.out.println("Merhaba Nasılsınız ? ");
        System.out.println("Selamlar...");
    }
    public static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi = scanner.nextInt();
        int faktoriyel= 1;
        while (sayi >0) {            
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Faktoriyel sonucu = " + faktoriyel);
    }
    public static void main(String[] args) {
        // Erişim_Belirleyici(opsiyonel) Ekstra_Özellikler Dönüş_Tipi Fonksiyon_Adı(Parametreler)
        selamlama();
        faktoriyel();
    }
}
