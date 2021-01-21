package SnakeAndLadder;

public class SnakeAndLadderProblem {
	public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;
	public static void main(String[] args) {
		System.out.println("-----------Welcome to Snake And Ladder Problem---------");
		int startingPos=0;
	    int currentPos=0;
	    int play;
	    int dice;
	    
	    System.out.println("Player is Starting at: " + startingPos);
	    while (currentPos != 100) {
	    	dice = (int) ((Math.floor(Math.random() * 10) % 6) + 1);
	    	System.out.println("Current Dice Face is: " + dice);
	    	play = (int) ((Math.floor(Math.random() * 10) % 3));
	    	switch (play) {
        		case IS_LADDER:
        			currentPos += dice;
        			break;
        		case IS_SNAKE:
        			currentPos -= dice;
        			break;
        		default:
        			currentPos+=0;
        			break;
	    	}
	    	if (currentPos == 100) {
	    		System.out.println("New Position is: " + currentPos);
                break;
            } else if (currentPos > 100) {
                currentPos -= dice;
                System.out.println("Its not valid and staying at same position.");
            } else if (currentPos < 0) {
                currentPos = startingPos; // Starting from zero again.
                System.out.println("Back to start again");
            } else {
                System.out.println("New Position is: " + currentPos);
            }
	    }
        System.out.println("You Won the Game!!!");
	}

}
