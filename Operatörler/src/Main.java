
public class Main {

    public static void main(String[] args) {
        /*
        + toplama
        - çıkarma
        / bölme 
        * çarpma
        % kalan
         */
        System.out.println(3 + 4.2);
        System.out.println(3 - 5);
        System.out.println(10d / 4); // 10 u double şeklinde yazdık 2.5 çıkması için yoksa int olduğu için 2 çıkıyordu cevap
        System.out.println(3 * 4.5);
        System.out.println(10 % 4); // 10 un 4 ile bölümünden kalan.
        /*
        int a = 4;
        a = a + 2;
        System.out.println(a);
        int b = 6;

        b = b * 3;
        System.out.println(b);
         */
 /*
        int a = 4;
        a +=2; // a = a +2; demek 
        System.out.println(a);
        
        int b= 4;
        b *=2; // b = b * 2; 
        System.out.println(b);
         */
        System.out.println("------");
        int a = 7;
        int b = 6;
        a++; // postfix gösterim
        ++a; // prefix gösterim
        b--;
        System.out.println(a);
        System.out.println(b);
        System.out.println("---");
        // İşlem Sırası: 
        System.out.println(3f/ 4 + (4 * 5));
        System.out.println(3f/ (4 + 4) * 5);
        

    }
}
