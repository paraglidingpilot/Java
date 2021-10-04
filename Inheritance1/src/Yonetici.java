
public class Yonetici extends Calisan { // Sub Class 

    private int sorumlu_kisi; // ekstra özellik

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
        super(isim, maas, departman);
        this.sorumlu_kisi = sorumlu_kisi;
        // private olduğu için miras aldığın constructor kullanmak için
    }
    public void zam_yap(int zam_miktari){
        System.out.println("Çalışanlara " + zam_miktari + " TL zam yapıldı.");
    }
    //overriding
    public void bilgileriGoster() {
        /*
        System.out.println("İsim = " + getIsim());
        System.out.println("Maaş = " + getMaas());
        System.out.println("Departman = " + getDepartman());
        System.out.println("Sorumlu kişi sayısı = " + this.sorumlu_kisi);
        */
        super.bilgileriGoster();
        System.out.println("Sorumlu kişi sayısı = " + this.sorumlu_kisi);

    }
}
