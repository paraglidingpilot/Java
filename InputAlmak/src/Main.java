
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        // int yas = scanner.nextInt();
        // double sayi = scanner.nextDouble();
        // String yazi = scanner.nextLine();
        
        
        
        if(scanner.hasNextInt()){
            int sayi = scanner.nextInt();
            System.out.println("Sayı: " + sayi);
        }
        else{
            System.out.println("Lütfen !!! Bir sayı giriniz. ");
        }
        
        
        

    }
}
