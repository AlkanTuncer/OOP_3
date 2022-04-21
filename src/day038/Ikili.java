package day038;

public class Ikili implements Comparable {   // TASK

    private int x;
    private int y;

    public Ikili(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Ikili() {
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }


    @Override
    public int compareTo(Object o) {
        Ikili i=(Ikili) o;
        return (this.getX()+this.getY())/(double)2 < ( (i.getX())+(i.getY()) )/(double)2 ? -1 : (this.getX()+this.getY())/(double)2 ==
                ( (i.getX() + i.getY()) ) / (double)2 ? 0 : 1;
    }

    /*
        TASK :
         - Ikili isminde bir sınıf tasarlayınız.
         - x ve y isminde iki adet int üyesi olmalı
         - getter/setter ve constructor'ları tanımlanmalı
         - toString metodu uygun şekilde override edilmeli
         - Comparable interface'ini implemente etmeli
         - Sıralamayı iki değerin ortalamasına göre yapmalı. (x+y)/2 tam sayı bölme hatasına dikkat
         - main metodu içinde {} ile 5 elemanlı bir dizi (Ikili tipinden) oluşturulacak.
         - Arrays.toString ile yazdırılacak
         - Arrays.sort ile sıralanacak
         - Tekrar yazdırılacak.
     */

}
