import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dairenin yarıçapını isteyin.
        System.out.println("Dairenin yarıçapını giriniz:");
        double r = scanner.nextDouble();

        // Kullanıcıdan daire diliminin açısını isteyin.
        System.out.println("Daire diliminin açısını giriniz:");
        double alpha = scanner.nextDouble();

        // Daire diliminin alanını hesaplayın.
        double area = pi * r * r;
        double areaOfSlice = area * (alpha / 360);

        // Sonucu yazdırın.
        System.out.println("Daire diliminin alanı = " + areaOfSlice);
    }
}
