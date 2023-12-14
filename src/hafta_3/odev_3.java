/*
🦾 Java Ödev 3
Java ile klavyeden girilen N tane sayma
sayısından en büyük ve en küçük sayıları
bulan ve bu sayıları ekrana yazan programı yazın.
 */

package hafta_3;
import java.util.Scanner;
public class odev_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz?: ");
        int n = input.nextInt();
        int min=0, max = 0;

        for (int i = 1; i <= n; i++){
            System.out.print("Sayı giriniz: ");
            int sayi = input.nextInt();
            if (sayi < min) min = sayi;
            if (sayi > max) max = sayi;
        }

        System.out.print("Max: " + max + " Min: " + min);
    }
}
