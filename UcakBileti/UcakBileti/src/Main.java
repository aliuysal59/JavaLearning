import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mesafeUcreti = 1.00, toplamTutar;
        int yas, mesafe, yolculukTuru;
        double indirimsizTutar, indirimliTutar;

        Scanner veriGirisi = new Scanner(System.in);

        System.out.print("Gidilecek Mesafeyi Giriniz (KM):");
        mesafe = veriGirisi.nextInt();
        System.out.print("Yaşınızı Giriniz:");
        yas = veriGirisi.nextInt();
        System.out.print("Yolculuk Turunu Seçiniz:\n1)Tek Yön   2)GidişDönüş\nSeçiminiz:");
        yolculukTuru = veriGirisi.nextInt();

        if(mesafe <=0 || yas <=0 || yolculukTuru <=0){
            System.out.print("Hatalı Giriş Yaptınız.");
        }
        //12 yaşına kadar olan tek yön yolcular
        if (yolculukTuru == 1 && yas <= 12) {
            indirimsizTutar = mesafeUcreti * mesafe;
            indirimliTutar = indirimsizTutar * 0.50;
            toplamTutar = indirimsizTutar - indirimliTutar;
            System.out.println("------------------------------------");
            System.out.println("YOLCULUK DETAYLARI");
            System.out.println("------------------------------------");
            System.out.println("Gidilecek Mesafe (KM)..............:" + mesafe);
            System.out.println("Yolcu Yaşı.........................:" + yas);
            System.out.println("Yolculuk Türü......................:" + yolculukTuru);
            System.out.println("Tek Yön Ulaşım Ücretiniz (TL)......:" + toplamTutar);
            System.out.println("------------------------------------");
            System.out.println("Hayırlı yolculuklar dileriz.");
            System.out.println("------------------------------------");
        }
        // 12 yaş 24 yaş aralığındaki tek yön yolcuları
        if (yolculukTuru == 1 && (yas >= 13 && yas <= 24)) {
            indirimsizTutar = mesafeUcreti * mesafe;
            indirimliTutar = indirimsizTutar * 0.10;
            toplamTutar = indirimsizTutar - indirimliTutar;
            System.out.println("------------------------------------");
            System.out.println("YOLCULUK DETAYLARI");
            System.out.println("------------------------------------");
            System.out.println("Gidilecek Mesafe (KM)..............:" + mesafe);
            System.out.println("Yolcu Yaşı.........................:" + yas);
            System.out.println("Yolculuk Türü......................:" + yolculukTuru);
            System.out.println("Tek Yön Ulaşım Ücretiniz (TL)......:" + toplamTutar);
            System.out.println("------------------------------------");
            System.out.println("Hayırlı yolculuklar dileriz.");
            System.out.println("------------------------------------");
        }
        //65 yaşındaki tek yön yolcular
        if (yolculukTuru == 1 && yas >= 65) {
            indirimsizTutar = mesafeUcreti * mesafe;
            indirimliTutar = indirimsizTutar * 0.30;
            toplamTutar = indirimsizTutar - indirimliTutar;
            System.out.println("------------------------------------");
            System.out.println("YOLCULUK DETAYLARI");
            System.out.println("------------------------------------");
            System.out.println("Gidilecek Mesafe (KM)..............:" + mesafe);
            System.out.println("Yolcu Yaşı.........................:" + yas);
            System.out.println("Yolculuk Türü......................:" + yolculukTuru);
            System.out.println("Tek Yön Ulaşım Ücretiniz (TL)......:" + toplamTutar);
            System.out.println("------------------------------------");
            System.out.println("Hayırlı yolculuklar dileriz.");
            System.out.println("------------------------------------");
        }
        //24 ile 65 yaş arasındaki tek yön yolcular
        if (yolculukTuru == 1 && (yas >= 25 && yas <= 65)) {
            indirimsizTutar = mesafeUcreti * mesafe;
            System.out.println("------------------------------------");
            System.out.println("YOLCULUK DETAYLARI");
            System.out.println("------------------------------------");
            System.out.println("Gidilecek Mesafe (KM)..............:" + mesafe);
            System.out.println("Yolcu Yaşı.........................:" + yas);
            System.out.println("Yolculuk Türü......................:" + yolculukTuru);
            System.out.println("Tek Yön Ulaşım Ücretiniz (TL)......:" + indirimsizTutar);
            System.out.println("------------------------------------");
            System.out.println("Hayırlı yolculuklar dileriz.");
            System.out.println("------------------------------------");
        }
        // 12 yaşına kadar olan gidiş dönüş yolcuları
        if (yolculukTuru == 2 && (yas <= 12)) {
            indirimsizTutar = mesafeUcreti * mesafe;
            indirimliTutar = indirimsizTutar * 0.50;
            toplamTutar = (indirimsizTutar - indirimliTutar) * 2;
            System.out.println("-----------------------------------");
            System.out.println("YOLCULUK DETAYLARI");
            System.out.println("-----------------------------------");
            System.out.println("Gidilecek Mesafe..................:" + mesafe);
            System.out.println("Yolcu Yaşı........................:" + yas);
            System.out.println("Yolculuk Türü.....................:" + yolculukTuru);
            System.out.println("Gidiş Dönüş Ulaşım Ücretiniz......:" + toplamTutar);
            System.out.println("------------------------------------");
            System.out.println("Hayırlı yolculuklar dileriz.");
            System.out.println("------------------------------------");
        }
        // 12 yaşına kadar olan gidiş dönüş yolcuları
        if (yolculukTuru == 2 && (yas >= 13 && yas <= 24)) {
            indirimsizTutar = mesafeUcreti * mesafe;
            indirimliTutar = indirimsizTutar * 0.10;
            toplamTutar = (indirimsizTutar - indirimliTutar) * 2;
            System.out.println("----------------------------------");
            System.out.println("YOLCULUK DETAYLARI");
            System.out.println("----------------------------------");
            System.out.println("Gidilecek Mesafe..................:" + mesafe);
            System.out.println("Yolcu Yaşı........................:" + yas);
            System.out.println("Yolculuk Türü.....................:" + yolculukTuru);
            System.out.println("Gidiş Dönüş Ulaşım Ücretiniz......:" + toplamTutar);
            System.out.println("------------------------------------");
            System.out.println("Hayırlı yolculuklar dileriz.");
            System.out.println("------------------------------------");
        }
        // 12 yaşına kadar olan gidiş dönüş yolcuları
        if (yolculukTuru == 2 && yas >= 65) {
            indirimsizTutar = mesafeUcreti * mesafe;
            indirimliTutar = indirimsizTutar * 0.30;
            toplamTutar = (indirimsizTutar - indirimliTutar) * 2;
            System.out.println("----------------------------------");
            System.out.println("YOLCULUK DETAYLARI");
            System.out.println("-----------------------------------");
            System.out.println("Gidilecek Mesafe..................:" + mesafe);
            System.out.println("Yolcu Yaşı........................:" + yas);
            System.out.println("Yolculuk Türü.....................:" + yolculukTuru);
            System.out.println("Gidiş Dönüş Ulaşım Ücretiniz......:" + toplamTutar);
            System.out.println("------------------------------------");
            System.out.println("Hayırlı yolculuklar dileriz.");
            System.out.println("------------------------------------");
        }
        //24 ile 65 yaş arasındaki tek yön yolcular
        if (yolculukTuru == 2 && (yas >= 25 && yas <= 65)) {
            indirimsizTutar = mesafeUcreti * mesafe*2;
            System.out.println("------------------------------------");
            System.out.println("YOLCULUK DETAYLARI");
            System.out.println("------------------------------------");
            System.out.println("Gidilecek Mesafe (KM)..............:" + mesafe);
            System.out.println("Yolcu Yaşı.........................:" + yas);
            System.out.println("Yolculuk Türü......................:" + yolculukTuru);
            System.out.println("Tek Yön Ulaşım Ücretiniz (TL)......:" + indirimsizTutar);
            System.out.println("------------------------------------");
            System.out.println("Hayırlı yolculuklar dileriz.");
            System.out.println("------------------------------------");
        }
    }
}
