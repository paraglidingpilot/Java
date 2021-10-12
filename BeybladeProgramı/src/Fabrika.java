
public class Fabrika {
    public Beyblade beybladeUret(String beylade_turu){
        if (beylade_turu.equals("Dragon")) {
            return new Dragon("Mavi Ejderha", "Kutsal canavar ile konuşma", "Takao", 800, 300);
        } else if (beylade_turu.equals("Dranza")) {
            return new Dranza("Kırmızı Anka Kuşu", "Kai", 600, 400);
        } else if (beylade_turu.equals("Drayga")) {
            return new Drayga("Beyaz Kaplan", "Rei", 800, 250);
        } else if (beylade_turu.equals("Draciel")) {
            return new Draciel("Kara Kaplumbağa", "Max", 400, 1000);
        } else {
            return null;
        }
    }
}
