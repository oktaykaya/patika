public class Main{
    public static void main(String[] args) {

        Course mat = new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FZK101","FZK");
        Course kimya = new Course("Kimya","KMY101","KMY");

        Teacher teacher1 = new Teacher("Oktay KAYA","542","MAT");
        Teacher teacher2 = new Teacher("Efe KAYA", "536","FZK");
        Teacher teacher3 = new Teacher("Aysun KAYA", "535","KMY");

        mat.addTeacher(teacher1);
        fizik.addTeacher(teacher2);
        kimya.addTeacher(teacher3);

        Student s1 = new Student("Gazi Kaya","571",4,mat,fizik,kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkSozluNote(70,70,70);
        s1.isPass();

        Student s2 = new Student("Furkan Çelik","572",4,mat,fizik,kimya);
        s2.addBulkExamNote(50,80,40);
        s2.addBulkSozluNote(80,80,80);
        s2.isPass();

        Student s3 = new Student("Okan Sezer","573",4,mat,fizik,kimya);
        s3.addBulkExamNote(50,60,60);
        s3.addBulkSozluNote(40,60,50);
        s3.isPass();
    }
}