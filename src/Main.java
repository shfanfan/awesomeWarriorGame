public class Main {
    public static void main(String[] args) throws Exception {

        Warrior aviv = new Warrior("aviv the great", 100 , 4);
        Warrior boss = new Warrior("satana", 400 , 20);

        System.out.println(aviv.toString());
        //aviv.hp = 1000000;
        aviv.shoot();
        aviv.shoot();

        System.out.println(aviv.toString());
        System.out.println(boss.toString());
        boss.kill(aviv);

        System.out.println(aviv.toString());


    }
}
