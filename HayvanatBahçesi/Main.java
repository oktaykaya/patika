package OOP.HayvanatBahçesi;

public class Main {


    public static void main(String[] args) {
        Hayvanlar hayvanlar = new Hayvanlar("Oktay",80,24);
        hayvanlar.getDosage();
        hayvanlar.getFeedSchedule();


        Hayvanlar hayvanlar1 = new At("AT",200,5);
        hayvanlar1.getDosage();
        hayvanlar1.getFeedSchedule();

        Hayvanlar hayvanlar2 = new Kedigiller("Ponçik",6.5,2);
        hayvanlar2.getDosage();
        hayvanlar2.getFeedSchedule();

        Hayvanlar hayvanlar3 = new kemirgenler("efe",55,15);
        hayvanlar3.getDosage();
        hayvanlar3.getFeedSchedule();
    }
}
