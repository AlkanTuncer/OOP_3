package day038;

public class Kitap implements Comparable {

    private String adi;
    private String yazari;
    private int sayfaAdedi;

    public Kitap(String adi, String yazari, int sayfaAdedi) {
        this.adi = adi;
        this.yazari = yazari;
        this.sayfaAdedi = sayfaAdedi;
    }
    public Kitap() {
    }

    public String getAdi() {
        return adi;
    }
    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYazari() {
        return yazari;
    }
    public void setYazari(String yazari) {
        this.yazari = yazari;
    }

    public int getSayfaAdedi() {
        return sayfaAdedi;
    }
    public void setSayfaAdedi(int sayfaAdedi) {
        this.sayfaAdedi = sayfaAdedi;
    }


    @Override
    public String toString() {
        return "Kitap{" + "Adı = '" + adi + '\'' + ", Yazarı = '" + yazari + '\'' + ", Sayfa Adedi = " + sayfaAdedi + '}';
    }


    @Override
    public int compareTo(Object o) {
        Kitap k = (Kitap) o;
        // KİTAP NESNELERİNİ SAYFA ADEDİNE GÖRE SIRALAMA - Küçükten Büyüğe
        return this.getSayfaAdedi() < k.getSayfaAdedi() ? -1 : this.getSayfaAdedi() == k.getSayfaAdedi() ? 0 : 1  ;
        // Kitabın adına göre sıralama
        // return getAdi().compareTo(k.getAdi());
    }

}
