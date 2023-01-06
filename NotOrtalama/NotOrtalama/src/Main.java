import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fiz, kim, tarih, turkce, muzik;
        //int gecti, kaldi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Puanını Giriniz: ");
        matematik = inp.nextInt();
        System.out.print("Fizik Puanını Giriniz: ");
        fiz = inp.nextInt();
        System.out.print("Kimya Puanını Giriniz: ");
        kim = inp.nextInt();
        System.out.print("Tarih Puanını Giriniz: ");
        tarih = inp.nextInt();
        System.out.print("Türkçe Puanını Giriniz: ");
        turkce = inp.nextInt();
        System.out.print("Müzik Puanını Giriniz: ");
        muzik = inp.nextInt();

        int toplam;
        toplam = (matematik + fiz + kim + tarih + turkce + muzik);
        double sonuc;
        sonuc = toplam / 6.0;

        System.out.println("Not Ortalamaniz: " +sonuc);

        String mesaj = (sonuc >= 60) ? "Geçtiniz" : "Kaldiniz";
        System.out.println(mesaj);
    }
}