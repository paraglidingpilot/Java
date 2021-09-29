
public class Main {
    public static void toplama(int a,int b, int c){
        System.out.println("Toplamları = " + (a+b+c));
    }
    public static void selamlama(String ad){
        
        System.out.println("Selamlar " + ad);
    }
    public static void main(String[] args) {
        selamlama("Hakan");
        toplama(1, 21, 3);
    }
}
