package bitirme_projesi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mayın Tarlası oyununa hoş geldiniz!\n=============");
        MineSweeper oyun = new MineSweeper();
        oyun.satirSutunAl();
        oyun.oyunuOlustur();
        oyun.oyunuBaslat();
    }
}
