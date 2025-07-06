package ex_22_OOPs_AccessModifier.Police;

public class Cop {
    private int gun;
    String iCard;

    //Parameter Constructor
    public Cop(int bullet){
        this.gun = bullet;
    }

    //Method / Behaviour
    protected void canIshoot(){
        System.out.println("Yes, you can shoot!");
    }
}
