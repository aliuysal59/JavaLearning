import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogumYili, kalan;
        String maymun = "Maymun",
                horoz = "Horoz",
                kopek = "Köpek",
                domuz = "Domuz",
                fare = "fare",
                okuz = "Öküz",
                kaplan = "Kaplan",
                tavsan = "Tavşan",
                ejderha = "Ejderha",
                yilan = "Yılan",
                at = "at",
                koyun = "Koyun";

        Scanner giris = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz:");
        dogumYili = giris.nextInt();
        kalan = dogumYili % 12;

        if (kalan == 0) {
            System.out.print("Çin Zodyağı Burcunuz: " + maymun);
        }
        if (kalan == 1) {
            System.out.print("Çin Zodyağı Burcunuz: " + horoz);
        }
        if (kalan == 2) {
            System.out.print("Çin Zodyağı Burcunuz: " + kopek);
        }
        if (kalan == 3) {
            System.out.print("Çin Zodyağı Burcunuz: " + domuz);
        }
        if (kalan == 4) {
            System.out.print("Çin Zodyağı Burcunuz: " + fare);
        }
        if (kalan == 5) {
            System.out.print("Çin Zodyağı Burcunuz: " + okuz);
        }
        if (kalan == 6) {
            System.out.print("Çin Zodyağı Burcunuz: " + kaplan);
        }
        if (kalan == 7) {
            System.out.print("Çin Zodyağı Burcunuz: " + tavsan);
        }
        if (kalan == 8) {
            System.out.print("Çin Zodyağı Burcunuz: " + ejderha);
        }
        if (kalan == 9) {
            System.out.print("Çin Zodyağı Burcunuz: " + yilan);
        }
        if (kalan == 10) {
            System.out.print("Çin Zodyağı Burcunuz: " + at);
        }
        if (kalan == 11) {
            System.out.print("Çin Zodyağı Burcunuz: " + koyun);
        }
    }
}