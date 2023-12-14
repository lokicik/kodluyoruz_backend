package hafta_4.pratik_9;
import java.util.Scanner;


public class pratik_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Teacher t1 = new Teacher("Doğuş", "TRH", "555");
        Teacher t2 = new Teacher("Tesla", "FZK", "000");
        Teacher t3 = new Teacher("Einstein", "BIO", "111");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        System.out.println("Öğrenci adı: " + s1.name);
        s1.addBulkExamNote(50, 100, 36);
        s1.addBulkSozluNote(50, 100, 60);
        s1.calcAverage();
        s1.isPass();

        Student s2 = new Student("Şaşı Sezai", "124", "4", tarih, fizik, biyo);
        System.out.println("Öğrenci adı: " + s2.name );
        s2.addBulkExamNote(20, 10, 1);
        s2.addBulkSozluNote(1, 50, 100);
        s2.calcAverage();
        s2.isPass();

        Student s3 = new Student("Güdük Necmi", "125", "4", tarih, fizik, biyo);
        System.out.println("Öğrenci adı: " + s3.name);
        s3.addBulkExamNote(91, 76, 98);
        s3.addBulkSozluNote(90, 100, 90);
        s3.calcAverage();
        s3.isPass();




    }
}
