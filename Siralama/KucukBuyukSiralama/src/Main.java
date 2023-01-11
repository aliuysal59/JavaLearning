import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("EN KUCUK SAYIYI BULMA");
        System.out.println("-------------------------");
        System.out.print("1.Sayiyi Giriniz:");
        a = input.nextInt();
        System.out.print("2.Sayiyi Giriniz:");
        b = input.nextInt();
        System.out.print("3.Sayiyi Giriniz:");
        c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.print("Siralama Sonucu: a > b > c");
            } else {
                System.out.print(" a > c > b");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.print("Siralama Sonucu: b > a > c");
            } else {
                System.out.print("Siralama Sonucu: b > c > a");
            }
        } else {
            if (a > b) {
                System.out.print("Siralama Sonucu: c > a > b");
            }else {
                System.out.print("Siralama Sonucu: c > b > a");
            }
        }

    }
}