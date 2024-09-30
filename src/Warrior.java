public class Warrior {

    int rounds;
    String name;
    int hp;

    public Warrior(String warriotName, int amountOfBullets, int life){
        rounds = amountOfBullets;
        name = warriotName;
        hp = life;
    }


    public void shoot(){
        rounds = rounds-1;
    }


    public String toString(){
        String str = "warrior " + name + " has " + rounds + " bullets and " + hp + " life left";
        if (hp<=0) str+="\n\tRIP " + name + "...";
        return str;
    }


    public void kill(Warrior otherWarrior) {
        otherWarrior.hp=0;
    }


}




