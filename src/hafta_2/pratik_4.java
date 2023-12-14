/*
Burç bulan programı yapınız. hem if-else hem switch case.
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
*/
package hafta_2;
import java.util.Scanner;

public class pratik_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum gününüzü giriniz: ");
        int gun = input.nextInt();
        System.out.print("Doğum ayınızı giriniz: ");
        int ay = input.nextInt();
        if(gun>=21 && ay==3 || gun<=20 && ay==4)
            System.out.print("Koç burcusunuz.");
        else if(gun>=21 && ay==4 || gun<=21 && ay==5)
            System.out.print("Boğa burcusunuz.");
        else if(gun>=22 && ay==5 || gun<=22 && ay==6)
            System.out.print("İkizler burcusunuz.");
        else if(gun>=23 && ay==6 || gun<=22 && ay==7)
            System.out.print("Yengeç burcusunuz.");
        else if(gun>=23 && ay==7 || gun<=22 && ay==8)
            System.out.print("Aslan burcusunuz.");
        else if(gun>=23 && ay==8 || gun<=22 && ay==9)
            System.out.print("Başak burcusunuz.");
        else if(gun>=23 && ay==9 || gun<=22 && ay==10)
            System.out.print("Terazi burcusunuz.");
        else if(gun>=23 && ay==10 || gun<=21 && ay==11)
            System.out.print("Akrep burcusunuz.");
        else if(gun>=23 && ay==11 || gun<=21 && ay==12)
            System.out.print("Yay burcusunuz.");
        else if(gun>=22 && ay==12 || gun<=21 && ay==1)
            System.out.print("Oğlak burcusunuz.");
        else if(gun>=22 && ay==1 || gun<=19 && ay==2)
            System.out.print("Kova burcusunuz.");
        else if((gun>=20 & ay==2) || (gun<=20 & ay==3))
            System.out.print("Balık burcusunuz.");

        switch(ay){
    case 1:
        if(gun>=22) System.out.print("Kova burcusunuz.");
        else System.out.print("Oğlak burcusunuz.");
        break;
    case 2:
        if(gun>=20) System.out.print("Balık burcusunuz.");
        else System.out.print("Kova burcusunuz.");
        break;
    case 3:
        if(gun>=21) System.out.print("Koç burcusunuz.");
        else System.out.print("Balık burcusunuz.");
        break;
    case 4:
        if(gun>=21) System.out.print("Boğa burcusunuz.");
        else System.out.print("Koç burcusunuz.");
        break;
    case 5:
        if(gun>=22) System.out.print("İkizler burcusunuz.");
        else System.out.print("Boğa burcusunuz.");
        break;
    case 6:
        if(gun>=23) System.out.print("Yengeç burcusunuz.");
        else System.out.print("İkizler burcusunuz.");
        break;
    case 7:
        if(gun>=23) System.out.print("Aslan burcusunuz.");
        else System.out.print("Yengeç burcusunuz.");
        break;
    case 8:
        if(gun>=23) System.out.print("Başak burcusunuz.");
        else System.out.print("Aslan burcusunuz.");
        break;
    case 9:
        if(gun>=23) System.out.print("Terazi burcusunuz.");
        else System.out.print("Başak burcusunuz.");
        break;
    case 10:
        if(gun>=23) System.out.print("Akrep burcusunuz.");
        else System.out.print("Terazi burcusunuz.");
        break;
    case 11:
        if(gun>=22) System.out.print("Yay burcusunuz.");
        else System.out.print("Akrep burcusunuz.");
        break;
    case 12:
        if(gun>=22) System.out.print("Oğlak burcusunuz.");
        else System.out.print("Yay burcusunuz.");
        break;
    default:
        System.out.print("Geçersiz ay");
}


    }
}
