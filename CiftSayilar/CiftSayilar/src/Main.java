import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}