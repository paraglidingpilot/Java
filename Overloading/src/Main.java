//overloading = aşırı yükleme

public class Main {
    public static void skorHesapla(String isim,int puan){
        System.out.println(isim + " adlı oyuncunun " + puan + " puanı var.");
    }
    public static void skorHesapla(int puan){
        System.out.println("İsimsiz oyuncunun " + puan + " puanı var.");
    }
    public static void skorHesapla(String isim){
        System.out.println(isim + " isimli oyuncunun hiç puanı yok" );
    }
    //overloading
    public static void toplama(String a, String b) {
        System.out.println(a + " " + b);
    }
    //overloading 
    public static void toplama(int a, int b) {
        System.out.println("Toplamları = " + (a + b));
    }

    public static void toplama(int a, int b, int c) {
        System.out.println("Toplamları = " + (a + b + c));
    }

    public static void main(String[] args) {
        toplama(3, 4, 5);
        toplama(3, 4);
        toplama("Hakan", "Çınarel");
        skorHesapla(5);
        skorHesapla("Hakan", 100);
        skorHesapla("hakan");
    }
}
