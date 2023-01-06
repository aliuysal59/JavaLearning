import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double  kmBasi, ucret, baslangicUcreti;
        kmBasi = 2.20;
        baslangicUcreti = 10;

        Scanner giris = new Scanner(System.in);
        System.out.print("Gidilen KM giriniz: ");
        km = giris.nextInt();

        ucret = (km * kmBasi);
        ucret += baslangicUcreti;

        ucret = (ucret <20) ? 20 : ucret;
        System.out.println("Ödenecek Tutar: " +ucret);

    }
}