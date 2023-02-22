package OOP.HayvanatBahçesi;

public class kemirgenler extends Hayvanlar{
    public kemirgenler(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public void getFeedSchedule() {
        super.getFeedSchedule();
    }

    @Override
    public void getDosage() {
        System.out.println("ilaç dozu : 0,1");
    }
}
