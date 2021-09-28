
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        /*
        int i = 0;
        while(i<20){
            if (i == 10) {
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
         */
        
        /*
        Scanner scanner = new Scanner(System.in);
        while (true) {  
            System.out.print("Sayi = ");
            int islem = scanner.nextInt();
            if (islem == -1) {
                System.out.println("Döngüden çıkıldı");
                break;
                
            }
            System.out.println("İşlem = " + islem);
        }
        */
        /*
         for (int i = 0; i < 10; i++) {
            if (i == 3 || i ==5) {
                continue;
            }
            System.out.println("i = " + i);
        }
        */
        int i = 0;
        while (i<10) {          
            if (i == 3 || i ==5) {
                i++;
                continue; // sonsuz döngüye dikkat
            }
            System.out.println("i = " +i);
            i++;
        }
       
        
        
        
    }
}
