
public class Main {

    public static void main(String[] args) {
        String a = "Merhaba";
        System.out.println(a + " Hoşgeldiniz...");

        String b = "Java ";
        String c = "Programlama ";
        String d = "Dili ";

        String toplam = b + c + d;
        System.out.println(toplam);

        String e = "Merhaba";
        int f = 35;
        String h = e + f;

        System.out.println(h);

        String i = "Merhaba";
        double j = 3.52;
        byte k = 10;

        i = i + j + k;
        System.out.println(i);

        char l = '?';
        String m = "Merhaba Nasılsınız" + l;
        System.out.println(m);

        String n = "Java "
                + "Programlama "
                + "Dili";
        
        System.out.println(n);
        
        String o = "Java\tProgramlama\tDili";
        System.out.println(o);
        
        String p = "Java\nProgramlama\nDili";
        System.out.println(p);

    }
}
