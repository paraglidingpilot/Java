
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("**********");
        
        for(int j = 0; j < 5; j++){
            System.out.println("j = " +j);
        }
        System.out.println("**********");
        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " +i);
        }
        int k = 0;
        for (; k < 10; k++) {
            System.out.println("Java" + k);
        }
        
        int i = 0;
        int j = 10;
        for (;  i< 10 && j>0; i++,j--) {
            System.out.println("i = " + i + " j = " + j);
        }
        
        for (i = 2; i < 100; i*= 2) {
            System.out.println("i = " + i);
        }
        
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int faktoriyel = 1;
        int sayi = scanner.nextInt();
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        System.out.println("Faktoriyel = " + faktoriyel);
    }
}
