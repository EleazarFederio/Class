public class Game {
    public static void main(String args[]){

//        Hero layla = new Hero();
//        layla.name = "Layla";
//        layla.health = 100;
//        layla.level = 1;
//        layla.manna = 100;
//        layla.attackPoints = 7;

        Hero layla = new Hero("Layla", 1, 100, 100, 7);
        Hero bruno = new Hero("Bruno", 1, 100, 100, 5);

        System.out.println("Bruno health " + bruno.health);
        layla.attack(bruno, layla.attackPoints);
        System.out.println("Bruno health " + bruno.health);
        bruno.regen();
        System.out.println("Bruno health " + bruno.health);


    }
}
