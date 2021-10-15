public class Main {

    public static void main(String[] args) {
	// write your code here
        int amountOfBricks = (int)(Math.random() * (100 - 50));
        int containerCapacity = 6;
        int containersNumber = 0;

        System.out.println("There are " + amountOfBricks + " bricks.");

        while (amountOfBricks >= containerCapacity){
            amountOfBricks -= containerCapacity;
            containersNumber++;
        }
        int remainingBricks = amountOfBricks % containerCapacity;
        System.out.println("We will have " + containersNumber + " full containers and there will be " + remainingBricks + " bricks remaining.");
    }
}
