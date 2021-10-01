
public class Hesap {

    private String kullanici_adi;
    private String parola;
    private int bakiye;

    public Hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void paraYatir(int Tutar) {
        this.bakiye += Tutar;
        System.out.println("Yeni bakiyeniz = " + bakiye + " TL");
    }

    public void paraCek(int tutar) {
        if (bakiye - tutar < 0) {
            System.out.println("Yeterli bakiyeniz yok.");
            System.out.println("Bakiye = " + bakiye + " TL");
        } else {
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz = " + bakiye + "TL");
        }
    }

    /**
     * @return the kullanici_adi
     */
    public String getKullanici_adi() {
        return kullanici_adi;
    }

    /**
     * @param kullanici_adi the kullanici_adi to set
     */
    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    /**
     * @return the parola
     */
    public String getParola() {
        return parola;
    }

    /**
     * @param parola the parola to set
     */
    public void setParola(String parola) {
        this.parola = parola;
    }

    /**
     * @return the bakiye
     */
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
}
