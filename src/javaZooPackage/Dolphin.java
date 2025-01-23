package javaZooPackage;

public class Dolphin extends Animal implements Swim {
    private String color;
    private int SwimmingSpeed;

    public Dolphin() {
        super.setNameOfAnimal("Dolphin");
    }

    public Dolphin(String nameOfAnimal) {
        super(nameOfAnimal);
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public int getSwimmingSpeed() {
        return SwimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        SwimmingSpeed = swimmingSpeed;
    }



    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish.");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed " + SwimmingSpeed);
    }

}
