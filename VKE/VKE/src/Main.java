import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    double boy, kilo, output;

    Scanner VKE = new Scanner(System.in);
    System.out.print("Boyunuzu metre olarak giriniz:");
    double boyGirdi = VKE.nextDouble();
    System.out.print("Kilonuzu giriniz:");
    double kgGirdi = VKE.nextDouble();
    output = (kgGirdi/(boyGirdi*boyGirdi));
    System.out.print("VKE Sonucunuz:"+output);


    }
}