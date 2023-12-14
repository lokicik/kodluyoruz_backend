package hafta_4.pratik_9;

public class Course {
    Teacher teacher;
    String name;
    String prefix;
    String code;
    int note;
    int sozlu;
    double note_agirlik;
    double sozlu_agirlik;


    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int sozlu = 0;
        this.note_agirlik = 0.3;
        this.sozlu_agirlik = 0.7;
    }


    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }
        else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }


    void printTeacher(){
        this.teacher.print();
    }
}
