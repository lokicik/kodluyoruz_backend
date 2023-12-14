/*Java ile kullanıcıdan alınan para değerinin
KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 20% olarak alın)

KDV'siz Fiyat = 10;
KDV'li Fiyat = 12;
KDV tutarı = 2.0;
*/

/* Ekstra:
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %20 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak
KDV tutarı hesaplayan programı yazınız.
 */

package hafta_2;
import java.util.Scanner;

public class pratik_2 {
    public static void main(String[] args) {
        double para_degeri, kdvli_para_degeri, kdv_degeri;
        int kdv = 20;
        Scanner input = new Scanner(System.in);
        System.out.print("Para miktarını giriniz: ");
        double deger = input.nextInt();
        System.out.print("\nKDV'siz fiyat: ");
        System.out.print(deger);
        System.out.print("\nKDV'li fiyat: ");
        System.out.print(deger *(100+kdv)/100);
        System.out.print("\nKDV tutarı: ");
        System.out.print(deger *(100+kdv)/100 - deger);

    }
}
