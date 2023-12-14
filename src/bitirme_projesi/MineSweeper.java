package bitirme_projesi;

import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    int satir;
    int sutun;
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int elemanSayisi;
    int mayinSayisi;
    int[][] gameList;
    int skor;


    void satirSutunAl(){
        System.out.println("Lütfen satır boyutunu belirleyiniz: ");
        int tempSatir = input.nextInt();
        System.out.println("Lütfen sütun boyutunu belirleyiniz: ");
        int tempSutun = input.nextInt();

        if (tempSatir <= 0 || tempSutun <= 0){
            System.out.println("Geçersiz işlem. 0 ve 0'dan küçük satır ve sütün girilemez.");
        } else {
            this.satir = tempSatir;
            this.sutun = tempSutun;
            this.gameList = new int[this.satir][this.sutun];
            this.elemanSayisi = this.satir * this.sutun;
            this.mayinSayisi = this.elemanSayisi / 4;
            this.skor = 0;
        }
    }


    void oyunuOlustur() {
    // Mayınları yerleştir
    for (int i = 0; i < mayinSayisi; i++) {
        int randomSatir, randomSutun;

        do {
            // Rastgele satır ve sütun seç
            randomSatir = random.nextInt(this.satir);
            randomSutun = random.nextInt(this.sutun);
        } while (gameList[randomSatir][randomSutun] == -1);

        // Mayını yerleştir (-1 mayını temsil edebilir, kullanılan bir değer olabilir)
        gameList[randomSatir][randomSutun] = -1;
    }

    // Her hücredeki mayın sayılarını hesapla
    for (int i = 0; i < this.satir; i++) {
        for (int j = 0; j < this.sutun; j++) {
            // Eğer bu hücrede mayın yoksa, etrafındaki hücreleri tarayarak mayın sayısını hesapla
            if (gameList[i][j] != -1) {
                int mayinSayici = 0;

                // Yukarı, aşağı, sola, sağa ve çaprazlara bak
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        // Kenar kontrolü ve kendisi dışındaki hücreleri kontrol et
                        if (i + k >= 0 && i + k < this.satir && j + l >= 0 && j + l < this.sutun && (k != 0 || l != 0)) {
                            // Eğer taranan hücrede mayın varsa, sayacı artır
                            if (gameList[i + k][j + l] == -1) {
                                mayinSayici++;
                            }
                        }
                    }
                }

                // Hesaplanan mayın sayısını ilgili hücreye yaz
                gameList[i][j] = mayinSayici;
            }
        }
    }
}




    void oyunTahtasiniGoruntule(boolean[][] acilmisHucreler) {
        for (int i = 0; i < this.satir; i++) {
            for (int j = 0; j < this.sutun; j++) {
                if (acilmisHucreler[i][j]) {
                    if (gameList[i][j] == -1) {
                        System.out.print("* "); // Mayın
                    } else {
                        System.out.print(gameList[i][j] + " ");
                    }
                } else {
                    System.out.print("- "); // Henüz açılmamış hücre
                }
            }
            System.out.println();
        }
    }



    /////////////////////////////////////
    // Mayın Tarlasını açık bir durumda göstermek için kullanılacak fonksiyon.
    // Eğer girilecek satır ve sütun sayısı 42 olarak seçilirse aktifleşir.
    /////////////////////////////////////
    void hileliGoster(boolean[][] acilmisHucreler){
        System.out.println("Seni hileci seni!");
        for (int i = 0; i < this.satir; i++) {
            for (int j = 0; j < this.sutun; j++) {
                System.out.print(gameList[i][j] + " ");
            }
            System.out.println("\n");

        }
        System.out.println("\n");
    }




    void oyunuBaslat() {
        boolean[][] acilmisHucreler = new boolean[this.satir][this.sutun];

        while (true) {
            oyunTahtasiniGoruntule(acilmisHucreler);

            // Oyunu oynamak için girdi alma
            System.out.println("Satır giriniz: ");
            int geciciSatir = input.nextInt();
            System.out.println("Sütun giriniz: ");
            int geciciSutun = input.nextInt();

            // Hile yapmak için 42 girilmeli
            if (geciciSatir == 42 && geciciSutun == 42){
                hileliGoster(acilmisHucreler);
                continue;
            }

            // Satır sütun geçerlilik kontrolü
            if (geciciSatir <= 0 || geciciSatir > this.satir || geciciSutun <= 0 || geciciSutun > this.sutun) {
                System.out.println("Geçersiz satır veya sütun değeri. Lütfen tekrar deneyin.");
                continue;
            }


            int satirIndex = geciciSatir - 1;
            int sutunIndex = geciciSutun - 1;


            if (acilmisHucreler[satirIndex][sutunIndex]) {
                System.out.println("Bu hücre zaten açılmış. Lütfen farklı bir hücre seçin.");
            } else {
                acilmisHucreler[satirIndex][sutunIndex] = true;

                if (gameList[satirIndex][sutunIndex] == -1) {
                    oyunTahtasiniGoruntule(acilmisHucreler);
                    System.out.println("Mayına bastınız. Oyunu kaybettiniz! Skorunuz: " + this.skor);
                    break;

                } else {
                    this.skor++;
                    if (this.skor == elemanSayisi - mayinSayisi){
                        System.out.println("Tebrikler, oyunu kazandınız!");
                        System.out.println("Tamam mı devam mı?(y/n)");
                        String sonuc = input.next();
                        if (sonuc.equalsIgnoreCase("y")) {
                            satirSutunAl();
                            oyunuOlustur();
                            continue;

                    } else {
                        break;
                    }
                    }
                }
            }
        }
    }
}
