
public class Monitor {
    private String model;
    private String uretici;
    private String boyut;
    private Resolution resolution; // composition

    public Monitor(String model, String uretici, String boyut, Resolution resolution) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }
    public void monitoru_kapat(){
        System.out.println("Monitör kapatılıyor...");
    }
}
