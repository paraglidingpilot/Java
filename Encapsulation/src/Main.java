    
public class Main {
    public static void main(String[] args) {
        /*
        Abone abone = new Abone();
        abone.isim = "Hakan Çınarel";
        abone.bakiye = 200;
        abone.sehir = "İzmir";
        
        abone.dogalgaz_kullan(200);
        */
        GelismisAbone abone = new GelismisAbone("Hakan", 200, "İzmir");
        abone.bakiye_ogren();

    }
}
