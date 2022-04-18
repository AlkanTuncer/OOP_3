package day035;

public class MainApp {
    public static void main(String[] args) {

        LaserYazici yazici=new LaserYazici(50,100,true);

        System.out.println("Toner Seviyesi : " + yazici.tonerEkle(20)); // 50 + 20
        System.out.println("Toner Seviyesi : " + yazici.tonerEkle(35)); // 70 + 35

        System.out.println("Kağıt Miktarı : " + yazici.kagitYukle(150));  // 100 + 150
        System.out.println("Kağıt Miktarı : " + yazici.kagitYukle(300));  // 250 + 300

        System.out.println("Yazdırılan Kağıt Miktari : " + yazici.yazdir(53));

    }
}
