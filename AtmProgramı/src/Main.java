
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.İşlem: Bakiye Öğrenme\n"
                + "2.İşlem: Para Çekme\n"
                + "3.İşlem: Para Yatırma\n"
                + "Çıkış için q'a basınız...";
        System.out.println("***********************************");
        System.out.println(islemler);
        System.out.println("***********************************");
        while (true) {
            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Bakiyeniz = " +bakiye +"TL\n");
            } else if (islem.equals("2")) {
                System.out.print("Çekmek istediğiniz tutar = ");
                int tutar = scanner.nextInt();
                scanner.nextLine(); 
                // scannernextIntten sonra scannernextline geldiği için boşluk
                if (bakiye - tutar < 0) {
                    System.out.println("Yeterli bakiye yok.\n"
                            + "Bakiyeniz = " + bakiye);
                } else {
                    bakiye -= tutar;
                    System.out.print("İşleminiz gerçekleştirildi.\n"
                            + "Yeni bakiyeniz = " + bakiye + "\n");
                }
            } else if (islem.equals("3")) {
                    System.out.print("Yatırmak istediğiniz tutar = ");
                    int tutar = scanner.nextInt();
                    scanner.nextLine();
                    bakiye += tutar;
                    System.out.println("İşleminiz gerçekleştirildi.\n"
                            + "Yeni bakiyeniz = " + bakiye);
                    
            } else {
                System.out.println("Geçersiz işlem !!!");
                System.out.println(islemler);
            }

        }
    }
}
