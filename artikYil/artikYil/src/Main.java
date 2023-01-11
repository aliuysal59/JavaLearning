import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;

        Scanner giris = new Scanner(System.in);

        System.out.print("Yil bilgisini giriniz:");
        yil = giris.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0){
            System.out.print(yil + " artık yıldır");
        } else{
            System.out.printf(yil + " artık yıl değildir");
        }
    }
}