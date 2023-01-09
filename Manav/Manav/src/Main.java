import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican ,toplam;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo:");
        double fiyatArmut = input.nextDouble();
        System.out.print("Elma Kaç kilo:");
        double fiyatElma = input.nextDouble();
        System.out.print("Domates Kaç Kilo:");
        double fiyatDomates = input.nextDouble();
        System.out.print("Muz Kaç Kilo:");
        double fiyatMuz = input.nextDouble();
        System.out.print("Patlican Kaç Kilo:");
        double fiyatPatlican = input.nextDouble();

        fiyatArmut = armut*fiyatArmut;
        fiyatElma = elma*fiyatElma;
        fiyatDomates = domates*fiyatDomates;
        fiyatMuz = muz*fiyatMuz;
        fiyatPatlican = patlican*fiyatPatlican;
        toplam = (fiyatArmut+ fiyatElma + fiyatDomates + fiyatMuz + fiyatPatlican);

        System.out.println("Toplam Tutar :"+toplam);
        System.out.print("Bizi tercih ettiğiniz için teşekkürler.");




    }
}