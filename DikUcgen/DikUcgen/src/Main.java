import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a, b;
        double c;

        Scanner girisler = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz: ");
        a = girisler.nextInt();
        System.out.print("2.Kenarı Giriniz: ");
        b = girisler.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenus :" +c);
    }
}