
public class Deneme {

    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    public Deneme() {
        // System.out.println("Kendi yazdığımız constructor");
        this.hesapNo = "Bilgi yok";
        this.bakiye = 0.0;
        this.isim = "Bilgi yok";
        this.telefonNo = "Bilgi yok";
        this.email = "Bilgi yok";
    }

    // @overloading
    public Deneme(String hesapNo, double bakiye, String isim, String email, String telefonNo) {
        this.bakiye = bakiye;
        this.email = email;
        this.hesapNo = hesapNo;
        this.telefonNo = telefonNo;
        this.isim = isim;

    }

    public void paraYatir(double miktar) {
        bakiye += miktar;
        //this.bakiye de yazabilirdik fakat değişkenler karışmayacağı için sorun yok.
        System.out.println("Yeni bakiye " + bakiye + " TL");
    }

    public void paraCekme(double miktar) {
        if (miktar > 1500) {
            System.out.println("Günlük çekme limiti aşıldı");
        } else if (bakiye - miktar < 0) {
            System.out.println("Yeterli bakiye yok. Bakiye = " + bakiye + " TL");
        } else {
            bakiye -= miktar;
            System.out.println("Yeni bakiye = " + bakiye + " TL ");
        }
    }

    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
