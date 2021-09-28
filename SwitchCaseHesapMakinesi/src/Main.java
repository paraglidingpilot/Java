
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************");
        String islemler = "1.Toplama İşlemi\n"
                + "2.Çıkarma İşlemi\n"
                + "3.Çarpma İşlemi\n"
                + "4.Bölme İşlemi";
        
        System.out.println(islemler);
        System.out.println("*******************");
        
        System.out.print("İşlemi Seçiniz :");
        String islem= scanner.nextLine();
        int a;
        int b;
        
        switch(islem){
            case "1":
                System.out.print("1.Sayı = ");
                a = scanner.nextInt();
                System.out.print("2.Sayı = ");
                b = scanner.nextInt();
                System.out.println("Toplam = " + (a+b));
                break;
            case "2":
                System.out.print("1.Sayı = ");
                a = scanner.nextInt();
                System.out.print("2.Sayı = ");
                b = scanner.nextInt();
                System.out.println("Sonuç = " + (a-b));
                break;
            case "3":
                System.out.print("1.Sayı = ");
                a = scanner.nextInt();
                System.out.print("2.Sayı = ");
                b = scanner.nextInt();
                System.out.println("Sonuç = " + (a*b));
                break;
            case "4":
                System.out.print("1.Sayı = ");
                a = scanner.nextInt();
                System.out.print("2.Sayı = ");
                b = scanner.nextInt();
                System.out.println("Sonuç = " + ((double)a/b)); // Girilen sonucu tam göstermek için
                break;
            default:
               System.out.print("Geçersiz işlem");
        }
    }
}
