import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sicaklikDegeri;
        String
                oneri1 = "KAYAK",
                oneri2 = "SINEMA",
                oneri3 = "PIKNIK",
                oneri4 = "YUZME";

        Scanner input = new Scanner(System.in);
        System.out.println("ETKINLIK ONERI PROGRAMI");
        System.out.println("-----------------------");
        System.out.print("Sicaklik Degerini Giriniz:");
        sicaklikDegeri = input.nextInt();

        if (sicaklikDegeri <= 5) {
            System.out.println("Etkinlik Önerisi:" + oneri1);
            System.out.print("Kayak Yapmak için güzel bir gün");
        } else if (sicaklikDegeri >=6 && sicaklikDegeri <=15) {
            System.out.println("Etkinlik Önerisi:" + oneri2);
            System.out.print("Sinema gitmek için güzel bir gün");
        } else if (sicaklikDegeri >=16 && sicaklikDegeri <= 25) {
            System.out.println("Etkinlik Önerisi:" + oneri3);
            System.out.print("Piknik Yapmak için güzel bir gün");
        } else if (sicaklikDegeri >= 26) {
            System.out.println("Etkinlik Önerisi:" + oneri4);
            System.out.print("Yüzmek için güzel bir gün");
        }
    }
}