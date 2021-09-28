
public class Main {
    public static void main(String[] args) {
        System.out.println("Çarpım Tablosu");
        for (int i = 0; i <= 10; i++) {
            
            System.out.println("***********************************");
            for (int j = 0; j <= 10; j++) {
                System.out.print("i = " + i + " j = " + j + "\t");
                
                System.out.println("Çarpım = " + (i*j));
                
            }
            
        }System.out.println("***********************************");
    }
}
