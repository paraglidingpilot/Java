
public class Main {

    public static void main(String[] args) {
        int a = 4; // -2^31 ile 2^31-1 değeri arası 
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println("------------------");
        byte b = 100;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println("------------------");

        short c = 100;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println("------------------");

        long d = 100;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // byte > short > int > long
        System.out.println("---- Dönüştürme ----");

        byte e = 100;
        byte f = (byte) (e / 2);
        System.out.println(f);

        System.out.println("---- Dönüştürme 2 ----");
        
        short g = 100;
        byte j =2;
        int k = 4;
        long x = g + j + k;
        System.out.println(x);

    }
}
