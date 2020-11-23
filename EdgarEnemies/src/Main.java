import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hittable elf = EnemyFactory.createEnemy("Elf");
        Hittable dwarf = EnemyFactory.createEnemy("Dwarf");
        Hittable human = EnemyFactory.createEnemy("Human");
        Hittable dragon = EnemyFactory.createEnemy("Dragon");


        Game game = new Game();
        Player player = new Player();
        game.startGame(player);
        Hittable[] enemies = game.getEnemies();

        for (int i = 0; i < enemies.length; i++){
            System.out.println("Nível:" + i);
            System.out.println(enemies[i]);
            System.out.println(player);
                while(true){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Selecione a opção: \n" +
                            "1- Ataque normal \n" +
                            "2- Carregar vida \n" +
                            "3- Ataque especial \n" +
                            "5- Sair do jogo ");

                    int input = sc.nextInt();
                    game.round(input, enemies[i]);



                    if(enemies[i].getLife() <= 0){
                        System.out.println("O inimigo morreu");
                        break;
                    }else {
                        player.getHitted(enemies[i].power());
                    }
                    System.out.println(enemies[i]);
                    System.out.println(player);
                    if(player.health <= 0){
                        return;
                    }
                }


        }
    }

    }

