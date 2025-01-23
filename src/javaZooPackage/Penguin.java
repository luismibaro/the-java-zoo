package javaZooPackage;

public class Penguin extends Animal implements Eat,Walk,Swim {
    private boolean isSwimming ;
    private int swimSpeed ;
    private int walkSpeed ;

    public Penguin() {
        super.setNameOfAnimal("Penguin");
    }

    public Penguin(String nameOfAnimal) {
       super(nameOfAnimal);
    }

    public boolean isSwimming() { return isSwimming; }

    public void setSwimming(boolean swimming) { isSwimming = swimming; }

    public int getSwimSpeed() { return swimSpeed; }

    public void setSwimSpeed(int swimSpeed) { this.swimSpeed = swimSpeed; }

    public int getWalkSpeed() { return walkSpeed; }

    public void setWalkSpeed(int walkSpeed) { this.walkSpeed = walkSpeed; }




    @Override
    public void eatingFood(){
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph");
    }

    @Override
    public void swimming(){
        System.out.println("Penguin: I am swimming at the speed " + swimSpeed + " nautical miles per hour" );
    }
}
