
import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz...");
        System.out.println("***************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("***************************");

        int giris_hakki = 3;
        while (true) {
            if (login.login(hesap)) {
                System.out.println("\nGiriş Başarılı");
                break;
            } else {
                System.out.println("Giriş Başarısız !");
                giris_hakki -= 1;
                System.out.println("Giriş Hakkı = " + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("Giriş hakkınız bitti, daha sonra tekrar deneyiniz !");
                return;
            }
        }
        System.out.println("***************************");
        String islemler = "1.Bakiye Görüntüle\n"
                + "2.Para Yatırma\n"
                + "3.Para Çekme\n"
                + "Çıkış için q'ya basınız.";
        System.out.println(islemler);
        System.out.println("***************************");

        while (true) {
            System.out.print("İşlemi Seçiniz = ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz = " + hesap.getBakiye() +" TL");
            } else if (islem.equals("2")) {
                System.out.print("Yatırmak istediğiniz tutar = ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            } else if (islem.equals("3")) {
                System.out.print("Çekmek istediğiniz tutar = ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            } else {
                System.out.println("Geçersiz işlem !");
            }
        }

    }
}
