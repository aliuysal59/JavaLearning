import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2, secim;

        Scanner girdi = new Scanner(System.in);

        System.out.print("İlk Sayi:");
        sayi1 = girdi.nextInt();
        System.out.print("İkinci Sayi:");
        sayi2 = girdi.nextInt();
        System.out.println("-----------------------------------------");

        System.out.println("İŞLEM SEÇENEKLERİ\n1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        System.out.print("-----------------------------------------\n");
        System.out.print("Seçiminiz :");

        secim = girdi.nextInt();
        System.out.println("-----------------------------------------");
        switch (secim) {
            case 1:
                System.out.print("TOPLAMA İşlemi Seçimi Başarıyla Yapıldı\n");
                System.out.print("Sonuc:"+ (sayi1 + sayi2));
                break;
            case 2:
                System.out.print("ÇIKARTMA İşlemi Seçimi Başarıyla Yapıldı:\n");
                System.out.print("Sonuc:"+ (sayi1 - sayi2));
                break;
            case 3:
                System.out.print("ÇARPMA İşlemi Seçimi Başarıyla Yapıldı:\n");
                System.out.print("Sonuc:"+ (sayi1 * sayi2));
                break;
            case 4:
                if (sayi1 != 0) {
                    System.out.print("BÖLME İşlemi Seçimi Başarıyla Yapıldı:\n");
                    System.out.print("Sonuc:"+ (sayi1 / sayi2));
                } else {
                    System.out.print("HATA!! 0 sayısı ile bölme işlemi yapılamaz!!");
                }
                break;
            default:
                System.out.println("Hatali secim yaptiniz");
                System.out.print("Lütfen tekrar deneyiniz.");
                break;
        }
    }
}