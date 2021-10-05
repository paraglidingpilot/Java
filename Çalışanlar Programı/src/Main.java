
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar programına hoşgeldiniz.");
        String islemler = "İşlemler...\n"
                + "1.Yazılımcı İşlemleri\n"
                + "2.Yönetici İşlemleri\n"
                + "Çıkış için q'ya basınız...";
        System.out.println("***********************************");
        System.out.println(islemler);
        System.out.println("***********************************");

        while (true) {
            System.out.print("İşlemi Seçiniz = ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("***********************************");
                System.out.println("Programdan çıkılıyor");
                break;
            } else if (islem.equals("1")) {
                Yazılımcı yazilimci = new Yazılımcı("Hakan", "Çınarel", 856, "C,C++,Java");
                String yazilimci_islemler = "\nYazılımcı İşlemleri\n"
                        + "1.Format At\n"
                        + "2.Bilgileri Göster\n"
                        + "Çıkış için q'ya basınız";
                System.out.println(yazilimci_islemler);
                while (true) {
                    System.out.print("İşlemi seçiniz = ");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.print("İşletim Sistemi = ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    } else {
                        System.out.println("Geçersiz işlem !!!");
                    }
                }
            } else if (islem.equals("2")) {
                Yönetici yonetici = new Yönetici(50, "Canan", "Gümüşsoy", 232);
                String yonetici_islem = "\nYönetici İşlemleri\n"
                        + "1.Zam Yap\n"
                        + "2.Bilgileri Göster\n"
                        + "Çıkış için q'ya basınız...";
                System.out.println(yonetici_islem);
                while (true) {
                    System.out.print("İşlem Seçiniz = ");
                    String y_islem = scanner.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.print("Zam miktarı = ");
                        int zam = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam);

                    } else if (y_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    } else {
                        System.out.println("Geçersiz işlem !!!");
                    }
                }
            } else {
                System.out.println("Geçersiz işlem !!!");
            }

        }

    }
}
