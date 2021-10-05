
public class Yönetici extends Calisan{

    private int sorumlu_kisi_sayisi;

    public Yönetici(int sorumlu_kisi_sayisi, String ad, String soyad, int id) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Sorumlu kişi sayısı = " + sorumlu_kisi_sayisi);
    }
    
    public void zamYap(int zamMiktarı){
        System.out.println(getAd() + " çalışanlara " + zamMiktarı + " zam yapıyor...");
    }
    

}
