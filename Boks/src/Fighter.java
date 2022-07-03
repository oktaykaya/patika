public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge){
        this.damage = damage;
        this.health = health;
        this.name = name;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + "'a/e " + this.damage + " hasar vurdu");

        if (foe.dodge()){
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }
        return foe.health - this.damage;
    }

    boolean dodge(){
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
