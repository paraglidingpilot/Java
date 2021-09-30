
public class Main {
    public static void main(String[] args) {
        Deneme deneme1 = new Deneme();
        
        // System.out.println(deneme1.getEmail());
         
        Deneme deneme2 = new Deneme("Ahmet Can", "Exap@gmail.com","5558456");
        //System.out.println(deneme2.getEmail());
        // System.out.println(deneme2.getBakiye());
        deneme2.bilgileriGoster();
        
    }
}
