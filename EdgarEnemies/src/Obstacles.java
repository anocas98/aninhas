public class Obstacles implements Hittable {

    double life;

    @Override
    public int setDamage(int damage) {
        life = life - damage;
        return (int) life;
    }

    @Override
    public int getLife() {
        return 0;
    }
    @Override
    public int power(){
        return 0;
    }

    public String getType(){
        return "Obstacles";
    }
}
