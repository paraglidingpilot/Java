
public class Main {
    public static void main(String[] args) {
        // Char veri tipi : Karakterleri göstermek için kullanılır. 2 byte yer kaplar ve 2^16 tane karakter simgelenebilir.
        // Boolean veri tipi : Koşul durumlarında kullanılır. True veya false değeri alır.
        
        char a = 'A';
        char b = 'B';
        char c = 1000;
        char d = '\u00C4'; // unicode table U+00C4
        char e = '\u00FF'; // U+00FF
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
        System.out.println("------------");
        boolean f = true;
        boolean g = false;
        System.out.println(f);
        System.out.println(g);
    }
}
