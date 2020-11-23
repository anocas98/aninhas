public class Dragon extends Enemy{

    public Dragon(int defenseFactor, int attackFactor){

        super("Dragon", defenseFactor, attackFactor);

    }


    @Override
    public void sleep() {
        System.out.println("Rooroooroooowww");

    }
}


