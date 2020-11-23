public abstract class Enemy implements Hittable {

    protected String type;
    protected double life;
    protected int defenseFactor;
    protected int attackFactor;

    public Enemy(String type, double life, int defenseFactor){
        this.life = life;
        this.type = type;
        this.defenseFactor = defenseFactor;
        this.attackFactor = attackFactor;
    }
    @Override
    public int setDamage(int damage) {
        life = life + defenseFactor - damage;
        return (int) life;
    }
    @Override
    public int getLife() {
        return (int) life;
    }

    public void printEnemy(){

        System.out.println("Type: " + type + "\n Life:" + life);
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "type='" + type + '\'' +
                ", life=" + life +
                ", defenseFactor=" + defenseFactor +
                ", attackFactor=" + attackFactor +
                '}';
    }
    @Override
    public int power(){
        return attackFactor;
    }

    public abstract void sleep();
}


