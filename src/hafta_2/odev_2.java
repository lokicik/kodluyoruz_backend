/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı
hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve
yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki
koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

* Kullanıcıdan alınan değerler geçerli
(mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

* Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.

* Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.

* Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.

* Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */


package hafta_2;
import java.util.Scanner;

public class odev_2 {
    public static void main(String[] args) {
        int indirim_yuzdesi = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kodluyoruz Uçuşlarına hoşgeldiniz!\n");
        System.out.print("Uçuş mesafenizi km cinsinden giriniz: \n");
        int mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: \n");
        int yas = input.nextInt();
        System.out.print("Yolculuk tipinizi seçiniz (1: Gidiş-Dönüş, 2:Tek Yön): \n");
        int tip = input.nextInt();
        if ((tip == 1 || tip == 2) && (mesafe >= 0) && (yas >= 0 && yas <= 110)){
            double orijinal_fiyat = mesafe * 0.1;
            double indirimli_fiyat = orijinal_fiyat;
            System.out.print("Uçuşunuz için hesaplanan orijinal fiyat:");
            System.out.print(orijinal_fiyat + "TL");

            if (yas < 12) {
                indirimli_fiyat *= 0.5;
                indirim_yuzdesi += 50;
                System.out.print("\nYaşınız 12'den küçük olduğu için %50 indirim uygulanmıştır. Yeni fiyat: ");
                System.out.print(indirimli_fiyat + "TL");
            } else if (yas >= 12 && yas <= 24) {
                indirimli_fiyat *= 0.9;
                indirim_yuzdesi += 10;
                System.out.print("\nYaşınız 12-24 arası olduğu için %10 indirim uygulanmıştır. Yeni fiyat: ");
                System.out.print(indirimli_fiyat + "TL");
            } else if (yas >= 65) {
                indirimli_fiyat *= 0.7;
                indirim_yuzdesi += 30;
                System.out.print("\nYaşınız 12-24 arası olduğu için %30 indirim uygulanmıştır. Yeni fiyat: ");
                System.out.print(indirimli_fiyat + "TL");
            }

            if(tip == 1) {
                indirimli_fiyat -= orijinal_fiyat * 0.2;
                indirim_yuzdesi += 20;
                System.out.print("\nYolculuk tipi olarak Gidiş-Dönüş seçtiğiniz için %20 indirim uygulanmıştır. Yeni fiyat: ");
                System.out.print(indirimli_fiyat + "TL");
            }

            if(orijinal_fiyat == indirimli_fiyat){
                System.out.print("\nİndirim uygulanmamıştır. Son fiyat: ");
                System.out.print(indirimli_fiyat + "TL");
            }
            else {
                System.out.print("\nOrijinal Fiyat: ");
                System.out.print(orijinal_fiyat + "TL");
                System.out.print("\nSon Fiyat: ");
                System.out.print(indirimli_fiyat + "TL");
                System.out.print("\nToplam uygulanan indirim: ");
                System.out.print(orijinal_fiyat - indirimli_fiyat + "TL");
                System.out.print("\nToplam uygulanan indirim yüzdesi: ");
                System.out.print("%" + indirim_yuzdesi);
            }

        } else System.out.println("Hatalı veri girdiniz.");

    }
}