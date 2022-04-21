package day038;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        int[] sayilar={3,5,1,2,9,4};

        System.out.println(Arrays.toString(sayilar));  // Arrays.toString() metot ile diziyi String yapıp ekrana bastırdık.

        Arrays.sort(sayilar);  // Bu metot diziyi sıraladı. Yerleri değişti artık. 0.indeks en küçük oldu ve büyüğe dogru sıralandı indeksler.
        System.out.println(Arrays.toString(sayilar));


        String[] isimler={"Mehmet","Ahmet","Hasan","Zeynep","Ayşe"};

        System.out.println(Arrays.toString(isimler));
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));


        Kitap kitap53=new Kitap("İlahi Komedya","Dante Alighieri",382);
        System.out.println(kitap53);


        Kitap[] kitaplar={
                new Kitap("Java 5","Herbert Schild",700),
                new Kitap("C#4.0","Herbert Schild",500),
                new Kitap("Javascript Kitabı","Anonim",150),
                new Kitap("Pyton'a Giriş","Cenk Serdengeçti",350)
        };

        System.out.println(Arrays.toString(kitaplar));
        Arrays.sort(kitaplar);
        System.out.println(Arrays.toString(kitaplar));

        System.out.println();
        for(Kitap kitap : kitaplar){
            System.out.println(kitap);
        }

        // TASK

        Ikili[] ikililer={
                new Ikili(9,10),new Ikili(3,4),new Ikili(7,8),new Ikili(5,6),new Ikili(1,2)
        };

        Arrays.sort(ikililer);
        System.out.println(Arrays.toString(ikililer));
    }
}
