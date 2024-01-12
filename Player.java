package gamePetani;

class Player {
    // atribut
    String name;
    int speed, healthpoint;
    int damage, shield;
    
    // method
    void run(){
        System.out.println(name + " is running...");
        System.out.println("Speed " + speed);
        System.out.println("Healthpoint alive " + healthpoint);
    }
    
    void attack(){
        System.out.println("Atha attack the monster" + damage);
    }
    
    void deffends(int shield,int damage,int healthpoint){
            System.out.println(name+" is deffending...");
            System.out.println("damage reduction : "+shield);
            System.out.println("damage masuk : "+(damage-shield));
            System.out.println("Sisa Healthpoin : "+(healthpoint-(damage-shield)));;
    }
    
    
    boolean isDead(){
        if (healthpoint <=0) return true;
            return false;
    }
    
    }

class Monster {
        // atribut
        String name;
        int speed, healthpoint;
        int damage, shield;
    
        // method
                // method
        void run(){
            System.out.println(name + " is running...");
            System.out.println("Speed " + speed);
            System.out.println("Helathpoint alive " + healthpoint);
            System.out.println("Attack " + damage);
            System.out.println("Armor " + shield);
        }
            void attack(){
            if (shield > 0) {
                System.out.println(name + " use Shield!");
                shield--;
                } else {
                    System.out.println(name + " attacks with Damage: " + damage);
                    }
        }
    
            void deffends(int shield,int damage,int healthpoint){
                System.out.println(name+" is deffending...");
                System.out.println("damage reduction : "+shield);
                System.out.println("damage masuk : "+(damage-shield));
                System.out.println("Sisa Healthpoin : "+(healthpoint-(damage-shield)));;
        }
    
        void showStatus(){
            System.out.println(name + " status: ");
            System.out.println("Healthpoint: " + healthpoint);
            System.out.println("Damage: " + damage);
            System.out.println("Shield: " + shield);
        }
    
        boolean isDead(){
            if (healthpoint <=0) return true;
                return false;
        }
    }



