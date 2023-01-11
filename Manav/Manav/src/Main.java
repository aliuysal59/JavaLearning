import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14,
                elma = 3.67,
                domates = 1.11,
                muz = 0.95,
                patlican = 5.00;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double sonuc;


        Scanner girdi = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("MANAV ALISVERISI HESAPLAMA PROGRAMI");
        System.out.println("--------------------------------------------");
        System.out.print("Armut KG giriniz...........:");
        armutKg = girdi.nextInt();
        System.out.print("Elma KG giriniz............:");
        elmaKg = girdi.nextInt();
        System.out.print("Domates KG giriniz..........:");
        domatesKg = girdi.nextInt();
        System.out.print("Muz KG giriniz..............:");
        muzKg = girdi.nextInt();
        System.out.print("Patlican KG giriniz.........:");
        patlicanKg = girdi.nextInt();

        sonuc = (armutKg*armut) + (elmaKg*elma) + (domatesKg*domates) + (muzKg*muz) + (patlicanKg*patlican);

        System.out.println("--------------------------------------------");
        System.out.println("Toplam Ödeyeceğiniz Tutar.....:" + sonuc);
        System.out.print("--------------------------------------------");


    }

}
