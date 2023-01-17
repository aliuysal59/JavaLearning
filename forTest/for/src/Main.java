import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi, ort, toplam=0;

        Scanner giris = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        sayi = giris.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
               System.out.println(i);


            }
        }
    }
}