import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a, b, c;
        double d;

        Scanner girisler = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz: ");
        a = girisler.nextInt();
        System.out.print("2.Kenarı Giriniz: ");
        b = girisler.nextInt();
        System.out.print("3.Kenarı Giriniz: ");
        c = girisler.nextInt();

        d = (a+b+c)/2;
        System.out.print("Ucgenin Alanı:" +d);

    }
}