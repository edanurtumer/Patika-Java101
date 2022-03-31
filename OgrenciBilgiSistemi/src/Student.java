import java.util.Locale;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    double verbalNote;
    double finalNote1;
    double finalNote2;
    double finalNote3;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        //calcAvarage();
        this.isPass = false;
        this.verbalNote = 0.0;
        this.finalNote1 = 0.0;
        this.finalNote2 = 0.0;
        this.finalNote3 = 0.0;
    }


    void addBulkExamNote(int note1, int verbalNote1, int note2, int verbalNote2, int note3, int verbalNote3){
        if((note1 >= 0 && note1 <= 100) && (verbalNote1 >= 0 && verbalNote1 <= 100)){
            this.mat.note = note1;
            this.mat.verbalNote = verbalNote1;
        }

        if((note2 >= 0 && note2 <= 100) && (verbalNote2 >= 0 && verbalNote2 <= 100)){
            this.fizik.note = note2;
            this.fizik.verbalNote = verbalNote2;
        }

        if((note3 >= 0 && note3 <= 100) && (verbalNote3 >= 0 && verbalNote3 <= 100)){
            this.kimya.note = note3;
            this.kimya.verbalNote = verbalNote3;
        }
    }

    void calculateNote(){
        this.finalNote1 = (this.mat.note * 0.8)+(this.mat.verbalNote * 0.2);
        this.finalNote2 = (this.fizik.note * 0.8)+(this.fizik.verbalNote * 0.2);
        this.finalNote3 = (this.kimya.note * 0.8)+(this.kimya.verbalNote * 0.2);
    }

    void isPass(){
        calculateNote();
        System.out.println("-----------------");
        this.avarage = (this.finalNote1 + this.finalNote2 + this.finalNote3) / 3.0;
        if(this.avarage >= 55){
            System.out.println("Dersi Geçtiniz.");
            this.isPass = true;
        }else{
            System.out.println("Kaldınız...");
            this.isPass = false;
        }
        printNote();
    }

    /*
    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }
    */

    void printNote(){
        System.out.println( this.mat.name + " Notu\t: " +  this.finalNote1);
        System.out.println( this.fizik.name + " Notu\t: " +  this.finalNote2);
        System.out.println( this.kimya.name + " Notu\t: " +  this.finalNote3);
        System.out.println("Ortalamanız: " + this.avarage);
    }
}
