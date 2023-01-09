import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double alan, cevre, pi = 3.14, daireAlan;
        int r, yaricap, merkezAci = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz :");
        r = input.nextInt();
        alan = Math.PI * r * r;
        cevre = Math.PI * 2 * r;
        System.out.println("Dairenin Alanı :" + alan);
        System.out.println("Dairenin Çevresi :" + cevre);

        System.out.println();
        System.out.print("Daire Diliminin Yarıçapını Giriniz :");
        yaricap = input.nextInt();
        daireAlan = (pi * (yaricap * yaricap) * merkezAci) / 360;
        System.out.println("Daire Diliminin Alanı :" + daireAlan);
    }
}