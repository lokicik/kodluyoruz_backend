/*
📒 Pratik - Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program
Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.


Ekstra
Java döngüler ile 0'dan girilen sayıya kadar olan
sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız
 */



package hafta_3;
import java.util.Scanner;
public class pratik_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0, kontrol = 0;
        System.out.println("Sayı giriniz: ");
        int sayi = input.nextInt();
        for (int i = 0; i < sayi; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        for (int i = 0; i < sayi; i++) {
            if (i % 4 == 0 && i % 3 == 0){
                toplam += i;
                kontrol++;
        }}

        System.out.print("\n0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: ");
        System.out.print(toplam/kontrol);
    }}
