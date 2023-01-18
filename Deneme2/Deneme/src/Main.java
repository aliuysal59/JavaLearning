import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        int secim, miktar;
        int bakiye = 10000;
        int kalan, toplam;
        int i = 3;

        Scanner input = new Scanner(System.in);
        for (i = 1; i <=3; i++) {
            System.out.print("Kullanıcı adı :");
            userName = input.nextLine();
            System.out.print("Parola        :");
            password = input.nextLine();
            if (password.equals("ali") && userName.equals("ali")) {
                System.out.println("Giriş Başarılı, Hoşgeldiniz!!");
                System.out.println("----------------------------------------");
                System.out.println("MENU");
                System.out.println("----------------------------------------");
                System.out.print("1-Para Çekme\n" + "2-Para Yatırma\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış\n");
                System.out.print("Seçiminizi Yapınız:");
                secim = input.nextInt();
                if (secim == 1) {
                    System.out.print("Çekmek İstediğiniz Miktarı Giriniz:");
                    System.out.println("----------------------------------------");
                    secim = input.nextInt();
                    if (secim <= 10000) {
                        kalan = secim - bakiye;
                        bakiye = kalan;
                        System.out.println("İşlem Başarılı!!");
                        System.out.println("----------------------------------------");
                        System.out.println("Çekilen tutar         :" + secim);
                        System.out.println("Kalan Bakiye Bilgisi  :" + bakiye);
                        System.out.println("İşlem Tamamlandı Tekrar Görüşmek Üzere!");
                        //break;
                    } else if (secim >= 10000) {
                        System.out.println("----------------------------------------");
                        System.out.println("İşlem Başarısız!!\nHata: Bakiyeniz Yetersiz");
                        System.out.println("İşlem Tamamlanamadı Tekrar Görüşmek Üzere!");
                        //break;
                    }
                } else if (secim == 2) {
                    System.out.print("Yatırmak İstediğiniz Miktarı Giriniz:");
                    secim = input.nextInt();
                    bakiye += secim;
                    System.out.println("Toplam Bakiyeniz:" + bakiye);
                    System.out.println("İşlem Tamamlandı Tekrar Görüşmek Üzere!");
                    //break;
                } else if (secim == 3) {
                    System.out.print("Toplam Bakiyeniz:" + bakiye);
                } else if (secim == 4) {
                    System.out.println("Çıkış İşlemi Başarılı");
                    System.out.println("Çıkış Tamamlandı Tekrar Görüşmek Üzere!");
                    //break;
                }else {
                    System.out.println("Hatalı Seçim Yaptınız");
                    System.out.println("Program Sonlandırıldı, Lütfen tekrar deneyiniz.");
                    //break;
                }
            } else if (i == 3){
                System.out.println("Deneme Hakkınız doldu ve program sonlandırıldı");
                break;
            }
        }
    }
}