package hafta_4;
import java.util.Scanner;
public class pratik_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = input.nextInt();
        int temp = 10;

        int[] list = {56,34,1,8,101,-2,-33};

        int min = list[0];
        int max = list[0];

        int nearestSmaller = Integer.MIN_VALUE;
        int nearestLarger = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < min) min = i;
            if (i > max) max = i;// benım bırtanecık canım oğlum seni
            if (i < sayi && i > nearestSmaller) nearestSmaller = i;
            if (i > sayi && i < nearestLarger) nearestLarger = i;
        }

        System.out.println("Girilen sayıdan büyük en yakın sayı: " + nearestLarger);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + nearestSmaller);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

}}
