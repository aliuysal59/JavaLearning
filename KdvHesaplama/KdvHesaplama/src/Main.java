import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    double tutar, kdv, kdv2, kdvli, kdvoran;
    kdv2 = 1.08;
    kdv = 1.18;

    Scanner giris = new Scanner(System.in);

    System.out.print("Fiyat Giriniz: ");
    tutar = giris.nextDouble();
    kdvli =  kdv * tutar;
    System.out.println("Kdvli Tutar:" +kdvli);
    }
}