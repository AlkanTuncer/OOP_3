package day039;

public class MainApp {
    public static void main(String[] args) {

        Kare kare1=new Kare(7.0);

        Dikdortgen dd1=new Dikdortgen(6,4);

        showInfo(kare1);
        showInfo(dd1);

        Sekil sekil1=new Kare(5);
        Sekil sekil2=new Dikdortgen(5,3);

        Kare k1 = (Kare) sekil1; // UNBOXING
        k1.setKenar(17);
    }


/*    public static void showInfo(Kare kare){   // static metotu static metot içinden direkt cagırabiliriz. main metoduda static!
        System.out.println("Alan : "+kare.alanHesapla());
        System.out.println("Çevre : "+kare.cevreHesapla());
    }

    public static void showInfo(Dikdortgen dikdortgen){
        System.out.println("Alan : "+dikdortgen.alanHesapla());
        System.out.println("Çevre : "+dikdortgen.cevreHesapla());
    }
    */

    public static void showInfo(Sekil sekil){
        System.out.println("Alan = " + sekil.alanHesapla());
        System.out.println("Çevre = " + sekil.cevreHesapla());
    }

}
