public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public void run(){
        print();
        System.out.println("Bonus : " +tax());
        System.out.println("Bonus : " +bonus());
        raiseSalary();
    }

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        if (this.salary < 1000){
            System.out.println("Bu işçi düşük ücret aldığından vergiden muaftır.");
            return 0;
        }
        else {
            double tax = this.salary*0.03;
            return tax;
        }
    }

    public double bonus(){
        double bonus;
        if (this.workHours > 40){
            bonus = (this.workHours - 40) * 30;
        }
        else {
            return 0;
        }
        return bonus;
    }

    public double raiseSalary(){
        double raise =0;
        double newSalary = 0;
        if (2021-this.hireYear < 10 && 2021-this.hireYear > 0){
             raise = this.salary * 0.05;
            newSalary = this.salary + raise;
            System.out.println(this.name + " adlı çalışana " + raise + " kadar maaşına zam yapılacaktır");
        }
        else if (2021-this.hireYear > 9 && 2021-this.hireYear<20){
             raise = this.hireYear * 0.1;
             newSalary = this.salary + raise;
            System.out.println(this.name + " adlı çalışana " + raise + " kadar maaşına zam yapılacaktır");
        }
        else if ( 2021-this.hireYear > 19 ){
             raise = this.salary * 0.15;
            newSalary = this.salary + raise;
            System.out.println(this.name + " adlı çalışana " + raise + " kadar maaşına zam yapılacaktır");
        }
        else {
            System.out.println(this.name + " adlı çalışana zam yapılmayacaktır...");;
        }
        System.out.println("Vergi ve Bonuslarla ile birlikte maaş : " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + newSalary);
        return this.salary+raise;
    }


    public void print(){
        System.out.println("Adı : " +this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Çalışma Saati : " +this.workHours);
        System.out.println("Başlangıç yılı : " +this.hireYear);
    }
}
