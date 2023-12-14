package hafta_4.pratik_9;

public class Student {
    String name;
    String classes;
    String stuNo;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <=100) c1.note = note1;
        if (note2 >= 0 && note2 <=100) c2.note = note2;
        if (note3 >= 0 && note3 <=100) c3.note = note3;

    }
    void addBulkSozluNote(int sozlu1, int sozlu2, int sozlu3){
        if (sozlu1 >= 0 && sozlu1 <=100) c1.sozlu = sozlu1;
        if (sozlu2 >= 0 && sozlu2 <=100) c2.sozlu = sozlu2;
        if (sozlu3 >= 0 && sozlu3 <=100) c3.sozlu = sozlu3;

    }

    void calcAverage() {
    this.average = (((c1.note * c1.note_agirlik) + (c1.sozlu * c1.sozlu_agirlik))
            + ((c2.note * c2.note_agirlik) + (c2.sozlu * c2.sozlu_agirlik))
            + ((c3.note * c3.note_agirlik) + (c3.sozlu * c3.sozlu_agirlik))) / 3.0;

    System.out.println("Öğrencinin ortalaması: " + this.average);
    }




    void printClassAverage(){
        System.out.println(c1.name + " Ortalaması\t" + ((c1.note * c1.note_agirlik) + (c1.sozlu * c1.sozlu_agirlik)));
        System.out.println(c2.name + " Ortalaması\t" + ((c2.note * c2.note_agirlik) + (c2.sozlu * c2.sozlu_agirlik)));
        System.out.println(c3.name + " Ortalaması\t" + ((c3.note * c3.note_agirlik) + (c3.sozlu * c3.sozlu_agirlik)));
    }

    void isPass(){
        if (this.average >= 50) {
            System.out.println("Öğrenci geçti.");
            this.isPass = true;
        } else {
            System.out.println("Öğrenci kaldı.");
            this.isPass = false;
        }
        printClassAverage();
    }


}
