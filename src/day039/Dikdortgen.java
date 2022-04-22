package day039;

public class Dikdortgen extends Sekil{

    private double genislik;
    private double yukseklik;

    public Dikdortgen(double genislik, double yukseklik) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
    }

    @Override
    double alanHesapla() {
        return genislik*yukseklik;
    }

    @Override
    double cevreHesapla() {
        return 2*(genislik+yukseklik);
    }
}
