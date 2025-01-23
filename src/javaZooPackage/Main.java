package javaZooPackage;
import java.util.Scanner;

public class Main {
	   public static void main(String[] args) {
	        Tiger tigerObject1 = new Tiger();

	        Tiger tigerObject = new Tiger("Tiger");
	        Dolphin dolphinObject = new Dolphin("Dolphin");
	        Penguin penguinObject = new Penguin("Penguin");

	        // for getting input
	        Scanner keyboard = new Scanner(System.in);

	        // for loop continuation - 1 represents true
	        int continueOuterLoop = 1  ;
	        int continueInnerLoop = 1;

	        // for menu choice
	        int menuChoice = 1;

	        do {

	            switch (animalChoiceMenu(keyboard)) {
	                case 1:
	                    do {
	                        System.out.println("The animal which is chosen is : " + tigerObject.getNameOfAnimal());
	                        // get menu choice
	                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
	                        switch (menuChoice) {
	                            case 1:
	                                System.out.println("Enter weight of " + tigerObject.getNameOfAnimal());
	                                tigerObject.setWeight(keyboard.nextInt());
	                                System.out.println("Enter height of " + tigerObject.getNameOfAnimal());
	                                tigerObject.setHeight(keyboard.nextInt());
	                                System.out.println("Enter Age of " + tigerObject.getNameOfAnimal());
	                                tigerObject.setAge(keyboard.nextInt());
	                                System.out.println("Enter number of stripes:");
	                                tigerObject.setNumberOfStripes(keyboard.nextInt());
	                                System.out.println("Enter speed:");
	                                tigerObject.setSpeed(keyboard.nextInt());
	                                System.out.println("Enter sound level of roar");
	                                tigerObject.setSoundLevel(keyboard.nextInt());
	                                break;
	                            case 2:
	                                System.out.println("Weight: " + tigerObject.getWeight());
	                                System.out.println("Height: " + tigerObject.getHeight());
	                                System.out.println("Age: " + tigerObject.getAge());
	                                System.out.println("Number of stripes: " + tigerObject.getNumberOfStripes());
	                                System.out.println("Enter speed " + tigerObject.getSpeed());
	                                System.out.println("Enter sound level of roar " + tigerObject.getSoundLevel());
	                                break;
	                            case 3:
	                                tigerObject.walking();
	                                break;
	                            case 4:
	                                tigerObject.eatingCompleted();
	                                break;
	                            default:
	                                System.out.println("Not supported");

	                        }
	                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
	                        continueInnerLoop = keyboard.nextInt();
	                    } while(continueInnerLoop == 1);

	                    break;
	                case 2:
	                    do {
	                        System.out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());
	                        // get menu choice
	                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
	                        switch (menuChoice) {
	                            case 1:
	                                System.out.println("Enter weight of " + dolphinObject.getNameOfAnimal());
	                                dolphinObject.setWeight(keyboard.nextInt());
	                                System.out.println("Enter height of " + dolphinObject.getNameOfAnimal());
	                                dolphinObject.setHeight(keyboard.nextInt());
	                                System.out.println("Enter Age of " + dolphinObject.getNameOfAnimal());
	                                dolphinObject.setAge(keyboard.nextInt());
	                                System.out.println("Enter the color of " + dolphinObject.getNameOfAnimal());
	                                dolphinObject.setColor(keyboard.nextLine());
	                                System.out.println("Enter the swimming speed of " + dolphinObject.getNameOfAnimal());
	                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
	                                break;
	                            case 2:
	                                System.out.println("Weight: " + dolphinObject.getWeight());
	                                System.out.println("Height: " + dolphinObject.getHeight());
	                                System.out.println("Age: " + dolphinObject.getAge());
	                                System.out.println("Color of dolphin: " + dolphinObject.getColor());
	                                System.out.println("The swimming speed of dolphin is " + dolphinObject.getSwimmingSpeed());
	                                break;
	                            case 3:
	                                dolphinObject.swimming();
	                                break;
	                            case 4:
	                                dolphinObject.eatingCompleted();
	                                break;
	                            default:
	                                System.out.println("Not supported");

	                        }
	                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
	                        continueInnerLoop = keyboard.nextInt();
	                    } while(continueInnerLoop == 1);
	                    break;
	                case 3:
	                    do {
	                        System.out.println("The animal which is chosen is : " + penguinObject.getNameOfAnimal());
	                        // get menu choice
	                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
	                        String methodChoiced;
	                        switch (menuChoice) {
	                            case 1:
	                                System.out.println("Enter Age of " + penguinObject.getNameOfAnimal());
	                                penguinObject.setAge(keyboard.nextInt());
	                                System.out.println("Enter height of " + penguinObject.getNameOfAnimal());
	                                penguinObject.setHeight(keyboard.nextInt());
	                                System.out.println("Enter weight of " + penguinObject.getNameOfAnimal());
	                                penguinObject.setWeight(keyboard.nextInt());
	                                System.out.println("Enter walking speed of " + penguinObject.getNameOfAnimal());
	                                penguinObject.setWalkSpeed(keyboard.nextInt());
	                                System.out.println("Enter swimming speed of " + penguinObject.getNameOfAnimal());
	                                penguinObject.setSwimSpeed(keyboard.nextInt());
	                                System.out.println("Is the dolphin swimming (true/false)");
	                                penguinObject.setSwimming(keyboard.hasNext());
	                                break;
	                            case 2:
	                                System.out.println("Age: " + penguinObject.getAge());
	                                System.out.println("Height: " + penguinObject.getHeight());
	                                System.out.println("Weight: " + penguinObject.getWeight());
	                                System.out.println("Walking speed " + penguinObject.getWalkSpeed());
	                                System.out.println("Swimming speed " + penguinObject.getSwimSpeed());
	                                break;
	                            case 3:
	                                if(penguinObject.isSwimming()){
	                                    penguinObject.swimming();
	                                } else penguinObject.walking();

	                                break;
	                            case 4:
	                                penguinObject.eatingCompleted();
	                                break;
	                            default:
	                                System.out.println("Not supported");

	                        }
	                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
	                        continueInnerLoop = keyboard.nextInt();
	                    } while(continueInnerLoop == 1);

	                    break;
	                default:
	                    System.out.println("Sorry no such animal available.");
	            }

	            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
	            continueOuterLoop = keyboard.nextInt();

	        } while(continueOuterLoop == 1);
	        /** TODO 9: create a class "Penguin" from the "Animal" class **/

	        /** TODO 10: integrate the choice to pick a "penguin" in the menu system **/

	    }

	    private static int animalChoiceMenu(Scanner keyboard) {
	        int choiceGivenByUser;

	        System.out.println("******* ZOO ANIMAL choice menu ******");
	        System.out.println("1. Tiger");
	        System.out.println("2. Dolphin");
	        System.out.println("3. Penguin");

	        System.out.println("Enter choice of animal:");
	        choiceGivenByUser = keyboard.nextInt();
	        return choiceGivenByUser;
	    }

	    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
	        int choiceGivenByUser;

	        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
	        System.out.println("1. Set properties");
	        System.out.println("2. Display properties");
	        System.out.println("3. Display movement");
	        System.out.println("4. Display eating");

	        System.out.println("Enter choice (1-4):");
	        choiceGivenByUser = keyboard.nextInt();
	        return choiceGivenByUser;

	    }
}
