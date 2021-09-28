
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz. Faiz Oranı %6");
        int ana_para, vade;
        System.out.print("Yatırmak istediğiniz tutar = ");
        ana_para = scanner.nextInt();
        System.out.print("Paranızı kaç yıl vadeli yatırmak istiyorsunuz = ");
        vade = scanner.nextInt();

        double toplam = ana_para;
        double faiz_oranı = 0.06;
        for (int i = 1; i <= vade; i++) {
            toplam = (toplam * faiz_oranı) + toplam;
            System.out.println(i + " yılın sonunda toplam paranız =  " + toplam + " TL ");
        }

    }
}
