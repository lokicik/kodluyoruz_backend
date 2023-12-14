# Kodluyoruz Yazılıma İlk Adım 2: Back-End Web Geliştirme 

### Bitirme Projesi: Mayın Tarlası Oyunu (src/bitirme_projesi)

Oyun Kuralları:

1. Oyun metin tabanlıdır.

2. Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
3. Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
 
4. Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.) 
5. Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
 
6. Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
  
7. Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
 
8. Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
9. Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.