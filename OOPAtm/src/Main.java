
public class Main {
    
    public static void main(String[] args) {
        // OOP Atm Programı
        // Login Class'ı Kullanıcı girişini kontrol edecek.
        // Hesap Class'ı Hesap işlemlerini kontrol edecek.
        // Atm ise Atm'mizi çalıştıracak.
        ATM atm1 = new ATM();
        Hesap hesap = new Hesap("Hakan","12345",2000);
        atm1.calis(hesap);
        System.out.println("Programdan çıkılıyor");
        
    }
}
