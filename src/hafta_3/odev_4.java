package hafta_3;
import java.util.Scanner;
public class odev_4 {
    static boolean asalMi(int num, int divisor) {
        if (num <= 1) return false;
        if (divisor == 1) return true;
        if (num % divisor == 0) return false;
        return asalMi(num, divisor - 1);
    }

    static boolean asalMi(int num) {
        return asalMi(num, num / 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = input.nextInt();
        boolean sonuc = asalMi(sayi);
        if (sonuc) System.out.println("Sayı asaldır.");
        else System.out.println("Sayı asal değildir.");


    }
}
