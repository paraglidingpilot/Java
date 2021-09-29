
public class Main {

    public static int deneme(int a) {
        System.out.println("Çıktı");
        return a * 2;
    }

    public static int toplama(int a, int b, int c) {
        // System.out.println(a+b+c);
        return (a + b + c);
    }

    public static int ikiİlecarp(int a) {
        return a * 2;
    }

    public static int ikiİletopla(int a) {
        return a + 2;
    }

    public static int dortilecarp(int a) {
        return a * 4;
    }

    public static void main(String[] args) {
        //return fonksiyondan çıktı almak için kullanıyoruz.
        System.out.println("Çıktı değeri = " + toplama(1, 2, 3));

        System.out.println("Çıktı = " + dortilecarp(ikiİletopla(ikiİlecarp(8))));
    }
}
