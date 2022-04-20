package day037;

public class Kartal extends Hayvan implements Ucucu,Avci{

    @Override
    public void avlan() {
        System.out.println("Kartal avlanıyor.");
    }

    @Override
    public void uc() {
        System.out.println("Kartal uçuyor.");
    }
}
