package OOP.HayvanatBahçesi;

public class Kedigiller extends Hayvanlar{
    public Kedigiller(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public void getDosage() {
        System.out.println("kedi ilaç dozu : 0,5");
    }

    @Override
    public void getFeedSchedule() {
        System.out.println("Kedilerin yemleme zamanı "+24/3+ " saatte bir dir");
    }
}
