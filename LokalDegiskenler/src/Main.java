
public class Main {

    public static void toplama(int x, int y, int z) {
        int deneme = 10;
        System.out.println("Toplam = " + (x + y + z));
    }

    public static void main(String[] args) {
        int a = 4;
        String yazdir = "Merhaba";
        if (a < 10) {
            int b = 5;
            System.out.println(yazdir);
        }
        // System.out.println(b);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // System.out.println(i);
        int i = 1;
        while (i < 10) {
            if (i % 2 == 0) {
                yazdir = "Çift";
                System.out.println(yazdir);
            }
            i++;
        }
        toplama(10, 20, 30);
        // System.out.println(x);
        // System.out.println(deneme);
    }
}
