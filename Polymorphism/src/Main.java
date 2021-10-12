
class Hayvan {

    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan konuşuyor";
    }
}

class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor";
    }

}
class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor";
    }
    
}
class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyor";
    }
    
}
public class Main {
    
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }

    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan("Limon");
        System.out.println(hayvan.konus());
        
        Hayvan hayvan1 = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Karabaş");
        Hayvan hayvan3 = new At("Şahbatur");
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());
        
        System.out.println("**********************************************");
        
        konustur(new Kedi("Beyaz"));
        konustur(new Kopek("Kuçu kuçu"));
        konustur(new At("Gürbatur"));
    }
}
