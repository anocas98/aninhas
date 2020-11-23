public abstract class Enemy {

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

    public void printEnemy(){

        System.out.println("Type: " + type + "\n Life:" + life);
    }


    public abstract void sleep();
}

