package day037;

public class MainApp {
    public static void main(String[] args) {

        /*
            SOYUT SINIFLAR (abstract) : -Örnekleri oluşturulamaz. Kalıtım yoluyla (extends) alt sınıf oluşturulabilir.
                                        -İçerisinde gövdeli ve gövdesiz metotlar bulunabilir.
                                        -Gövdesiz metotlar, alt sınıfa ne yapması gerektiğini söyler ama nasıl yapması gerektiğini söylemez.
         */

        /*
            INTERFACE (Arayüz/Konsol) : -Çok biçimliliği sağlamak için kullanılan sınıf benzeri yapılardır.
                                        -Gövdeli metotları bulunmaz. Yani bütün metotları abstract 'tır.
                                        -Kendisini implemente (uygulayacak,gerçekleştirecek) edecek alt sınıflara ne yapacaklarını
                                        bildiriyor ama nasıl yapacaklarına karışmıyor.
         */


        Hayvan hayvan1=new Hayvan("Köpek",5,12.0);
        hayvan1.beslen();

        Aslan aslan1=new Aslan();
        Balina balina1=new Balina();
        Kartal kartal1=new Kartal();

        balina1.yuz();
        aslan1.yuz();

        // Bir interface kendisini implemente etmiş bir sınıfın örneklerine referans olabilir. !!!
        Yuzucu yuzucu1=new Aslan();      // Bir ata sınıftan tanımlanmış değişken alt sınıf nesnelerine 'referans' olabilir.
        Yuzucu yuzucu2=new Balina();     // Sadece erişimimiz sınırlı olur.
        Balina bln=(Balina)yuzucu2;      // Bu şekilde Balina sınıfı metotlarına erişimimizi sağlarız. UNBOXİNG

        System.out.println();

        Yuzucu[] yuzuculer=new Yuzucu[3];     // Interface ve Soyut(Abstract) sınıflarından new operatörü ile nesne oluşturulamaz.
        yuzuculer[0]=new Balina();
        yuzuculer[1]=new Aslan();
        yuzuculer[2]=new Balina();

        for (Yuzucu yuzucu : yuzuculer) {
            yuzucu.yuz();
        }

    }
}
