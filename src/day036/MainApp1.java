package day036;

public class MainApp1 {
    public static void main(String[] args) {

        // POLYMORPHISM (ÇOK BİÇİMLİLİK)
        // Metotların 'overload' edilmesi bir POLYMORPHISM 'dir. --> 2 farklı constructor olması, aynı isimde yazılmış 2 metot(imzası/parametreleri farkı olursa overload edilirler.)
        // Metotların 'override' edilmesi bir POLYMORPHSIM 'dir.

        Hayvan hayvan1=new Hayvan();
        hayvan1.setIsim("Hayvan1");
        hayvan1.setYas(3);
        hayvan1.setAgirlik(10.0);

        Hayvan hayvan2=new Hayvan("Hayvan2",5,3.5);

        hayvan1.beslen();
        hayvan1.sesVer();

        hayvan2.beslen();
        hayvan2.sesVer();

        System.out.println(hayvan1);
        System.out.println(hayvan2);


        if (hayvan1.equals(hayvan2)){
            System.out.println("İki hayvan aynıdır.");
        }else{
            System.out.println("İki hayvan farklı.");
        }


        Hayvan hy1=new Hayvan();
        Object obj1=new Hayvan();

        ((Hayvan)obj1).getYas();    // UNBOXING - Böylece obj1 nesnesi Hayvan sınıfının metotlarına erişebilir oldu. Kutudan çıkarılmış oldu.
        Hayvan hy2=((Hayvan)obj1);  // Metotlara erişimek için sürekli ((Hayvan)obj1) yazmak yerine bunu bir referansa atarsak daha iyi olur.
        hy2.setIsim("Aslan");
        hy2.beslen();
        hy2.sesVer();

        // KEDİ

        Kedi kedi1=new Kedi();
        Hayvan hayvan=new Kedi();
        Object obj53=new Kedi();

        kedi1.yumaklaOyna();      // Referansına göre metotlara ulaşabiliriz.

        Kedi k=(Kedi)hayvan;      // Böyle yaparsak Kedi referansının metoduna erişmiz oluruz.
        ((Kedi) hayvan).yumaklaOyna();

    }
}
