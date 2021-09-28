
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int islem = scanner.nextInt();
        switch (islem) {
            case 1:
                System.out.println("1.İşlem");
                break; // bitirmek için kullanıyoruz
            case 2:
                System.out.println("2.İşlem");
                break;
            case 3:
                System.out.println("3.İşlem");
                break;
            case 4:
                System.out.println("4.işlem");
                break;
            default:
                System.out.println("Geçersiz işlem");
                break;
        }
    }
}
