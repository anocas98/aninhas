public class Player implements PlayerInterface {

    public int health = 100;
    public int normalAttack = 20;
    public int specialAttack = 50;
    public int healthRechargeCounter = 3;
    public int specialAttackCounter = 3;

    @Override
    public void getHitted(double hit) {
        this.health = this.health - (int)hit;

    }

    @Override
    public int rechargeHealth(int health) {
        if (healthRechargeCounter > 0){
            this.health = this.health + health;
            healthRechargeCounter --;

        }
        return this.health;
    }

    @Override
    public int normalAttack() {
        return normalAttack;
    }

    @Override
    public int specialAttack() {
        if (specialAttack > 0) {
            specialAttackCounter --;
            return specialAttack;
        }
        return 0;
    }
}
