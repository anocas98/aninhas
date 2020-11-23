public class Dragon extends Enemy{

    public Dragon(int defenseFactor, int attackFactor){

        super("Dragon", defenseFactor, attackFactor);

    }

    @Override
    public void sleep() {
        System.out.println("Rooroooroooowww");

    }
    @Override
    public int setDamage(int damage) {
        int random = (int) (Math.random() * 2);
        if(random == 0){
            life = life - damage;
        }else{
            life = life + defenseFactor - damage;
        }

        return (int) life;
    }
}


