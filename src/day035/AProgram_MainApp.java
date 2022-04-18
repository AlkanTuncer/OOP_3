package day035;

public class AProgram_MainApp {
    public static void main(String[] args) {

        // Encapsulation --> Kodlarımızı ve verilerimizi koruma altında almak için kullanılır.
        /*
              public    : Tüm dünyanın erişimine açık.
              protected : Kendi paketi (package) ve kendisinin alt sınıflarından erişilebilir.
              private   : Sadece kendi sınıfının içinden erişilebilir.
              (default) : Aynı paket(package) içerisinden erişilebilir.
         */

        Kitap kitap1=new Kitap("Kaşağı","Ömer Seyfettin",-300);
        kitap1.setIsim("Kaşağı");        // değişkenin adını isimden adSoyad yaptık ama hala setIsım geçerli bir metot.  'Yazılan kodu korumuş oluyoruz.'
        kitap1.yazar="Ömer Seyfettin";
        kitap1.setSayfaAdedi(300);

        System.out.println(kitap1.getIsim());
        System.out.println(kitap1.getSayfaAdedi());

    }
}
