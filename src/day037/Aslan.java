package day037;

public class Aslan extends Hayvan implements Avci,Yuzucu{

    private String turu;

    public Aslan(String isim, int yas, double agirlik, String turu) {
        super(isim, yas, agirlik);
        this.turu = turu;
    }
    public Aslan(String turu) {
        this.turu = turu;
    }
    public Aslan() {
    }

    public String getTuru() {
        return turu;
    }
    public void setTuru(String turu) {
        this.turu = turu;
    }


    @Override // annotation
    public void avlan() {
        System.out.println("Aslan avlanıyor.");
    }

    @Override
    public void yuz() {
        System.out.println("Aslan yüzüyor.");
    }
}
