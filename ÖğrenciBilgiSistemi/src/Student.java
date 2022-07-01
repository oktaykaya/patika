public class Student {
    String name;
    String stuNo;
    int classes;
    Course Mat;
    Course Fizik;
    Course Kimya;
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, int classes, Course Mat, Course Fizik, Course Kimya) {
    this.name = name;
    this.stuNo = stuNo;
    this.classes = classes;
    this.Mat = Mat;
    this.Fizik = Fizik;
    this.Kimya = Kimya;
    this.isPass = false;
    }
    public void addBulkExamNote(int mat, int fizik, int kimya){

        if (mat>=0 && mat<=100){
         this.Mat.note = mat;
        }
        if (fizik>=0 && fizik<=100){
            this.Fizik.note = fizik;
        }
        if (kimya>=0 && kimya<=100){
            this.Kimya.note = kimya;
        }

    }
    public void addBulkSozluNote(int mat, int fizik, int kimya){

        if (mat>=0 && mat<=100){
            this.Mat.sozluNote = mat;
        }
        if (fizik>=0 && fizik<=100){
            this.Fizik.sozluNote = fizik;
        }
        if (kimya>=0 && kimya<=100){
            this.Kimya.sozluNote = kimya;
        }

    }
    public  void isPass(){
        if (this.Mat.note == 0 || this.Fizik.note == 0 || this.Kimya.note == 0){
            System.out.println("notlar tam olarak girilmemiştir...");
        }
        else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass){
                System.out.println("Sınıfı geçti");
            }else{
                System.out.println("Sınıfta kaldı...");
            }
        }
    }
    public void calcAvarage(){
        this.avarage = (this.Mat.note * 0.8 + this.Mat.sozluNote * 0.2 +this.Fizik.note * 0.7 + this.Fizik.sozluNote * 0.3 +this.Kimya.note * 0.5 + this.Kimya.sozluNote * 0.5)/3   ;
    }
    public void printNote(){
        System.out.println("***********************");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik notu : " + this.Mat.note*0.8 + this.Mat.sozluNote*0.2);
        System.out.println("Fizik notu : " + this.Fizik.note*0.7 + this.Fizik.sozluNote*0.3);
        System.out.println("Kimya notu : " + this.Kimya.note*0.5 + this.Kimya.sozluNote*0.5);
    }
    public boolean isCheckPass(){
        calcAvarage();
        return this.avarage > 55;
    }
}
