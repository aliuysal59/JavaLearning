import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int gun;
        int ay;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz AY bilgisini (sayısal olarak) giriniz:");
        ay = input.nextInt();
        System.out.print("Doğduğunuz GÜN bilgisini (sayısal olarak) giriniz:");
        gun = input.nextInt();

        if (ay == 1 && (gun >= 1 && gun <= 21)) {
            System.out.print("Burcunuz: Oğlak");
        } else if (ay == 1 && (gun >= 22 && gun <= 31)) {
            System.out.print("Burcunuz: Kova");
        }
        if (ay == 2 && (gun >= 1 && gun <= 19)) {
            System.out.print("Burcunuz: Kova");
        } else if (ay == 2 && (gun >= 20 && gun <= 29)) {
            System.out.print("Burcunuz: Balık");
        }
        if (ay == 3 && (gun >= 1 && gun <= 20)) {
            System.out.print("Burcunuz: Balık");
        } else if (ay == 3 && (gun >= 21 && gun <= 31)) {
            System.out.print("Burcunuz: Koç");
        }
        if (ay == 4 && (gun >= 1 && gun <= 20)) {
            System.out.print("Burcunuz: Koç");
        } else if (ay == 4 && (gun >= 21 && gun <= 30)) {
            System.out.print("Burcunuz: Boğa");
        }
        if (ay == 5 && (gun >= 1 && gun <= 20)) {
            System.out.print("Burcunuz: Boğa");
        } else if (ay == 5 && (gun >= 21 && gun <= 31)) {
            System.out.print("Burcunuz: İkizler");
        }
        if (ay == 6 && (gun >= 1 && gun <= 22)) {
            System.out.print("Burcunuz: İkizler");
        } else if (ay == 6 && (gun >= 23 && gun <= 30)) {
            System.out.print("Burcunuz: Yengeç");
        }
        if (ay == 7 && (gun >= 1 && gun <= 22)) {
            System.out.print("Burcunuz: Yengeç");
        } else if (ay == 7 && (gun >= 23 && gun <= 31)) {
            System.out.print("Burcunuz: Aslan");
        }
        if (ay == 8 && (gun >= 1 && gun <= 22)) {
            System.out.print("Burcunuz: Aslan");
        } else if (ay == 8 && (gun >= 23 && gun <= 30)) {
            System.out.print("Burcunuz: Başak");
        }
        if (ay == 9 && (gun >= 1 && gun <= 22)) {
            System.out.print("Burcunuz: Başak");
        } else if (ay == 9 && (gun >= 23 && gun <= 31)) {
            System.out.print("Burcunuz: Terazi");
        }
        if (ay == 10 && (gun >= 1 && gun <= 22)) {
            System.out.print("Burcunuz: Terazi");
        } else if (ay == 10 && (gun >= 23 && gun <= 30)) {
            System.out.print("Burcunuz: Akrep");
        }
        if (ay == 11 && (gun >= 1 && gun <= 21)) {
            System.out.print("Burcunuz: Akrep");
        } else if (ay == 11 && (gun >= 22 && gun <= 30)) {
            System.out.print("Burcunuz: Yay");
        }
        if (ay == 12 && (gun >= 1 && gun <= 22)) {
            System.out.print("Burcunuz: Yay");
        } else if (ay == 12 && (gun >= 23 && gun <= 31)) {
            System.out.print("Burcunuz: Oğlak");
        } else {
            System.out.print("Hatali Giriş Yaptınız!!!");
        }
    }
}
