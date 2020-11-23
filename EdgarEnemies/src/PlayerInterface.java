public interface PlayerInterface  {

    public void getHitted(double hit);
    public int rechargeHealth(int health);
    public int normalAttack(Hittable h);

    public int specialAttack(Hittable h);


}
