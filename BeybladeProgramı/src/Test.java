
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        System.out.println("Beyblade Programına Hoşgeldiniz");
        System.out.println("Çıkış için q'ya basınız..");
        Scanner scanner = new Scanner(System.in);
        
        while (true) {            
            System.out.print("Hangi beyblade üretmek istiyorsunuz ? ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            } else {
                Fabrika fabrika = new Fabrika();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                
                if (beyblade == null) {
                    System.out.println("Lütfen geçerli bir beyblade giriniz..");
                } else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarortayaCikar();
                }
            }
        }
    }
}
