public class Hero {

    String name = "";
    int level, manna, health, attackPoints;

    public Hero(String name, int level, int manna, int health, int attackPoints) {
        this.name = name;
        this.level = level;
        this.manna = manna;
        this.health = health;
        this.attackPoints = attackPoints;
    }

    void receiveAttack(int attackedDecrease){
        health = health - attackedDecrease;
    }

    void attack( Hero heroAttack, int yourHeroAttackPoint ){
        System.out.println(this.name + " attacked " + heroAttack.name);
        heroAttack.receiveAttack(yourHeroAttackPoint);
    }

    void regen(){
        while (health < 100){
            System.out.println("Healing: health = " + health);
            health++;
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }


}
