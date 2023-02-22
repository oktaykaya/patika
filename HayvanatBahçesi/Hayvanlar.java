package OOP.HayvanatBahçesi;

public class Hayvanlar {
    private String turAdi;
    private double agirlik;
    private int yas;

    public Hayvanlar(String turAdi, double agirlik, int yas) {
        this.turAdi = turAdi;
        this.agirlik = agirlik;
        this.yas = yas;
    }

    public String getTurAdi() {
        return turAdi;
    }

    public void setTurAdi(String turAdi) {
        this.turAdi = turAdi;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void getDosage(){
        System.out.println("ilaç dozu : "+ yas/agirlik);
    }

    public void getFeedSchedule(){
        System.out.println("Hayvanların yemleme zamanı "+24/8+ " saatte bir dir");
    }
}
