
public class Kopek extends Hayvan {

    private int dis_sayisi;

    public Kopek(int dis_sayisi, String isim, int kilo, int boy, int bacak_sayisi) {
        super(isim, kilo, boy, bacak_sayisi);
        this.dis_sayisi = dis_sayisi;
    }
    public void harekete_gec(int hız){
        System.out.println("Köpek " + hız + " ile hareket ediyor...");
    }
    public void kos(int hız){
        System.out.println("Köpek koşuyor...");
        super.harekete_gec(hız);
        harekete_gec(hız);
    }

    /**
     * @return the dis_sayisi
     */
    public int getDis_sayisi() {
        return dis_sayisi;
    }

    /**
     * @param dis_sayisi the dis_sayisi to set
     */
    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }

}
