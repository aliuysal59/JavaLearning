
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenler
        int matematik, fizik, turkce, kimya, muzik;
        int matNot, fizikNot, turkceNot, kimyaNot, muzikNot;
        int durum;
        Scanner giris = new Scanner(System.in);
        // Kullanıcı girişleri
        System.out.print("Matematik Notun Giriniz:");
        matNot = giris.nextInt();
        System.out.print("Fizik Notunu Giriniz:");
        fizikNot = giris.nextInt();
        System.out.print("Türkçe Notunu Giriniz:");
        turkceNot = giris.nextInt();
        System.out.print("Kimya Notunu Giriniz:");
        kimyaNot = giris.nextInt();
        System.out.print("Müzik Notunu Giriniz:");
        muzikNot = giris.nextInt();
        //ortlama hesaplama
        double sonuc = (matNot + fizikNot + turkceNot + kimyaNot + muzikNot) / 5;
        if (sonuc >= 100) {
            System.out.print("Geçersiz not ortalaması girildi:\n" + sonuc);
        } else if (sonuc <= 0) {
            System.out.print("Geçersiz Not Ortalaması girildi:\n" + sonuc);
        }
        //sınıf geçme durumu
        if (sonuc >= 55 && sonuc <= 100) {
            System.out.println("Geçti\n" +sonuc);
        } else if (sonuc <= 55 && sonuc >= 0) {
            System.out.println("Kaldı\n" +sonuc);
        }
    }
}