package day035;

public class Kitap {

    private String adSoyad;
    public String yazar;
    private int sayfaAdedi;

    public Kitap(String adSoyad, String yazar, int sayfaAdedi) {
        this.adSoyad = adSoyad;
        this.yazar = yazar;
        setSayfaAdedi(sayfaAdedi);
    }


    public void setSayfaAdedi(int sayfaAdedi) {
        if (sayfaAdedi>0){                        // Verimizi korumuş olduk. İlerde farklı bir yöntem kullanıcaz.
            this.sayfaAdedi = sayfaAdedi;
        }
    }
    public int getSayfaAdedi() {
        return sayfaAdedi;
    }


    public String getIsim() {
        return adSoyad;
    }
    public void setIsim(String isim) {
        this.adSoyad = isim;
    }


}
