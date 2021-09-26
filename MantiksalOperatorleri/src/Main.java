
public class Main {

    public static void main(String[] args) {
        /*
        Mantıksal Operatörler 
            && --> and operatörü
        Bütün sonuçlar kendi içinde true ise genel sonuç true;
        en az birisi bile false ise genel sonuç false olur.
        
            || --> or Operatörü
        Sonuçlardan en az birisi bile true ise genel sonuç true,
        hepsi false ise genel sonu false olur.
        
            ! --> not Operatörü 
         */
        
        System.out.println(3 == 3);
        System.out.println(2 > 3);
        System.out.println(3 == 3 && 2 > 3);
        System.out.println(3 == 3 || 2 > 3);
        System.out.println("---");
        System.out.println(! false);
        System.out.println(! (3 < 4));
        System.out.println("---");
        System.out.println(!((3 < 4 && "Murat" == "Murat") || 3.4 > 2.1) );

    }
}
