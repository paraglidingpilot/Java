
public class GelismisAbone {

    private String abone_isim;
    private int bakiye = 120;
    private String sehir;

    public GelismisAbone(String isim, int bakiye, String sehir) {
        this.abone_isim = isim;
        this.sehir = sehir;
        if (bakiye >= 0 && bakiye <= 120) {
            this.bakiye = bakiye;
        }
    }

    public void dogalgaz_kullan(int miktar) {
        if (this.bakiye - miktar < 0) {
            System.out.println("Yeterli bakiye yok !");
        } else {
            this.bakiye -= miktar;
            if (this.bakiye <= 0) {
                System.out.println("Bakiyeniz bitmiştir. Lütfen en yakın abone"
                        + " merkezine giderek kredi yükleyin."
                        + " Kredi Limiti = 120 TL");

            } else {
                System.out.println("Yeni bakiye = " + bakiye);
            }
        }
    }

    public void bakiye_ogren() {
        System.out.println("Bakiye = " + bakiye);
    }

}
