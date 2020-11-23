public class Game {


    private boolean status;
    private int stage;
    private String[] enemyTypes = new String[]{"Elf", "Dwarf", "Human"};

    public Enemy[] getEnemies() {
        return enemies;
    }

    public void setEnemies(Enemy[] enemies) {
        this.enemies = enemies;
    }

    private Enemy[] enemies;
    private PlayerInterface player;

    public void startGame(Player player) {
        this.player = player;

      enemies = new Enemy[6];
        for (int i = 0; i < enemies.length; i++) {

            int random = (int) (Math.random() * enemyTypes.length);
            System.out.println(random);
            switch (random) {
                case 0:
                    enemies[i] = new Elf(12, 12);
                    break;
                case 1:
                    enemies[i] = new Dwarf(3, 13);
                    break;
                case 2:
                    enemies[i] = new Human(8, 9);
            }

        }
            enemies[5]= new Dragon(20,20);


    }
    public void round(int option, Hittable h){

            switch (option){
                    case 1: player.normalAttack(h);
                    break;
                    case 2 :player.rechargeHealth(20);
                    break;
                    case 3: player.specialAttack(h);
                    break;
                    default:
                            System.exit(0);

            }


    }
}
