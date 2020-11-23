public abstract class Game {


    private boolean status;
    private int stage;
    private String[] enemyTypes = new String[]{"Elf", "Dwarf", "Human"};
    private Enemy[] enemies;
    private PlayerInterface player = new Player();

    public void startGame(String[] enemyTypes) {

        Enemy[] enemies = new Enemy[6];
        for (int i = 0; i < enemies.length-1; i++) {

            int random = (int) (Math.random() * enemyTypes.length);
            switch (random) {
                case 0:
                    enemies[i] = new Elf(12, 12);
                    break;
                case 1:
                    enemies[1] = new Dwarf(3, 13);
                    break;
                case 2:
                    enemies[2] = new Human(8, 9);
            }

        }
            enemies[5]= new Dragon(20,20);


    }
    public void round(int option){

            switch (option){
                    case 1: player.normalAttack();
                    break;
                    case 2 :player.rechargeHealth(20);
                    break;
                    case 3: player.specialAttack();
                    break;
                    default:
                            System.exit(0);

            }


    }
}
