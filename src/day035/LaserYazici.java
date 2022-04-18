package day035;

public class LaserYazici {

    private final int MAKS_TONER_SEVIYESI=100;
    private final int MAKS_KAGIT_MIKTARI=500;

    private int tonerSeviyesi;
    private int kagitAdedi;
    private boolean ciftYonluBaski;


    public LaserYazici(int tonerSeviyesi, int kagitAdedi, boolean ciftYonluBaski) {
        tonerEkle(tonerSeviyesi);
        kagitYukle(kagitAdedi);
        this.ciftYonluBaski = ciftYonluBaski;
    }


    public int tonerEkle(int miktar) {
        if (miktar > 0 && miktar <= MAKS_TONER_SEVIYESI && tonerSeviyesi + miktar <= MAKS_TONER_SEVIYESI){
        tonerSeviyesi += miktar;
        }else if (tonerSeviyesi + miktar > MAKS_TONER_SEVIYESI){
            tonerSeviyesi = MAKS_TONER_SEVIYESI;
        }
        return tonerSeviyesi;
    }


    public int kagitYukle(int adet) {
        if (adet > 0 && kagitAdedi + adet <= MAKS_KAGIT_MIKTARI) {
            kagitAdedi += adet;
        }else if(kagitAdedi + adet > MAKS_KAGIT_MIKTARI){
            kagitAdedi = MAKS_KAGIT_MIKTARI;
        }
        return kagitAdedi;
    }


    public int yazdir(int sayfaAdedi){
        if (sayfaAdedi <= 0 ) return 0;
        return ciftYonluBaski ? sayfaAdedi / 2 + (sayfaAdedi % 2) : sayfaAdedi ;      // TURNARY --> şart ? true ise case1 : false ise case2
    }

}
