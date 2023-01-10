import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String kullaniciAdi, parola, yeniKullaniciAdi, yeniParola, secim;

        Scanner giris = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz:");
        kullaniciAdi = giris.nextLine();
        System.out.print("Şifrenizi giriniz:");
        parola = giris.nextLine();

        if (kullaniciAdi.equals("test") && parola.equals("test123")) {
            System.out.print("Giriş Başarılı");
        } else if (kullaniciAdi.equals(kullaniciAdi) && parola.equals(parola)) {
            System.out.println("Giriş Başarısız");
            System.out.print("Şifrenizi sıfırlamak ister misiniz E/H?");
            secim = giris.nextLine();
            switch (secim) {
                case "E":
                    System.out.print("Yeni Kullanıcı Adınızı Giriniz:");
                    yeniKullaniciAdi = giris.nextLine();
                    System.out.print("Yeni Parolanızı Giriniz:");
                    yeniParola = giris.nextLine();
                    if (yeniKullaniciAdi.equals("test") && yeniParola.equals("test123")) {
                        System.out.print("Eski parolanız ile aynı olamaz");

                    } else {
                        System.out.print("Şifre başarıyla değiştirildi");
                    }
                    break;
                case "e":
                    System.out.print("Yeni Kullanıcı Adınızı Giriniz:");
                    yeniKullaniciAdi = giris.nextLine();
                    System.out.print("Yeni Parolanızı Giriniz:");
                    yeniParola = giris.nextLine();
                    if (yeniKullaniciAdi.equals("test") && yeniParola.equals("test123")) {
                        System.out.print("Eski parolanız ile aynı olamaz");

                    } else {
                        System.out.print("Şifre başarıyla değiştirildi");
                    }
                    break;
                case "H":
                    System.out.print("Değiştirme işlemi onaylanmadı");
                    break;
                case "h":
                    System.out.print("Değiştirme işlemi onaylanmadı");
                    break;
            }
        }
    }
}





