public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNote;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNote = 0;

    }

    public void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.courseTeacher = teacher;
        }
        else {
            System.out.println(teacher.name + "Akademisyen bu dersi veremez.");
        }
    }
    public void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.name + " dersin akademisyeni : " + courseTeacher.name);
        }
        else {
            System.out.println(this.name + " dersin akademisyeni atanmamıştır...");
        }
    }
}
