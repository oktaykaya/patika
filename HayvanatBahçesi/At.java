package OOP.HayvanatBahçesi;

public class At extends Hayvanlar {
    public At(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public void getDosage() {
        System.out.println("at ilaç dozu : "+ getYas()/getAgirlik());
    }

    @Override
    public void getFeedSchedule() {
        System.out.println("Atların yemleme zamanı "+24/2+ " saatte bir dir");
    }
}
