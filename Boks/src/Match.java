public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run() {
        if (isCheckWeight()) {
            if (whoFirst()) {
                System.out.println();
                System.out.println("ilk vuruşu " + this.f1.name + " yaptı");
                System.out.println();
                while (true) {
                    f2.health = f1.hit(f2);
                    if (isWin())
                        break;
                    f1.health = f2.hit(f1);
                    if (isWin())
                        break;
                    printScore();
                }
            } else {
                System.out.println();
                System.out.println("ilk vuruşu " + this.f2.name + " yaptı");
                System.out.println();
                while (true) {

                    f1.health = f2.hit(f1);
                    if (isWin())
                        break;
                    f2.health = f1.hit(f2);
                    if (isWin())
                        break;
                    printScore();
                }
            }
        } else {
            System.out.println("Dövüşçülerin sikletleri uygun değildir...");
        }
    }

    boolean isCheckWeight() {
        return ((f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight));
    }


    boolean isWin() {
        if (this.f1.health <= 0) {
            System.out.println("maçı kazanan dövüşçü " + this.f2.name);
            return true;
        }
        if (this.f2.health <= 0) {
            System.out.println("maçı kazanan dövüşçü " + this.f1.name);
            return true;
        }
        return false;
    }


    void printScore() {
        System.out.println("---------------");
        System.out.println(f1.name + " kalan canı : " + f1.health);
        System.out.println(f2.name + " kalan canı : " + f2.health);
        System.out.println("---------------");
    }

    boolean whoFirst() {
        int val = (int) (Math.random() * 2);

        if (val == 0) {
            return true;
        }
        return false;
    }
}

