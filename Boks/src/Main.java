public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Oktay",30,150,80,40);
        Fighter f2 = new Fighter("Derya",20, 100,50,80);

        Match match = new Match(f1,f2,40,100);
        match.run();
    }
}
