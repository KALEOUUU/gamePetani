package gamePetani;

public class Game{
    public static void main(String[] args) {
        // Buat Objek
        Player hero = new Player();
        Monster monster = new Monster();

        // memeberi nilai atribut
        hero.name = "Ata";
        hero.speed = 90;
        hero.healthpoint = 87;
        hero.damage = 70;
        hero.shield = 60;

   
        hero.run();
        
        System.out.println("");

        monster.name = "Golem";
        monster.healthpoint = 150;
        monster.speed = 70;
        monster.damage = 58;
        monster.shield = 40;
        
        monster.showStatus();

        monster.run();
        hero.attack();
        hero.deffends(monster.shield, hero.damage, monster.healthpoint);
        

        if(hero.isDead()){
            System.out.println(hero.name + "Game Over!");
        }
    }
}