/*
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül: Kilo (kg) / Boy(m) * Boy(m)

Çıktısı:
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
 */


package hafta_2;
import java.util.Scanner;


public class odev_1 {
    public static void main(String[] args) {
        double vki, kilo, boy;
        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu kg cinsinden giriniz: ");
        kilo = input.nextInt();
        System.out.println("Boyunuzu m cinsiden giriniz: ");
        boy = input.nextFloat();

        vki = kilo / (boy*boy);
        System.out.println("\nVücut kitle indeksiniz: ");
        System.out.println(vki);
    }
}
