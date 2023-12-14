/* Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
derslerinin sınav puanlarını kullanıcıdan alan ve
ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 */

/* Ekstra:
Aynı program içerisinde koşullu ifadeler kullanılarak,
eğer kullanıcının ortalaması 60'dan büyük ise
ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
 */

package hafta_2;
import java.util.Scanner;

public class pratik_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tuv, tuf, tun;
        System.out.print("Türkçe vize notunuzu giriniz: ");
        tuv = input.nextInt();
        System.out.print("Türkçe final notunuzu giriniz: ");
        tuf = input.nextInt();
        tun = (tuv * 0.30) + (tuf * 0.70);
        System.out.print("Türkçe notunuz: ");
        System.out.print(tun);
        System.out.print((tun >= 50) ? "\nGeçtiniz" : "\nKaldınız");


        double tav, taf, tan;
        System.out.print("\nTarih vize notunuzu giriniz: ");
        tav = input.nextInt();
        System.out.print("Tarih final notunuzu giriniz: ");
        taf = input.nextInt();
        tan = (tav * 0.30) + (taf * 0.70);
        System.out.print("Tarih notunuz: ");
        System.out.print(tan);
        System.out.print((tan >= 50) ? "\nGeçtiniz" : "\nKaldınız");

        double mv, mf, mn;
        System.out.print("\nMatematik vize notunuzu giriniz: ");
        mv = input.nextInt();
        System.out.print("Matematik final notunuzu giriniz: ");
        mf = input.nextInt();
        mn = (mv * 0.30) + (mf * 0.70);
        System.out.print("Matematik notunuz: ");
        System.out.print(mn);
        System.out.print((mn >= 50) ? "\nGeçtiniz" : "\nKaldınız");

        double fv, ff, fn;
        System.out.print("\nFizik vize notunuzu giriniz: ");
        fv = input.nextInt();
        System.out.print("Fizik final notunuzu giriniz: ");
        ff = input.nextInt();
        fn = (fv * 0.30) + (ff * 0.70);
        System.out.print("Fizik notunuz: ");
        System.out.print(fn);
        System.out.print((fn >= 50) ? "\nGeçtiniz" : "\nKaldınız");

        double kv, kf, kn;
        System.out.print("\nKimya vize notunuzu giriniz: ");
        kv = input.nextInt();
        System.out.print("Kimya final notunuzu giriniz: ");
        kf = input.nextInt();
        kn = (kv * 0.30) + (kf * 0.70);
        System.out.print("Kimya notunuz: ");
        System.out.print(kn);
        System.out.print((kn >= 50) ? "\nGeçtiniz" : "\nKaldınız");

        double muv, muf, mun;
        System.out.print("\nMüzik vize notunuzu giriniz: ");
        muv = input.nextInt();
        System.out.print("Müzik final notunuzu giriniz: ");
        muf = input.nextInt();
        mun = (muv * 0.30) + (muf * 0.70);
        System.out.print("Müzik notunuz: ");
        System.out.print(mun);
        System.out.print((mun >= 50) ? "\nGeçtiniz" : "\nKaldınız");

        double notOrt = (mun + mn + fn + kn + tan + tun) / 6;

        System.out.println("\nDörtlük tabanda not ortalamanız: ");
        System.out.println(notOrt/25);
        System.out.println("\nYüzlük tabanda not ortalamanız: ");
        System.out.println(notOrt);
        System.out.print((notOrt/25 < 1.5) ? "Sınıfta kaldınız..." : "Sınıfı geçtiniz!");

    }
}

